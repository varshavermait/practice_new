package com.lambdapractice;

import java.util.function.BiConsumer;

public class LambdaException {
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4};
		int k = 0;
		
		LambdaException le = new LambdaException();
		le.process(arr, k, le.wrapper((a,b) -> System.out.println(a/b)));
	}
	
	public void process(int[] arr, int k, BiConsumer<Integer, Integer> biConsumer)
	{
		for(int elm : arr)
		{
			biConsumer.accept(elm, k);
		}
	}
	
	public BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> biConsumer){
		return (t, u) ->
		{
			try {
				biConsumer.accept(t, u);
			}catch (Exception e) {
				System.out.println("Exception in process "+e);
			}
		};
	}
}
