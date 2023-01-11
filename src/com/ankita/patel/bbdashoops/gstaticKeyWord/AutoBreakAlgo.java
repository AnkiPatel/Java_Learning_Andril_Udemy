package com.ankita.patel.bbdashoops.gstaticKeyWord;

public class AutoBreakAlgo {
	// Java way to create constant = final static
	
	/*static means that this field exists in a single copy and final means that nobody can change the value
		of this variable after this variable was declared.
	You cannot change value of "final static" field in constructor also. 
	Once define, it never get change. 
	 */
	public final static String breakType = "Disc";
	
	private static int counter;
	
	private int id;
	
	public AutoBreakAlgo() {
		counter = getCounter() + 1;
	}
	
	public AutoBreakAlgo(int pId) {
		counter = getCounter() + 1;
		this.setId(pId);
	}
	
	public static double calculateBreakRatio() {
		return 56.78f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCounter() {
		return counter;
	}

}
