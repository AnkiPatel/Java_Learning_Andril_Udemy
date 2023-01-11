package com.ankita.patel.abdashnumbersystems;

public class NumberSystem {

	public static void main(String[] args) {
		int dec = 152; 			// No prefix --> decimal literal
		int bin = 0b10011000; 	//'0b' prefix --> binary literal
		int oct = 0230; 		//'0' prefix --> octal literal
		int hex = 0x98;			// '0x' prefix --> hexadecimal literal 
		
		System.out.println("dec: " + dec);
		System.out.println("bin: " + bin);
		System.out.println("oct: " + oct);
		System.out.println("hex: " + hex);
		
	}

}

/*
 OP:
 ----
dec: 152
bin: 152
oct: 152
hex: 152
 */
