package com.lambdapractice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String args[]) {
		List<Person> persons = Arrays.asList(new Person("ABC", "10", "ABC",2), 
				new Person("BBC", "11", "ABC", 1),
				new Person("CBC", "12", "ABC", 3));
		List<Integer> ids = Arrays.asList(1, 2);
		
		persons.stream().filter(p -> p.getFname().startsWith("A")).forEach(System.out::println);
		
		// MAP
		List<String> listFName = persons.stream().map(p -> p.getFname()).collect(Collectors.toList());
		List<String> listLName = persons.stream().map(p -> p.getLname()).collect(Collectors.toList());
		
		System.out.println("list size "+listFName.size());
		System.out.println("first elm "+listFName.get(0));
		
		
		
		List<String> combined = Stream.concat(listFName.stream(), listLName.stream()).collect(Collectors.toList());
		System.out.println("combined list size "+combined.size());
		List<List<String>> allList = Arrays.asList(listFName, listLName);
		
		//FLAT-MAP
		List<String> all = allList.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println("flat list size "+all.size());
		
		

		
		// DISTINCT
		long count = persons.stream().map(p -> p.getFname()).distinct().count();
		System.out.println("distinct count "+count);
		
		
		// Map - reduce
		Optional<String> totalAge = persons.stream().map(p -> p.getAge())
				.reduce((a, b) -> (Integer.parseInt(a) + Integer.parseInt(b))+"");
		
		System.out.println("total age "+totalAge);
		
		
		// Min
		Optional<Person> minName = persons.stream().min((p1, p2) -> p1.getFname().compareTo(p2.getFname()));
		System.out.println("min name "+minName.get().getFname());
		
		
		// get 2nd and 3rd age
		List<String> ages = persons.stream().map(p -> p.getAge()).skip(1).limit(2).collect(Collectors.toList());
		System.out.println("2nd age "+ages.get(0)+"3rd age "+ages.get(1));
		
		//get All persons which have ids in other list
		List<Person> prns = persons.stream().filter(p -> ids.stream().anyMatch(id -> p.getId() == id)).collect(Collectors.toList());
		System.out.println("1st "+prns.get(0).getFname()+" size "+prns.size());
		
		List<Person> prns1 = ids.stream().flatMap(id -> persons.stream().filter(p -> p.getId() == id)).collect(Collectors.toList());
		System.out.println("1st "+prns1.get(0).getFname()+" size "+prns1.size());
	}
	
	
}
