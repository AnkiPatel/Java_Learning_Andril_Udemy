package com.ankita.patel.akdashregularexpression;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionLearning {

	public static void main(String[] args) {
		System.out.println("===== Regular expressions =====");
		System.out.println();
		
		String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
		Pattern p = Pattern.compile(gmailPattern);
		String sampleText = "Some random text that contains gmail addresses "
				+ "like this one some-email@gmail.com. And some other random text.";
		Matcher m = p.matcher(sampleText);
		
		m.find();
		String gmailAddress = m.group();
		System.out.println(gmailAddress);
		
		String sampleText2 = "There are three sentences in this string. Are you sure? Yes!";
		String[] sentences = sampleText2.split("[\\.!?]"); //telling compiler to split all 
		//those words where it detects '.' or '!' or '?'
		System.out.println(Arrays.toString(sentences));
	}

}

/*
 OP
 ----
===== Regular expressions =====

some-email@gmail.com
[There are three sentences in this string,  Are you sure,  Yes]
*/
