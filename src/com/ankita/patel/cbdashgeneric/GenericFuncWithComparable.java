package com.ankita.patel.cbdashgeneric;

//consider a case where you know upfront that type you are passing in generic function will be having
//implemenatiaon of comparable interface or comparator class and you need to have comparison capability in 
//your generic function. 

public class GenericFuncWithComparable {
	
	
	public void genericWitBoundedType() {
		Integer a1 = 45;
		Integer a2 = 90;
		Integer a3 = 23;
		
		Integer intResult = maxValue(a1, a2, a3);
		System.out.println("Greates interger = " + intResult);
		
		String str1 = "Java";
		String str2 = "Golang";
		String str3 = "Cplus";
		
		String strResult = maxValue(str1, str2, str3);
		System.out.println("Greatest String = " + strResult);
		
		ProductComparable p1 = new ProductComparable(45, "Tap");
		ProductComparable p2 = new ProductComparable(100, "Hammer");
		ProductComparable p3 = new ProductComparable(32, "Nail");
		
		ProductComparable presult = maxValue(p1, p2, p3);
		System.out.println("Greatest Prodcut = " + presult);
		
		
	}

	/*
	OP:
	-----
	Greates interger = 90
	Greatest String = Java
	Greatest Prodcut = [price=100, label=Hammer]
	*/
	
	
	//Function which finds greatest value among 3 values
	// with "<T extends Comparable<T>>" we say that this method should work with those types which extends the comparable
	// <T extends Comparable<T>> shows how to do upper-bounded parameterization. 
	// Reference : https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
	
	// In order to show that element suppose to extends more than one interface, uses &
	// <T extends Comparable<T> & SomeOhterInterface<T>>
	
	public <T extends Comparable<T>> T maxValue(T x, T y, T z) {
		T max = x; // assume x is initially the largest

		if (y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}

		if (z.compareTo(max) > 0) {
			max = z; // z is the largest now
		}
		return max; // returns the largest object
	}

}
