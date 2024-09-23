//Check this link: 
//https://stackoverflow.com/questions/5614562/how-to-do-the-equivalent-of-pass-by-reference-for-primitives-in-java

package com.ankita.patel.amdashmethodspassbyvalues;

import java.util.Arrays;

public class PassByValueLearning {

	public static void main(String[] args) {
		int variableInMain = 10;
		System.out.println("Value in main function: point 1: " + variableInMain); //10
		changeIntValue(variableInMain);
		
		System.out.println("Value in main function: point 2: " + variableInMain); //10
		variableInMain = changeInt(variableInMain); // return value again getting catch in same variable
		//hence even though local values get change in function, changes are seems reflecting
		
		System.out.println("Value in main function: point 3: " + variableInMain); // 44
		
		int[] iarr = {1,2,3};
		System.out.println("Array value : point 1: " + Arrays.toString(iarr)); //[1, 2, 3]
		changeArraySecondElmValue(iarr); // Here in this method we gonna change the value of 
		//second element of array. in Java when you change the element value of array in function, it 
		//considered as pass by reference. hence caller function will also get the impact. 
		
		System.out.println("Array value : point 2: " + Arrays.toString(iarr)); // [1, 1111, 3]
		
		clearArray(iarr); // Here iarr pass as value. In this function we are not touching individual
		//elements
		System.out.println("Array value : point 3: " + Arrays.toString(iarr));  // [1, 1111, 3]
		
		
		//For user defined class, it works as pass by reference. 
		MyCheckClass newObj = new MyCheckClass();
		System.out.println("Before passing to function: " + newObj);
		workOnObject(newObj);
		System.out.println("After passing to function: " + newObj);

		//For Wrapper class, it will be pass by value
		Integer myInt = 89;
		System.out.println("myInt before passing to funciton: " + myInt);
		workOnIntObj(myInt);
		System.out.println("myInt after passing to funciton: " + myInt);


	}
	

	private static void changeIntValue(int val) {
		val += 25;
	}
	
	private static int changeInt(int val) {
		 val += 34;
		 return val;
	}

	private static void clearArray(int[] iarr) {
		iarr = null; // Here it is pass by value so no impact outside of function
		
	}

	private static void changeArraySecondElmValue(int[] iarr) {
		iarr[1] = 1111; 
		
	}
	
	private static void workOnObject(MyCheckClass pMyClassObj) {
		pMyClassObj.setName("rhea");
		pMyClassObj.setCounter(45);
		System.out.println("Inside function : " + pMyClassObj);
	}

	private static void workOnIntObj(Integer p) {
		p = 56;
	}

}

/*
OP:
----
Value in main function: point 1: 10
Value in main function: point 2: 10
Value in main function: point 3: 44
Array value : point 1: [1, 2, 3]
Array value : point 2: [1, 1111, 3]
Array value : point 3: [1, 1111, 3]
Before passing to function: MyCheckClass : counter = 10, name = phew
Inside function : MyCheckClass : counter = 45, name = rhea
After passing to function: MyCheckClass : counter = 45, name = rhea
myInt before passing to funciton: 89
myInt after passing to funciton: 89
*/
