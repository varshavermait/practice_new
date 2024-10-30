package com.threadpractice;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class SupplyAsyncDemo {
	public static void main(String args[])
	{
		SupplyAsyncDemo demp = new SupplyAsyncDemo();
		try {
			System.out.print(demp.printEmployees().get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("emps "+emps.size());
	}

	public CompletableFuture<Void> printEmployees() {
		System.out.println("Emps "+Database.getEmployees().size());
		System.out.println("Emps "+Database.getEmployees().get(0).getAge());
		return CompletableFuture.supplyAsync(() -> Database.getEmployees())
			.thenApply((emp) -> emp.stream().filter(e -> e.getAge()<20).collect(Collectors.toList())
				).thenAccept((emp) -> emp.forEach(e1 -> System.out.println("emp "+e1.getName())));
		// fu ture.g
		
	}
}
