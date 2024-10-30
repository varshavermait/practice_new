package com.threadpractice;

class Q {
	int num;
	boolean valueSet = false;
	
	public synchronized void put(int num)
	{
		System.out.println("Valueset in put "+valueSet);
		while(valueSet)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println("pushing: "+this.num);
		valueSet = true;
		notify();
	}
	public synchronized void get() {
		System.out.println("Valueset in get "+valueSet);
		while(!valueSet)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("receivd: "+this.num);
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	
	public Producer(Q q)
	{
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}
	
	public void run() {
		int i=0;
		while(true)
		{
			q.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Consumer implements Runnable {
	Q q;
	
	public Consumer(Q q)
	{
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	
	public void run() {
		while(true)
		{
			try {
				q.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class ProducerConsumer {
	public static void main(String args[]) {
		Q q = new Q();
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);
		
	}
}
