package com.lambdapractice;

public class Person {
	private String fname;
	private String age;
	private String lname;
	private int id;
	
	public Person(String fname, String age, String lname) {
		super();
		this.fname = fname;
		this.age = age;
		this.lname = lname;
	}
	public Person(String fname, String age, String lname, int id) {
		super();
		this.fname = fname;
		this.age = age;
		this.lname = lname;
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "[ firstName "+ getFname() +" lastName "+getLname()+" age "+getAge()+"]";
		
	}
	

}
