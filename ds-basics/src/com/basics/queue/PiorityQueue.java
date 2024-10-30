package com.basics.queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


//TODO cnot considered map swaps and all.
public class PiorityQueue<T extends Comparable<T>> {

	private int heapSize;
	private int heapCapacity;
	
	private List<T> heap;
	private Map<T, TreeSet<Integer>> map = new HashMap<>();
	
	public PiorityQueue() {}
	
	public PiorityQueue(int size) {
		heap = new ArrayList<>(size);
	}
	
	public PiorityQueue(T[] elm) {
		heap = new ArrayList<>(elm.length);
		heapSize = heapCapacity = elm.length;
		
		int index = 0;
		for(T t : elm)
		{
			heap.add(t);
			TreeSet<Integer> set = map.getOrDefault(t, new TreeSet<>());
			set.add(index);
			index++;
		}
		
		// below is heapify process for o(n)
		for(int i=heapSize/2-1 ; i>=0; i--)
		{
			sink(i);
		}
	}
	
	public boolean isEmpty() {
		return heapSize == 0;
	}
	
	public void clear() {
		heap = new ArrayList<>();
		heapCapacity = heapSize;
		heapSize = 0;
		map = new HashMap<>();
	}
	
	public int size() {
		return heapSize;
	}
	 
	public T peek() {
		return heap.get(heapSize);
	}
	
	public T poll() {
		T elm  = heap.get(heapSize);
		removeAt(0);
		return elm;
	}
	
	public boolean contains(T elm) {
		return (map.containsKey(elm));
	}
	
	
	//helper method
	private boolean less(int i, int j) {
		T node1 = heap.get(i);
		T node2 = heap.get(j);
		return node1.compareTo(node2) <=0;
	}
	
	//helper method
	private void swap(int i, int j)
	{
		T tmp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, tmp);
	}
	
	//bottomup node
	private void swim(int k) {
		if(k <=0 ) return;
		if(less((k-1)/2, k))
		{
			swap(k, (k-1)/2);
			swim((k-1)/2);
		}
	}
	
	//top-down node
	private void sink(int k) {
		if(k >= heapSize) return;
		int left = 2*k+1;
		int right = 2*k+2;
		
		boolean replaceLeft = less(left, right);
		if(!less(k, left) || !less(k, right))
		{
			if(replaceLeft)
			{
				swap(left, k);
				sink(left);
			}
			else
			{
				swap(right, k);
				sink(right);
			}
		}
	}
	
	public boolean remove(T elm) {
		TreeSet<Integer> list = map.get(elm);
		if(list!=null && list.size() >0)
		{
			removeAt(list.first());
			return true;
		}
		return false;
	}
	
	public boolean removeAt(int index) {
		if(index > heapSize) return false;
		if(index != heapSize)
		{
			swap(index, heapSize);
			// if index is less than parent then call swim(index)
			// else sink(index)
		}
		heap.remove(heapSize);
		heapSize--;
		return true;
	}
	
	public boolean isMinHeap(int index) {
		if(index >= heapSize) return true;
		
		int left = index*2+1;
		int right = index*2+2;
		return (less(index, left) && less(index, right) && isMinHeap(left) && isMinHeap(right));
		
	}
	
	private void mapAdd(T elm, int index)
	{
		TreeSet<Integer> list = map.getOrDefault(elm, new TreeSet<>());
		list.add(index);
		map.put(elm, list);
	}
	
	private void mapRemove(T elm, int index)
	{
		
	}
//	
//	private int mapGet(T elm)
//	{
//		
//	}
//	
//	private boolean mapSwap(T elm, int index, T elm2, int index2)
//	{
//		
//	}
	
	
}
