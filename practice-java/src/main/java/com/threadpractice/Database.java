package com.threadpractice;

import java.util.Arrays;
import java.util.List;

public class Database {

	static List<Employee> employees;
	
	public static List<Employee> getEmployees(){
		employees = Arrays.asList(new Employee("ABC", 20, 2000),
				new Employee("DEF", 10, 3000));
		return employees;
	}
}
