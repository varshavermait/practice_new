package com.lambdapractice;

import java.util.function.Consumer;

public class LambdaStatic {
	
	public static void main(String args[])
	{
		LambdaStatic ls = new LambdaStatic();
		
		ls.process(5, t -> { 
				System.out.println(t);
				// System.out.println(this); // as menthod where it is called is static
			}
		);
		
		ls.execute();
		
	}
	
	public void execute() {
		process(5, t -> { 
			System.out.println(t);
			System.out.println(this); // as menthod where it is called is in non-static metho
		}
	);
	}
	
	public void process(int t, Consumer<Integer> consumer) {
		consumer.accept(t);
	}
	
	@Override
	public String toString() {
		return "This is LambdaStatic class";
	}
}
