package com.ankita.patel.cadashcollectionframwork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public void arrayListDemo() {
		List nonGenericList = new ArrayList();
		
		//In java all classes are eventually child of "Object" class. 
		nonGenericList.add(23); // 23 is integer but internally part of "Object" class
		nonGenericList.add("Sambhar"); // "Sambhar" is string but it is child of "Object" class
		
		Object obj = nonGenericList.get(1); // you can only retrieve it with "Object" class object.
		System.out.println(obj);
		
		List<String> genericList = new ArrayList<>();
		genericList.add("dosa");
		genericList.add("uttpa");
		
		//Following statement gives compilation error: The method add(int, String) in the type List<String> is not applicable for the arguments (int)
		//genericList.add(1);
		String ele = genericList.get(0);
		System.out.println(ele);
		
	}
	/*
	OP:
	----
	Sambhar
	dosa
	*/

}
