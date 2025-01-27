package com.basics.array;

import java.util.Arrays;
import java.util.Iterator;

// @SuppressWarnings("unchecked")
public class DArray<T> implements Iterable<T>{
	
	private T[] arr;
	private int length;
	private int capacity;
	
	public DArray() {
		this(16);
	}
	public DArray(int capacity) {
		if(capacity < 0) throw new IllegalArgumentException("Illegal capacity "+capacity);
		this.capacity = capacity;
		this.length = 0;
		if(this.capacity == 0) this.capacity=1;
		arr = (T[]) new Object[this.capacity];
	}
	public int size() {
		return this.length;
	}
	public int capacity() {
		return this.capacity;
	}
	public boolean isEmpty() {
		return this.length==0;
	}
	public T get(int index) {
		if(index < 0 || index>=length) throw new IllegalArgumentException("Illegal index "+index);
		return arr[index];
	}
	public void clear() {
		for(int i=0; i<this.length; i++)
			arr[i] = null;
		length = 0;
	}
	public void set(T t, int index) {
		if(index < 0 || index>=length) throw new IllegalArgumentException("Illegal index "+index);
		if(index >= this.capacity) return;
		arr[index]=t;
	}
	public void add(T t)
	{
		if(this.length >= this.capacity)
		{
			if(capacity == 0) capacity=1;
			else capacity *= 2;
			T[] newArr = (T[]) new Object[capacity];
			for(int i=0; i<length; i++)
				newArr[i]=arr[i];
			this.arr = newArr;
		}
		arr[length++] = t;
	}
	
	public T removeAtIndex(int index)
	{
		if(index < 0 || index>=length) throw new IllegalArgumentException("Illegal index "+index);
		T elm = arr[index];
		T[] newArr = (T[]) new Object[length-1]; 
		for(int i=0; i<length-1; i++)
		{
			if(i<index)
				newArr[i]=arr[i];
			else
				newArr[i]=arr[i+1];
		}
		arr = newArr;
		capacity=length-1;
		return elm;
	}
	public boolean remove(Object t)
	{
		for(int i=0; i<length; i++)
		{
			if(arr[i] == t) {
				removeAtIndex(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(Object obj) {
		return indexOf(obj)!=-1; 
	}
	
	public int indexOf(Object obj) {
		for(int i=0; i<length; i++)
		{
			if(arr[i] == obj) return i;
		}
		return -1;
	}
	
	
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			int index = 0;
			@Override
			public boolean hasNext() {
				return index < length;
			}

			@Override
			public T next() {
				return arr[index++];
			}
		};
	}
	@Override
	public String toString() {
		if(length == 0) return "[]";
		else {
			StringBuilder sb = new StringBuilder(length).append("[");
			int i;
			for(i=0; i<length-1; i++)
			{
				sb.append(""+arr[i]+", ");
			}
			sb.append(""+arr[i]+" ] ");
			return sb.toString();
		}
	}
	
}
