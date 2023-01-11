package com.ankita.patel.bbdashoops.hencapsulation.packageOne;

public class ClassX {

	public void takeAction() {
		System.out.println("ClassX : takeAction");
		ClassA A = new ClassA();
		// though "doSomething" protected of ClassA, ClassX is present in same package, hence
		// it is visible for ClassX.
		A.doSomething();
	}
}
