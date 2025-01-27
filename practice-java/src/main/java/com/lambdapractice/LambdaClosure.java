package com.lambdapractice;

import java.util.function.Consumer;

public class LambdaClosure {
	
	public static void main(String args[])
	{
		LambdaClosure lc = new LambdaClosure();
		int i = 1;
		lc.process(5, a -> System.out.println(a+i));
		
		// i=2;  as this is effective final
		
	}	
	
	public void process(int i, Consumer<Integer> consumer) {
		consumer.accept(i);
	}
}


