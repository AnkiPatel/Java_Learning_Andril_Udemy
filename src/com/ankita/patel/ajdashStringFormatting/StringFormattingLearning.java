package com.ankita.patel.ajdashStringFormatting;

public class StringFormattingLearning {

	public static void main(String[] args) {
		System.out.println("===String formatting===\n");
		
		String firstname = "Sakura";
		String lastname = "Sohoni"; 
		
		String greetingTamplate = "Hi %s %s, good %s";
		
		String noonGreeting = "afternoon";
		
		//Way 1: use of "format" function of string class.
		String finalStr = String.format(greetingTamplate,firstname,lastname,noonGreeting);
		System.out.println(finalStr);
		
		//Way 2: While directly printing on std out. 
		System.out.printf(greetingTamplate, "Nithya", "sukumar", "night");
		
	}

}

/*
 OP
 -----
===String formatting===

Hi Sakura Sohoni, good afternoon
Hi Nithya sukumar, good night
*/
