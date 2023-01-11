package com.ankita.patel.aodashloopstatments;

public class LoopLearning {
	
	private static void simpleWhileLearning() {
		int counter = 10;
		
		while(counter > 0) {
			System.out.println("counter value: " + counter);
			counter--;
		}
		
		//Infinite loop
		//while(true) ;
	}
	
	/*
	OP:
	----	
	counter value: 10
	counter value: 9
	counter value: 8
	counter value: 7
	counter value: 6
	counter value: 5
	counter value: 4
	counter value: 3
	counter value: 2
	counter value: 1
	*/
	
	private static void doWhileLearning() {
		// use this loop when you expect piece of code should
		// execute atleast once. 
		// for example, keep listening to input stream till
		// specific keyword/sub string arrives.
		
		int i = 1;
		
		do {
			System.out.println("Value of i Before operation: "+ i);
			i *= 2;
			System.out.println("Value of i After operation: "+ i);
		} while(i< 25);	
		
		do {
			System.out.println("Value of i is already above 25");
		} while(i<25);
		
	}
	
	/*
OP:
----
Value of i After operation: 2
Value of i Before operation: 2
Value of i After operation: 4
Value of i Before operation: 4
Value of i After operation: 8
Value of i Before operation: 8
Value of i After operation: 16
Value of i Before operation: 16
Value of i After operation: 32
Value of i is already above 25
	 */

	private static void forLoopConditionLearning() {
		
		for(short i=0; i<5; i++) {
			System.out.println("i: " + i);
		}
	}
	/*
	OP:
	-----
	i: 0
	i: 1
	i: 2
	i: 3
	i: 4
	*/
	private static void forEachLoopLearning() {
		// work with collection. 
		int[] arrInt = {3,5,7};
		for (int a: arrInt) {
			System.out.println("elm : " + a);
		}
	}
	
	/*
	OP:
	----
	elm : 3
	elm : 5
	elm : 7
	*/
	
	private static void nestedLoopAndJumps() {
		System.out.println("== simple nested loop ==");
		for(int i=0; i<6; i++) {
			System.out.println("Ith value: " + i);
			for (int j=3; j>0; j--) {
				System.out.println("Jth value: " + j);
				System.out.println(" i * j : " + (i*j));
			}
		}
		
		System.out.println("== nested loop with jump==");
		
		for(int i=0; i<6; i++) {
			System.out.println("Ith value: " + i);
			// consider you dont want ith value to get increased
			// above 2
			if (i > 2)
				continue;
			for (int j=3; j>0; j--) {
				System.out.println("Jth value: " + j);
				// dont want to work for j=1
				if (j==1)
					break;
				System.out.println(" i * j : " + (i*j));
				
			}
		}
	}
	
	public static void main(String[] args) {
		//simpleWhileLearning();
		//doWhileLearning();
		//forLoopConditionLearning();
		//forEachLoopLearning();
		nestedLoopAndJumps();
	}

}

/*
OP of "nestedLoopAndJumps"
---- 
== simple nested loop ==
Ith value: 0
Jth value: 3
 i * j : 0
Jth value: 2
 i * j : 0
Jth value: 1
 i * j : 0
Ith value: 1
Jth value: 3
 i * j : 3
Jth value: 2
 i * j : 2
Jth value: 1
 i * j : 1
Ith value: 2
Jth value: 3
 i * j : 6
Jth value: 2
 i * j : 4
Jth value: 1
 i * j : 2
Ith value: 3
Jth value: 3
 i * j : 9
Jth value: 2
 i * j : 6
Jth value: 1
 i * j : 3
Ith value: 4
Jth value: 3
 i * j : 12
Jth value: 2
 i * j : 8
Jth value: 1
 i * j : 4
Ith value: 5
Jth value: 3
 i * j : 15
Jth value: 2
 i * j : 10
Jth value: 1
 i * j : 5
== nested loop with jump==
Ith value: 0
Jth value: 3
 i * j : 0
Jth value: 2
 i * j : 0
Jth value: 1
Ith value: 1
Jth value: 3
 i * j : 3
Jth value: 2
 i * j : 2
Jth value: 1
Ith value: 2
Jth value: 3
 i * j : 6
Jth value: 2
 i * j : 4
Jth value: 1
Ith value: 3
Ith value: 4
Ith value: 5
*/