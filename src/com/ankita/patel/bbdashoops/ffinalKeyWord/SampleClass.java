package com.ankita.patel.bbdashoops.ffinalKeyWord;

public class SampleClass {

	public final String sampleParam = "abc";
	public final int sampleInt;
	public final char charParam;
	
	{
		sampleInt = 10;
	}
	
	public SampleClass() {
		charParam = 'd';
	}
	
	public void someClassMethod (final int param) {		
		//below statement would give error: The final local variable param cannot be assigned. 
		//It must be blank and not using a compound assignment
		//param = 89;
	}
	
	public final int someCalculation() {
		return sampleInt;
		
	}
}
