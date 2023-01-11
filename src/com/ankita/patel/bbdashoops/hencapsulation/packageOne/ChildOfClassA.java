package com.ankita.patel.bbdashoops.hencapsulation.packageOne;

public class ChildOfClassA extends ClassA{
	
	public void ChildClassDoSomething() {
		// Here child class do have visibility of protected member of parent class
		System.out.println("ChildOfClassA: ChildClassDoSomething");
		super.doSomething();
	}
	
	
	// below way of overriding will compilation error: Cannot reduce the visibility of the inherited method from ClassA
	/*
	@Override
	private void methodWithDefaultAM() {
		System.out.println("ChildOfClassA: methodWithDefaultAM");
	}
	*/
	
	// Below code work without compilation error as we are broadening visibility of method
	@Override
	public void methodWithDefaultAM() {
		System.out.println("ChildOfClassA: methodWithDefaultAM");
	}
}
