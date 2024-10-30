package cache;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Cache<KEY, VALUE> {

	private final Map<KEY, Record<VALUE>> map;
	private final DataSource<KEY, VALUE> ds;
	private CacheWritePolicy cacheWritePolicy;
	private ReplacementPolicy replacementPolicy;
	private final int MAX_CAPACITY = 500;
	private final int expTimeInMillis = 100; 
	private Map<AccessDetails, List<Record>> priorityQueue;
	private Map<Integer, List<Record>> expiryQueue;
	
	public Cache(DataSource<KEY, VALUE> ds, CacheWritePolicy CacheWritePolicy, 
			ReplacementPolicy replacementPolicy) {
		map = new ConcurrentHashMap<>();
		this.ds = ds;
		this.cacheWritePolicy = CacheWritePolicy;
		this.replacementPolicy = replacementPolicy;
		this.priorityQueue = new ConcurrentSkipListMap<>((first, second) -> {
				int older = (int) (first.getAccessTimeStamp() - second.getAccessTimeStamp());
				if(this.replacementPolicy.equals(ReplacementPolicy.LRU)) return older;
				else {
					return first.getCount() == second.getCount() ? older : (int)(first.getCount()-second.getCount());
				}
			});
		this.expiryQueue = new ConcurrentSkipListMap<>();
	}
	
	public CompletableFuture<VALUE> get(KEY key) {
		if(map.containsKey(key) && (map.get(key).getAccessTimeStamp() + expTimeInMillis) <= (System.currentTimeMillis() )) {
			return CompletableFuture.completedFuture(map.get(key).getValue());
		}
		else {
			return ds.get(key).thenCompose(value -> set(key, value).thenApply(__ -> value));
		}
	}
	
	public CompletableFuture<Void> set(KEY key, VALUE value) {
		Record<VALUE> record = new Record<>(value);
		if(!map.containsKey(key) && map.size() > MAX_CAPACITY) {
			if(replacementPolicy.equals(ReplacementPolicy.LRU))
			{
				
			}else {
				
			}
		}
		
		if(cacheWritePolicy.equals(CacheWritePolicy.WRITE_THROUGH)) {
			return ds.persist(key, value).thenAccept(__ -> map.put(key, record));
		}
		else {
			map.put(key, record);
			ds.persist(key, value);
			return CompletableFuture.completedFuture(null);
		}
	}
	
}
