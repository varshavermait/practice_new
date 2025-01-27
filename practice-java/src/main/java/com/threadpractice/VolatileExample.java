package com.threadpractice;

class SharedResourceVolatile {
	private  boolean flag;
	
	public void setFlag() {
		System.out.println("Setting flag");
		this.flag = true;
	}
	
	public void printIfTrue() {
		while(!flag)
		{
			System.out.println("Waiting");
		}
		System.out.println("Flag became true");
	}
}


public class VolatileExample {
	public static void main(String args[]) throws InterruptedException
	{
		SharedResourceVolatile sr = new SharedResourceVolatile();
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sr.setFlag();
		});
		Thread t2 = new Thread(() -> {
			sr.printIfTrue();
		});
		t1.start();
		t2.start();
		// t1.join();
		// t2.join();
		
	}
	
}
