package com.ankita.patel.aaaaMiscTopics;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your fev word: ");
		String wrd = sc.next();
		System.out.println("you typed: " + wrd);
		System.out.println("Now enter your fev integer: ");
		int input = sc.nextInt();
		System.out.println("Your fev int is: " + input);
	}

}
