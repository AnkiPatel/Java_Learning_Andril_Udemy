package com.ankita.patel.bbdashoops.gstaticKeyWord;

//Static keyword controls variable's lifetime.

/*
static variable exists in the single copy and it belongs not to the object but to the whole class.
static fields are not connected with objects.
*/

/*
Important Note: Dynamic binding is not possible with static methods.
You can't override static methods. Use of static often considered as a bad thing and object oriented programming
During building of a class hierarchy , it is not recommended to have static methods and fields. Engineers might 
get confused that multiple objects share in similar properties, 
also sometimes static behavior and static state harder to test.

*/

// NOTE: Static import, check in "UseOfStaticImport.java" file.

public class LearnStatic {

	public static void main(String[] args) {
		
		/*
		Static binding
		The method which will be called is already known during the compilation time.
		static method or field are something which belongs to the class but not to the object.
		
		Usually to access any static entities you use class name.
		*/
		
		System.out.println(AutoBreakAlgo.getCounter()); // 0
		
		AutoBreakAlgo a1 = new AutoBreakAlgo();
		System.out.println(a1.getCounter()); //1 : Here binding is with class and not with a1 object
		
		AutoBreakAlgo a2 = new AutoBreakAlgo(34);
		System.out.println(a2.getCounter()); //2
		
		AutoBreakAlgo a3 = new AutoBreakAlgo(11);
		System.out.println(a3.getCounter()); //3

	}

}
