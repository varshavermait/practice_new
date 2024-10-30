package com.basics.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T>{

	int size = 0;
	LinkedList<T> dll = new LinkedList<>();
	
	public void push(T t)
	{
		dll.addLast(t);
	}
	
	public T pop()
	{
		return null;
	}
	
	public T peep()
	{
		return null;
	}
	
	public int getSize()
	{
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Stack.T>() {
		};
	}
	
	
	
}
