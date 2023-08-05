package com.ankita.patel.cbdashgeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicsOfGeneric {
	
	public void operationsWithDifferetType() {
		
		List<String> strlist = new ArrayList<String>(Arrays.asList("Parotha", "Roti", "Thepla"));
		System.out.println("Printing string list special function");
		printArrayListString(strlist);
		
		List<Integer> intlist = new ArrayList<Integer>(Arrays.asList(45,22,90,78));
		System.out.println("Printing integer list special function");
		printArrayListInteger(intlist);
		
		System.out.println("string list printing with generic function");
		printArrayAllType(strlist);
		System.out.println("integer list printing with generic function");
		printArrayAllType(intlist);
		
		
	}
	
	/*	
	OP:
	-----
	Printing string list special function
	Parotha
	Roti
	Thepla
	Printing integer list special function
	45
	22
	90
	78
	string list printing with generic function
	Parotha
	Roti
	Thepla
	integer list printing with generic function
	45
	22
	90
	78
	*/
	
	public void printArrayListString(List<String> pList) {
		for (String str : pList) {
			System.out.println(str);
		}
	}
	
	public void printArrayListInteger(List<Integer> pList) {
		for (Integer i : pList) {
			System.out.println(i);
		}
	}
	
	// Generic function 
	// 'E' represent any type.
	// Instead of 'E' you can write any letter. It is just a representing the placeholder
	// Potential issue: you cannot access methods which are coming as part of "Object" class and not specific to 
	// any other type.
	// this is because compiler wouldn't know what type would be here during run time.
	public <E> void printArrayAllType(List<E> pList) {
		for(E elem: pList) {
			System.out.println(elem);
		}
		
	}

}
