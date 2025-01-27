package com.lambdapractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaPerson {
	public static void main(String args[])
	{
		List<Person> persons = Arrays.asList(new Person("Ram", "10", "Lal"), new Person("Shyam", "20", "Ashu"));
		LambdaPerson lp = new LambdaPerson();
		Collections.sort(persons, (p1, p2) -> p1.getLname().compareTo(p2.getLname()));
		
		lp.perfoemConditionally(persons, p -> true, p -> System.out.println(p));
		System.out.println("*******");
		lp.perfoemConditionally(persons, p -> p.getFname().startsWith("R"), p -> System.out.println(p));
		System.out.println("*******");
		lp.perfoemConditionally(persons, p -> p.getFname().startsWith("S"), p -> System.out.println(p));
		
	}
	
	private void perfoemConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer)
	{
		for(Person p : persons)
		{
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
