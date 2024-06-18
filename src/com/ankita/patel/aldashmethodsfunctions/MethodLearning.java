package com.ankita.patel.aldashmethodsfunctions;

public class MethodLearning {

	public static void main(String[] args) {
		
		int sum_i = sumTheNums(1,4);
		printToConsole(sum_i);
		
		double sum_d = sumTheNums(5.6,3.8);
		printToConsole(sum_d);
		

	}	
	

	private static int sumTheNums(int param1, int param2) {
		return (param1 + param2);
	}
	
	private static void printToConsole(int val) {
		System.out.println(val);
	}
	
	/*
	Method overloading is a concept that allows to declare multiple methods with same name but 
	different parameters in the same class.

	Java supports method overloading and always occur in the same class(unlike method overriding).
	
	Method overloading is one of the ways through which java supports polymorphism. 
		Polymorphism is a concept of object oriented programming that deal with multiple forms. 
	
	Method overloading can be done by 1) changing number of arguments or 2) by changing the data type of arguments.
	
	If two or more method have same name and same parameter list but differs in return type can not be overloaded.
	
	Note: Overloaded method can have different access modifiers and it does not have any significance in method overloading.
	*/
		
	//Overloaded method
	private static double sumTheNums(double param1, double param2) {
		return (param1 + param2);
	}
	
	//Overloaded method
	private static void printToConsole(double value) {
		System.out.println(value);		
	}

}
