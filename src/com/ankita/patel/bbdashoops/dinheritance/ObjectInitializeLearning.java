package com.ankita.patel.bbdashoops.dinheritance;

class Parent {
	
	static 
	{
		System.out.println("Parent: Static Block");
	}
	
	{
		System.out.println("Parent: Initialization Block");
	}
	
	public Parent() {
		System.out.println("Parent: constructor");
	}
	
}

class Child extends Parent {
	
	static 
	{
		System.out.println("Child: Static Block");
	}
	
	{
		System.out.println("Child: Initialization Block");
	}
	
	public Child() {
		System.out.println("Child: constructor");
	}
}


public class ObjectInitializeLearning {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println("======== Stage 2 =========");
		p = new Child(); // creating another object and assigning to same reference
	}

}

/*
Explanation about output:
Static block get executed when class is getting register to JVM.
During inheritance, parent class get registered first and then child class.

After that JVM initialize parent "initialization" field first. 
And then constructor. 

Now turn for initialization block of child class comes.
and then constructor of child class

Now registration of class in JVM happen only for once hence you will not see
execution of static block more than once. 
 */

/*
OP:
----
Parent: Static Block
Child: Static Block
Parent: Initialization Block
Parent: constructor
Child: Initialization Block
Child: constructor
======== Stage 2 =========
Parent: Initialization Block
Parent: constructor
Child: Initialization Block
Child: constructor
*/