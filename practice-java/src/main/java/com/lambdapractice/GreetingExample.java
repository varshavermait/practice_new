package com.lambdapractice;

public class GreetingExample {

	public static void main(String args[]) {
		GreetingExample ge = new GreetingExample();
		ge.greet(() -> System.out.println("Hi"));
		
		
		Thread t = new Thread(() -> System.out.println("Hi"));
		t.run();
	}
	
	public void greet(Runnable runnable)
	{
		runnable.run();
	}
}
