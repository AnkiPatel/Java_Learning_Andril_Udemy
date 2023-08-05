package com.ankita.patel.cadashcollectionframwork;

public class PersonInfo {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public PersonInfo() {
		name = "Default";
		age = 10;
	}
	
	public PersonInfo(String pName, int pAge) {
		this.name = pName;
		this.age = pAge;
	}
	
	

}
