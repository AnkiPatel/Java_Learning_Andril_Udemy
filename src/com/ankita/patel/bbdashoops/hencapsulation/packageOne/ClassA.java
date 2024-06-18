package com.ankita.patel.bbdashoops.hencapsulation.packageOne;

public class ClassA {

	public void doSomethingForAll() {
		System.out.println("ClassA: Doing something for all");
	}
	
	protected void doSomething() {
		System.out.println("ClassA: Do something");
	}
	
	//default access modifiers are accessible only within the same package.
	void methodWithDefaultAM() {
		System.out.println("ClassA: methodWithDefaultAM");
	}
}
