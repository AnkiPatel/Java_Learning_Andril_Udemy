package com.ankita.patel.cadashcollectionframwork;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public void linkedListOps() {
		
		List genericll = new LinkedList<>();
		genericll.add("abc");
		genericll.add(67);
		
		Object a = genericll.get(1);
		System.out.println(a);
		
		//Initialization with collection 
		List<Integer> colList = new LinkedList<>(Arrays.asList(45,67,12));
		
		// Internally LinkedList do have implementation of "toarray" 
		System.out.println(colList);
		
		//Iterating with each element with foreach
		for (Integer i : colList) 
			System.out.println(i);
		
		//clear the list 
		colList.clear();
		System.out.println(colList);
	}
	
	/*
	OP:
	----
	67
	[45, 67, 12]
	45
	67
	12
	[]
	*/
	

}
