package com.ankita.patel.aidashstringmethods;

import java.util.Arrays;

public class StringMethodsLearning {

	public static void main(String[] args) {
		System.out.println("===String methods===\n");
		String s = "  \tnayantara  ";
		System.out.println("Original string: " + s);
		
		//Length of the the string
		int len = s.length();
		System.out.println("s.length() : " + len);
		
		//check if it has given substring
		boolean doStringHas = s.contains("ant");
		System.out.println("s.contains(\"ant\") : " + doStringHas);
		
		//check if string is empty
		boolean isEmptyString = s.isEmpty();
		System.out.println("s.isEmpty() : " + isEmptyString);
		
		boolean isStartWith = s.startsWith(" ");
		System.out.println("s.startsWith(\" \") : " + isStartWith);
		
		boolean isEndWith = s.endsWith("f");
		System.out.println("s.endsWith(\"f\") : " + isEndWith);
		
		/* MIMP : String object are immutable not matter how many time you perform string operations. 
		 * Hence String manipulation operations create new object of string and returns reference of it. 
		 * immutable object as pros and cons
		 */
		
		
		String result = null;
		
		//Convert to uppercase
		result = s.toUpperCase();
		System.out.println("s.toUpperCase() : " + result);
		
		//Convert to lowercase
		result = s.toLowerCase();
		System.out.println("s.toLowerCase() : " + result);
		
		//Replace char/patters
		result = s.replace("nayan","maha");
		System.out.println("s.replace(\"nayan\",\"maha\") : " + result);
		
		
		//Remove leading or trailing spaces.
		result = s.trim();
		System.out.println("s.trim() : " + result);
		
		/*
		 * "strip" method started from jdk 11. for older than jdk 11, use trip method. 
		 * "strip" method used to remove any kind of whitespace (not only the space).
		 */
		result = s.strip();
		System.out.println("s.strip() : " + result);
		
		/*
		 * here "substring" method is same as c++ substring method. it takes starting index inclusively and
		 * and to (end index) index exclusively
		 */
		result = s.substring(4,7);
		System.out.println("s.substring(4,7) : " + result);
		
		
		//convert string as array of bytes with "Arrays" utility class
		byte []byteArray = s.getBytes();
		System.out.println("s.getBytes() gave array at reference: " + byteArray + " : " + Arrays.toString(byteArray));
		
		//convert string into array of character with "Arrays" utility class
		char []charArray = s.toCharArray();		
		System.out.println("s.toCharArray() gave array at reference: " + charArray +  " : " + Arrays.toString(charArray));
		
		
		//access individual element
		char c = s.charAt(6);
		System.out.println("At 6th index, char is : " + c);
		
		//split with help of specific character and get result as array of string.
		String[] strArray = s.split("a");
		System.out.println("string array as result : " + Arrays.toString(strArray));
		
		System.out.println("===String comparison===");
		String s1 = "Hello";
		String s2 = "Hello";
		
		String s3 = new String("Hello");
		/* ===
		 * java also maintain pool of strings same way it maintains pool of integers. 
		 * When you are using string literal in the program – the string is added to pool of strings. 
		 * And the next time you are using the same string literal, Java checks whether such string 
		 * already exist in String pool.If yes, then java returns reference to the object that is 
		 * already in heap memory instead of creating new one. 
		 * On the other hand, when you are using ‘new’ keyword – you say Java to allocate memory and 
		 * to create new object in heap. Taking into account we used string literal when initialized 's' 
		 * variable and s2 variable, these two variables are referring to the same object in pool of 
		 * strings.
		 */
		boolean isSameStr = (s1 == s2); //true
		System.out.println("(s1 == s2) : " + isSameStr);
		
		isSameStr = (s1 == s3); //false
		System.out.println("(s1 == s3) : " + isSameStr);
		
		boolean isEqualStr = s1.equals(s3);
		System.out.println("s1.equals(s3) : " + isEqualStr);
		
		//Understand about string's intern method. 
		/*Intern method put s3 string in the String pool, and return the reference to the 
		 * object in String pool. That’s why in this case you will compare references to the 
		 * same object. Because such string already exists in the String pool. And you 
		 * will get true as a result here.
		 * */
		isEqualStr = (s1 == s3.intern());
		System.out.println("(s1 == s3.intern()) : " + isEqualStr);
		
		String str1 = "Action";
		String str2 = "action";
		
		isEqualStr = str1.equals(str2); // false
		System.out.println("str1.equals(str2) : " + isEqualStr);
		
		isEqualStr = str1.equalsIgnoreCase(str2); // true
		System.out.println("str1.equalsIgnoreCase(str2) : " + isEqualStr);

	}

}

/*
OP:
-----
===String methods===

Original string:   	nayantara  
s.length() : 14
s.contains("ant") : true
s.isEmpty() : false
s.startsWith(" ") : true
s.endsWith("f") : false
s.toUpperCase() :   	NAYANTARA  
s.toLowerCase() :   	nayantara  
s.replace("nayan","maha") :   	mahatara  
s.trim() : nayantara
s.strip() : nayantara
s.substring(4,7) : aya
s.getBytes() gave array at reference: [B@379619aa : [32, 32, 9, 110, 97, 121, 97, 110, 116, 97, 114, 97, 32, 32]
s.toCharArray() gave array at reference: [C@cac736f : [ ,  , 	, n, a, y, a, n, t, a, r, a,  ,  ]
At 6th index, char is : a
string array as result : [  	n, y, nt, r,   ]
===String comparison===
(s1 == s2) : true
(s1 == s3) : false
s1.equals(s3) : true
(s1 == s3.intern()) : true
str1.equals(str2) : false
str1.equalsIgnoreCase(str2) : true
*/