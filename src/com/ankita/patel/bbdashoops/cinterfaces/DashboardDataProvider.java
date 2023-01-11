package com.ankita.patel.bbdashoops.cinterfaces;

public interface DashboardDataProvider {
	
	/*
	Interface can have constants
	if you define as "int RETRY_CONNECTION_ATTEMPT = 6" , Internally it will be same as
	"public static final int RETRY_CONNECTION_ATTEMPT = 6" 
	*/
	int RETRY_CONNECTION_ATTEMPT = 6;
	
	//"currentValue" is an abstract method. 
	//In interface, by default method's access specifier are "public abstract". 
	//Hence all methods are abstract method in interface.
	
	public abstract void connect();
	double currentValue(); // same as public abstract double currentValue()
	
	
	//Default methods are methods that have body 
	//so you can treat them like regular methods in concrete class.
	default void checkRefreashRate() {
		System.out.println("Checking refreash rate");
	}
	
	//Interface also can have static method. But it is not "good object oriented approach"
	static void someStaticFunctionality() {
		System.out.println("Some static functionality");
	}

}
