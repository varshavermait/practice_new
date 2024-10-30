package com.threadpractice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class RunAsyncDemo {
	
	public static void main(String args[]) {
		
		RunAsyncDemo rad = new RunAsyncDemo();
		try {
			rad.demo();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void demo() throws InterruptedException, ExecutionException {
		CompletableFuture<Void> f = CompletableFuture.runAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi");
			});
		
		f.get();
		f.toCompletableFuture();
		System.out.println("Hasdsadi");
		
	}
}
