package com.ankita.patel.cadashcollectionframwork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class ComparisionInCollectionDemo {
	
	private String BNL;
	private String NL;
	

	{
		BNL = ConstantsForConsole.BNL;
		NL = ConstantsForConsole.NL;
	}
	
	public void OpsWithStandardCollection() {
		// === Demo - Sorting Integers (type that implements Comparable)

		List<Integer> intList = new ArrayList<>(Arrays.asList(1,45,23,77,90,19));
		
		System.out.println(BNL + "Original list: " + NL);
		System.out.println(intList);
		
		System.out.println(BNL + "Natural order (Ascending Order)" + NL);
		intList.sort(Comparator.naturalOrder());
		System.out.println(intList);
		
		System.out.println(BNL + "Reverse order (Ascending Order)" + NL);
		intList.sort(Comparator.reverseOrder());
		System.out.println(intList);
	}
	/*
	OP:
	-----
	
	--------
	Original list: 
	--------
	[1, 45, 23, 77, 90, 19]
	
	--------
	Natural order (Ascending Order)
	--------
	[1, 19, 23, 45, 77, 90]
	
	--------
	Reverse order (Ascending Order)
	--------
	[90, 77, 45, 23, 19, 1]
	*/
	public void useOfCustomeComparableType() {
		ProductComparable p1 = new ProductComparable(50, "tea");
		ProductComparable p2 = new ProductComparable(10, "Dhaniya");
		ProductComparable p3 = new ProductComparable(32, "Sugar");
		ProductComparable p4 = new ProductComparable(62, "Milk");
		
		List<ProductComparable> pList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		
		System.out.println(BNL + "Original list: " + NL);
		System.out.println(pList);
		
		System.out.println(BNL + "Natural order (Ascending Order)" + NL);
		pList.sort(Comparator.naturalOrder());
		System.out.println(pList);		
		
	}
	/*
	OP:
	-----
	
	--------
	Original list: 
	--------
	[[price=50, label=tea], [price=10, label=Dhaniya], [price=32, label=Sugar], [price=62, label=Milk]]
	
	--------
	Natural order (Ascending Order)
	--------
	[[price=10, label=Dhaniya], [price=32, label=Sugar], [price=50, label=tea], [price=62, label=Milk]]
	*/
	
	
	/*
	 * =======================================================
	NOTE: What if we want to sort based on label here ? Natural order doesn't make sense. 
			In that case we need to implement Comparator
			
			We can implement comparator in four ways: 
			
			1) Anonymous class 
			2) Separate class 
			3) Lambda expression
			4) Method reference 
			
			TODO : Here we are addressing first two ways. 
			3rd and 4th method we will include after learning function programming
	   ==========================================================
	*/
	
	public void useOfComparator() {
		
		SimpleProduct p1 = new SimpleProduct(50, "tea");
		SimpleProduct p2 = new SimpleProduct(10, "Dhaniya");
		SimpleProduct p3 = new SimpleProduct(32, "Sugar");
		SimpleProduct p4 = new SimpleProduct(62, "Milk");
		
		List<SimpleProduct> pList = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		System.out.println(BNL + "Original list: " + NL);
		System.out.println(pList);
		
		// Method 1: Sort functionality with comparator by creating anonymous class 
		//==========================================================================
		
		pList.sort(new Comparator<SimpleProduct>() {

			@Override
			public int compare(SimpleProduct o1, SimpleProduct o2) {
				return o1.getLabel().compareTo(o2.getLabel());
			}		
			
		});
		
		System.out.println(BNL + "Sorted based on label, with help of anonymous class" + NL);
		System.out.println(pList);	
		
		// Method 2: Sort functionality with comparator by creating separate comparator class 
		//==========================================================================
		
		SimpleProduct q1 = new SimpleProduct(130, "Coffe");
		SimpleProduct q2 = new SimpleProduct(66, "Tej-patta");
		SimpleProduct q3 = new SimpleProduct(21, "Hing");
		SimpleProduct q4 = new SimpleProduct(78, "Allspice");
		
		List<SimpleProduct> qList = new ArrayList<>(Arrays.asList(q1,q2,q3,q4));
		System.out.println(BNL + "Original list: " + NL);
		System.out.println(qList);
		
		qList.sort(new SimpleProductComparator());
		System.out.println(BNL + "Sorted based on label, with help of seprate class" + NL);
		System.out.println(qList);		
		
	}
	/*	
	OP:
	-----
	
	--------
	Original list: 
	--------
	[[price=50, label=tea], [price=10, label=Dhaniya], [price=32, label=Sugar], [price=62, label=Milk]]
	
	--------
	Sorted based on label, with help of anonymous class
	--------
	[[price=10, label=Dhaniya], [price=62, label=Milk], [price=32, label=Sugar], [price=50, label=tea]]
	
	--------
	Original list: 
	--------
	[[price=130, label=Coffe], [price=66, label=Tej-patta], [price=21, label=Hing], [price=78, label=Allspice]]
	
	--------
	Sorted based on label, with help of seprate class
	--------
	[[price=78, label=Allspice], [price=130, label=Coffe], [price=21, label=Hing], [price=66, label=Tej-patta]]
	*/
}
