package com.ankita.patel.amdashmethodspassbyvalues;

public class MyCheckClass {
	
	private int counter;
	private String name;
	
	public MyCheckClass() {
		setCounter(10);
		setName("phew");
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MyCheckClass : counter = " + counter + ", "
		+ "name = " + name ;
	}

}
