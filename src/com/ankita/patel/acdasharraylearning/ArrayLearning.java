package com.ankita.patel.acdasharraylearning;

import java.util.Arrays; //for sort and printing array

public class ArrayLearning {

	public static void main(String[] args) {
		
		
		//Way of declaration 
		int arryOne[]; // C++ style way
		int[] arraytwo[]; // preferable way
		//In c++, you normally create array on stack.. hence with declaration you 
		// gives size of array. 
		// int test_scores [5] {23,56,24,56,89};

		
		arryOne = new int[10]; // initialization with default value of int which is 0
		int arryOne_lenght = arryOne.length; // way to find the length of array.
		System.out.println(arryOne_lenght);
		
		//in c++ you find the lenght in following way
		/*
		int someArray [] {78,45,23,67,45,67};
	    int len_someArray = sizeof(someArray)/sizeof(int); //IMP: Here we are determining length of the array
	    */
		
		double[] doubleArrayOne = new double[5]; // declaration and initialization with default double value which is 0.0
		System.out.println(doubleArrayOne[0]);
		
		//Below instruction gives "index out of bound exception when trying to access invalid element
		//java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
		//System.out.println(doubleArrayOne[7]); 
		
		boolean[] boolArrayOne = new boolean[3]; //// declaration and initialization with default boolean value which is 'false'
		System.out.println(boolArrayOne[2]); 
		
		//Array literals
		int[] arrayThree = {3,2,1};
		/*The above statement creates an array of int data types containing 3 elements. Here, we:

			Created an array object without using new keyword.
			Didn’t specify the type of the array.
			Didn’t explicitly specify the length of the array object.
		*/
		System.out.println(arrayThree[1]);
		
		//Multi dimensional arrays
		int[][] mdArrayOne = {
				{3,6,2},
				{77,2,9}
		};
		//array[i][j] : i for row and j for column
		System.out.println("1st row: " + mdArrayOne[0]);
		System.out.println("3rd element of last row: " + mdArrayOne[mdArrayOne.length-1][2]);
		
		/*Array in java are reference type and not the primitive type. Default value would be null.
		all arrays in mdArrayTwo below are not instantiated yet and there is no array object in memory.
		*/
		int[][] mdArrayTwo = new int[5][];
		System.out.println("mdArrayTwo[0]: " + mdArrayTwo[0]); // this gives the address
		
		
		//Special facility java util "Arrays" in java to with Array
		//1 Print Array
		//2 Sort Array
		int[] arryFour = {45,23,78};
		System.out.println(Arrays.toString(arryFour));
		
		Arrays.sort(arryFour);
		System.out.println("After sort" + Arrays.toString(arryFour));
	}

}
