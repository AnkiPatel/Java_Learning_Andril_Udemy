package com.ankita.patel.cadashcollectionframwork;

import java.util.Comparator;

public class SimpleProduct {
	
	private int price;
	private String label;
	
	SimpleProduct() {
		this(0,"default label");
	}
	
	SimpleProduct(int pPrice , String pLabel) {
		this.price = pPrice;
		this.label = pLabel;
	}
	
	public String getLabel() {
		return label;
	}
	
	@Override
	public String toString() {
		return "[price=" + price + ", label=" + label + "]";
	}

	/*
	 * public static void sort(Comparator<SimpleProduct> comparator) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

}
