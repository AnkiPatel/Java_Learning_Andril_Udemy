package com.ankita.patel.cadashcollectionframwork;


public class ProductComparable implements Comparable<ProductComparable>{
	
	private int price;
	private String label;
	
	ProductComparable() {
		this(0,"default label");
	}
	
	ProductComparable(int pPrice , String pLabel) {
		this.price = pPrice;
		this.label = pLabel;
	}

	@Override
	public int compareTo(ProductComparable o) {
		return this.price - o.price;
	}

	@Override
	public String toString() {
		return "[price=" + price + ", label=" + label + "]";
	}	

}
