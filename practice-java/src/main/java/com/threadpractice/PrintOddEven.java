package com.threadpractice;

public class PrintOddEven implements Runnable {
	static int i=1;
	private Object obj;
	public PrintOddEven(Object obj)
	{
		this.obj = obj;
	}
	public void run() {
		while(i<10)
		{
			if(i%2 == 0 && Thread.currentThread().getName().equals("even"))
			{
				synchronized(obj)
				{
					System.out.println(" "+i);
					i++;
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		
		
			if(i%2 != 0 && Thread.currentThread().getName().equals("odd"))
			{
				synchronized(obj)
				{
					System.out.println(" "+i);
					i++;
					obj.notify();;
				}
				
			}
		}
	}
	
	public static void main(String args[]) {
		Object obj = new Object();
		Runnable r1 = new PrintOddEven(obj);
		Runnable r2 = new PrintOddEven(obj);
		Thread t1 = new Thread(r1);
		t1.setName("odd");
		Thread t2 = new Thread(r2);
		t2.setName("even");
		t2.start();
		t1.start();
		
	}
}
