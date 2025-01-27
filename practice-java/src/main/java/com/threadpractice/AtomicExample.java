package com.threadpractice;

import java.util.concurrent.atomic.AtomicInteger;

class SharedResource {
	private AtomicInteger num;
	
	public SharedResource(int num)
	{
		this.num = new AtomicInteger(num);
	}
	public void increment() {
		this.num.incrementAndGet();
	}
	
	public int get() {
		return this.num.get();
	}
}



public class AtomicExample {

	public static void main(String args[]) throws InterruptedException {
		SharedResource sr = new SharedResource(0);
		
		Thread t1 = new Thread(() -> {
			for(int i=0; i<50; i++)
				sr.increment();
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=0; i<50; i++)
				sr.increment();
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(sr.get());
	}
}
