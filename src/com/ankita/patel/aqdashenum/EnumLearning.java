package com.ankita.patel.aqdashenum;

import java.util.Scanner;

public class EnumLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		what is Enum type? - An enum type is a special data type that enables for a variable to be a
		set of predefined constants. The variable of enum type always must be
		equal to one of the values that have been predefined for it.
		*/
		
		/*
		When do we need enum types? - We need enum types to express some set of values that are not 
		infinite. You need to use enum for data sets where you know all possible values at compile
		time. For example, seasons of the year – WINTER, SPRING, SUMMER, FALL.
		*/
		
		TaskPriority taskPriority = TaskPriority.HIGH;
		
		switch(taskPriority) {
			case HIGH:
				System.out.println("Task is at high priority. Became first thing to do");
				break;
			case MEDIUM:
				System.out.println("Task is at medium priority. Need to be done asap");
				break;
			case LOW:
				System.out.println("Task is at low priority.. but dont forget it.");
				break;
		}
		
		
		//Enum constant creation runtime. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter score of your task between 1 to 30");
		int scoreOfTask = sc.nextInt();
		
		TaskPriority runtimeTask;
		if (scoreOfTask <= 10) {
			runtimeTask = TaskPriority.valueOf("LOW");
		} else if (scoreOfTask > 10 || scoreOfTask <= 20 ) {
			runtimeTask = TaskPriority.valueOf("MEDIUM");
		} else if (scoreOfTask > 20 || scoreOfTask <= 30)
			runtimeTask = TaskPriority.valueOf("HIGH");
		else
			runtimeTask = TaskPriority.valueOf("NONE");
		
		System.out.println("your task priority : " + runtimeTask);
		
			
		/*
		each enum variable has its own ordinal. 
		Here values are getting set at compile time. they 
		are listed in the strict sequence. The HIGH has zero ordinal, the MEDIUM - one 
		and the LOW - two. Taking into account each enum value has its own ordinal 
		we can easily compare them via ‘equals to’ operator. 
		*/
		
		if (runtimeTask == TaskPriority.HIGH) {
			System.out.println("We are gonna work on this task now...!!");
		}
		
		//you get enum ordinal values with .ordinal() method
		System.out.println("Ordinal of TaskPriority 'NONE' is: " + TaskPriority.NONE.ordinal());
		
		// Enum values iterations 
		
		Month[] monthCollection = Month.values();
		for ( Month val : monthCollection) {
			System.out.println("val: " + val.getDaysAmount());
		}
	}

}

/*
Task is at high priority. Became first thing to do
Enter score of your task between 1 to 30
2
your task priority : LOW
Ordinal of TaskPriority 'NONE' is: 3
val: 31
val: 28
val: 31
val: 30
val: 31
val: 30
val: 31
val: 31
val: 30
val: 31
val: 30
val: 31
*/
