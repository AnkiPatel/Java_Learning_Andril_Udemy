package com.ankita.patel.bbdashoops.gstaticKeyWord;

// Normal way to import 
//import java.util.Arrays;

// use "import static ..... " when you want to import all static entities 
// that exist in this class which includes methods and fields.
import static java.util.Arrays.*;

public class UseOfStaticImport {

	private int[] myArray = {23,56,11,2,89,67};
	
	/*
	public void doOp() {
		// Here we are using static method of class array
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
	}
	*/
	
	public void doOpTwo() {
		sort(myArray); // it is same function which we call with Arrays.sort()	
	}
}
