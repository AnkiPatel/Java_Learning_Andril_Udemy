package com.ankita.patel.aadashprimitives;

public class PrimitiveTypes {

	public static void main(String[] args) {
		byte b = 5;
		System.out.println("b: " + b);
		
		short s;
		s = 3;
		System.out.println("s: " + s);
		
		int i = 56;
		System.out.println("i: " + i);
		
		long l1 = 4L; 
		long l2 = 2_000_000_000l;
		System.out.println("l1: " + l1 + "," + "l2: " + l2);
		
		char c = 'r';
		System.out.println("c: " + c );
		
		boolean flag = false;
		System.out.println("flag: " + flag);
		
		float f1 = 1.4F;
		float f2 = 3.8f;

		System.out.println("f1: " + f1 + "," + "f2: " + f2);
		
		var v1 = "a";
		//v1 = 5; // This will give compiler error.. to V1 you can assign only integer
		var v2 = 4.5;
		System.out.println("v1: " + v1 + "," + "v2: " + v2);
		
		//Implicit conversion 
		int iOne = s; //s is short type.. lesser size than int. so implicit conversion will work
		System.out.println("iOne: " + iOne);
		
		char cOne = 2178; // will assign char which has unicode value 2176
		System.out.println("cOne: " + cOne);
		
		
		//narrowing conversion : assigning bigger sized variable's value to lower sized variable.
		//byte bTwo = iOne; // gives compiler error
		byte bTwo = (byte)iOne;
		System.out.println("bTwo: " + bTwo);
		
		byte bThree = (byte)10000; // This will create overflow.
		System.out.println("bThree: " + bThree);
		
		byte bFour = (byte)128; // This will create overflow. Maximum it can hold is 127
		System.out.println("bFour: " + bFour);
		
		//Autoboxing and unboxing 
		//Autoboxing :  java do this for automatic conversation between primitive type to wrapper class
		
		Integer i4 = 122; 
		System.out.println("Integer i4: " + i4);
		
		//Unboxing : extracting value form wrapper class to primitive type.
		int i5 = i4;
		System.out.println("i5: " + i5);
		
		
	}
	
	/*
OP:
-----
b: 5
s: 3
i: 56
l1: 4,l2: 2000000000
c: r
flag: false
f1: 1.4,f2: 3.8
v1: a,v2: 4.5
iOne: 3
cOne: ࢂ
bTwo: 3
bThree: 16
bFour: -128
Integer i4: 122
i5: 122
*/

}
