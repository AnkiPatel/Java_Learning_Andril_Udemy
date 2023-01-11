package com.ankita.patel.bbdashoops.bclasstypes.bnestedclass;


/*
Nested classes can be static and non static. "Non static classes" often called inner classes.
Nested class are those template which will not make sense if they are outside of it's holder class. 
Example if "Student" class dont have any accumulated marks "score" class dont need to be having value. 
	Otherwise "score" will be important property of "student" class
 */


public class LearningNestedClass {
	public static void main(String[] args) {
		SomeCar car1 = new SomeCar();
		System.out.println("car1: \n" + car1);
		
		//static nested class's object creation outside of master class.
		//Here name of the outer class is enough to access static nested class along with "."
		SomeCar.Tyre tyre = new SomeCar.Tyre();
		System.out.println("tyre: \n" + tyre);
		
		//inner class's object creation
		//You need to have object of outerclass unlike static nested class
		SomeCar.ColorScheme colSch = new SomeCar().new ColorScheme();
		System.out.println("colSch: " + colSch);
		
	}
}
