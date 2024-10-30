package com.basics.array;

import java.util.Iterator;

public class TestArray {
	
	public static void main(String args[]) {
		DArray<Integer> dArray = new DArray<>(2);
		System.out.println("length" +dArray.size());
		System.out.println("capacity "+dArray.capacity());
		dArray.add(1);
		System.out.println("length" +dArray.size());
		System.out.println("capacity "+dArray.capacity());
		
		dArray.add(2);
		dArray.add(3);
		dArray.add(4);
		System.out.println("length" +dArray.size());
		System.out.println("capacity "+dArray.capacity());
		dArray.add(5);
		System.out.println("length" +dArray.size());
		System.out.println("capacity "+dArray.capacity());
		
		
		Iterator itr = dArray.iterator();
		while(itr.hasNext())
		{
			System.out.println("Next elm is "+itr.next());
		}
	}
}
