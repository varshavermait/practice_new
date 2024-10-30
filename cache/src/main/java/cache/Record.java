package cache;

public class Record<VALUE> implements Comparable<Record<VALUE>>{
	private VALUE value;
	private long loadTimeStamp;
	private AccessDetails accessDetails;
	
	public Record() {}
	public Record(VALUE value) {
		this.value = value;
	}
	
	public VALUE getValue() {
		return value;
	}
	public void setValue(VALUE value) {
		this.value = value;
	}
	public long getLoadTimeStamp() {
		return loadTimeStamp;
	}
	public void setLoadTimeStamp(long loadTimeStamp) {
		this.loadTimeStamp = loadTimeStamp;
	}
	public AccessDetails getAccessDetails() {
		return accessDetails;
	}
	public void setAccessDetails(AccessDetails accessDetails) {
		this.accessDetails = accessDetails;
	}
	@Override
	public int compareTo(Record<VALUE> o) {
		return (int)(o.accessDetails.getAccessTimeStamp() - this.accessDetails.getAccessTimeStamp());
	}
	
	
}
