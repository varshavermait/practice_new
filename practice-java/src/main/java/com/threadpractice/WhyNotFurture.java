package com.threadpractice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WhyNotFurture {
	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(10);
		Future<List<Integer>> future = es.submit(()->{
			System.out.println("executing ");
			TimeUnit.SECONDS.sleep(10);
			return Arrays.asList(1,2);
		});
		try {
			List<Integer> list = future.get();
			
			// Can't forcefully complete the future unlike completableFuture.complete
			// can't chain future // future.
			// can't merge future results
			// Exception handling is difficult
			
			System.out.println("size "+list.size());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
