package com.threadpractice;

class Counter {
	static int count = 1;
	public Counter() {
	} 
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
}

public class RaceConditionTest {
	
	
	
	public static void main(String args[]) throws InterruptedException {
	
		Counter counter = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i=0; i<1000000; i++) counter.increment();
		});
		Thread t2 = new Thread(() -> {
			for(int i=0; i<1000000; i++) counter.increment();
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.print("count "+counter.getCount());
		
	}
	
	
}
