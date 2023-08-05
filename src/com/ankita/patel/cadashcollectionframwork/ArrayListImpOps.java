package com.ankita.patel.cadashcollectionframwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListImpOps {
	
	private String BNL;
	private String NL;
	

	{
		BNL = ConstantsForConsole.BNL;
		NL = ConstantsForConsole.NL;
	}
	
	
	public void initStyles() {
		//ArrayList arr = new ArrayList(); 
		
		//Non-generic way of list creation
		List list1 = new ArrayList();
		list1.add("Five");
		list1.add(5);
		list1.add(5.5);
		
		System.out.println(BNL + "Non Generic way" + NL);
		
		for (Object j : list1) {
			System.out.println(j);
		}
		//===========================
		//Generic way without size
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(5);
		al1.add(77);
		al1.add(34);
		
		System.out.println(BNL + "Generic way without size " + NL);
		
		for (Integer j : al1) {
			System.out.println(j);
		}	
		
		//=============================
		//Generic way with size
		int len = 4;
		ArrayList<Integer> al2 = new ArrayList<>(len);
		//Above is same as ArrayList<Integer> al2 = new ArrayList<Integer>(len);
		
		for (int i = 0; i<len; i++) {
			al2.add(i+10);
		}
		
		System.out.println(BNL + "Generic way with size " + NL);
		
		for (Integer j : al2) {
			System.out.println(j);
		}
		
		//==============================
		//Initialize from collection 
		ArrayList<Integer> alc1 = new ArrayList<>(Arrays.asList(45,67,12));
		//above is same as ArrayList<Integer> alc1 = new ArrayList<Integer>(Arrays.asList(45,67,12));
		System.out.println(BNL + "Generic way - From arrays " + NL);
		
		for (Integer j : alc1) {
			System.out.println(j);
		}
		
		//==============================
		//Initialization with othe ArrayList
		ArrayList<Integer> alc2 = new ArrayList<>(alc1);
		// above is same as ArrayList<Integer> alc2 = new ArrayList<Integer>(alc1);
		alc2.add(88);
		alc2.add(28);
		alc2.add(50);
		System.out.println(BNL + "Generic way - From ArrayList + own element " + NL);
		
		for (Integer j : alc2) {
			System.out.println(j);
		}
		
		//==============================
		//Initialization with collection ncopy
		ArrayList<Integer> alc3 = new ArrayList<>(Collections.nCopies(10,10));
		System.out.println(BNL + "Generic way - Collection nCopies " + NL);
		
		for (Integer j : alc3) {
			System.out.println(j);
		}
		
	}

	/*
	OP:
		
		
	--------
	Non Generic way
	--------
	Five
	5
	5.5
	
	--------
	Generic way without size 
	--------
	5
	77
	34
	
	--------
	Generic way with size 
	--------
	10
	11
	12
	13
	
	--------
	Generic way - From arrays 
	--------
	45
	67
	12
	
	--------
	Generic way - From ArrayList + own element 
	--------
	45
	67
	12
	88
	28
	50
	*/
	
	public void printOnConsoleArrayList() {
		List<Integer> intList = new ArrayList<>(Arrays.asList(45,67,12));

		System.out.println(BNL + "print with .toString call on Arraylist " + NL);		
		System.out.println(intList.toString());
		
		System.out.println(BNL + "print with direct passing to sysout " + NL);
		System.out.println(intList);
		
		
	}

}
