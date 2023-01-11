package com.ankita.patel.ahdashprimitiveandreference;

import java.util.Arrays;

public class PrimitiveAndReferenceMemoryModel {

	public static void main(String[] args) {
		
	System.out.println("65 == 'A' : " + (65 == 'A')); // True as 'A''s ASCII value is 65
		
	int int1 = 567;
	int int2 = 567;
	
	System.out.println("int1 == int2 : " + (int1 == int2)); // true
	
	Integer int3 = 567;
	Integer int4 = 567;
	
	System.out.println("int3 == int4: " + (int3 == int4)); //false 
	// Integer is a class.. it is reference type. 
	// So in heap both will be pointing to completely different memory location. Hence they are not same and
	// here result is false
	
	Integer int5 = 10;
	Integer int6 = 10;
	System.out.println("int5 == int6: " + (int5 == int6)); // true. 
	// It shows contradiction with above note because of concept of Integer value pool in java.		
	//Integer value pool concept: Integers objects with values in range between -128 to 127,
	//are cached and reused hence preventing creation of a new object instance 
	//each time a new Integer within that range is created.
		
	
	/*
	Integer(<integer value>) is deprecated constructor starting from Java version 9.	
	This means from Java version nine, It is not recommended way to create integer objects 
	with this constructor.*/
	// Here using just to explain the fundamentals
		
	Integer int7 = new Integer(10);
	Integer int8 = new Integer(10);
	System.out.println("int7 == int8 : " + (int7 == int8)); //false. 
	// Now in spite of 10 is eligible value to be part of Integer pool, here we are telling compiler to 
	// create totally different object on heap with value 10. So bother references int7 and int8 are pointing
	// to different memory. Hence comparison shows false. 
	
	//Correct way to call constructor which respect the Integer pool is "valueOf"
	Integer int9 = Integer.valueOf(15);
	Integer int10 = Integer.valueOf(15);
	System.out.println("int9 == int10 : " + (int9 == int10)); // true
	
			
	// All reference type as "equals" method to do object comparison
	// In c++, you should overload == operator for object comparison
	// Underneath, even each in build class of java has implemented own version of "equals" method
	Integer int11 = 232;
	Integer int12 = 232;
	System.out.println("int11.equals(int12): " + int3.equals(int4)); // True
	System.out.println("int3.equals(int4): " + int3.equals(int4)); //True
		
	
		
	int[] arr1 = {1, 2, 3};
	int[] arr2 = {1, 2, 3};
	
	System.out.println("arr1 == arr2 : " + (arr1 == arr2)); // false
	System.out.println("arr1.equals(arr2) : " + (arr1.equals(arr2))); //false
	// Arrays are reference type but for it "equals" method is not suitable because it is just comparing 
	// Reference (i would say addresses number...see the implementation in "Objects.class" in jdk) and not the element by elemnt
	// "Arrays" utility class helps here.. do array comparison with Arrays.equals
	System.out.println("Arrays.equals(arr1, arr2) : " + Arrays.equals(arr1, arr2)); // true
	
	arr1 = arr2;
	System.out.println(arr1 == arr2); // true;
	// Here we are making both references to point same heap location hence == will gives true
		
	}

}

/*
OP:
----
65 == 'A' : true
int1 == int2 : true
int3 == int4: false
int5 == int6: true
int7 == int8 : false
int9 == int10 : true
int11.equals(int12): true
int3.equals(int4): true
arr1 == arr2 : false
arr1.equals(arr2) : false
Arrays.equals(arr1, arr2) : true
true
*/
