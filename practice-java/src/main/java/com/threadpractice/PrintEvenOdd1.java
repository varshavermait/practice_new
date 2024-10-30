package com.threadpractice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintEvenOdd1 {
	
	public static void main(String args[])
	{
		PrintEvenOdd1 ped = new PrintEvenOdd1();
		ped.printEvenOdd();
		
		///System.out.println("Completed");
	}
	public void printEvenOdd() {
		ExecutorService es = Executors.newFixedThreadPool(1);
		ExecutorService e1 = Executors.newFixedThreadPool(1);
		
		IntStream.range(1, 11).forEach(num -> 
			{
				CompletableFuture<Integer> eCF = CompletableFuture.completedFuture(num)
						.thenApplyAsync(n -> {
							// if(n %2==0)
							System.out.println(n +"   Thread "+Thread.currentThread().getName());
							return n;
						}, es);
				eCF.join();
				for(int i=0; i<10000000; i++)
				{
					int j = 1+2;
				}
				
				CompletableFuture<Integer> oCF = CompletableFuture.completedFuture(num)
						.thenApplyAsync(n -> {
							// if(n %2!=0)
							System.out.println(n +"   Thread "+Thread.currentThread().getName());
							return n;
						}, e1);
				// eCF.join();
				oCF.join();
				
				
				System.out.println("Done2");
			});
		es.shutdown();
	}
}
