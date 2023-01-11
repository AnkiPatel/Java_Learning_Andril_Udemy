package com.ankita.patel.apdashlableinjava;

public class LabelLearning {

	public static void main(String[] args) {
		
		//continue and break with label works somewhat like "goto" 
		//but it is much cleaner approach than goto.
		//unlike goto label work with loops only and not with any normal statement 

		//using goto is a bad practice thats why it is reserved keyword in java but never used.
		
		//We can use labels to break the loop marked with specific label or to continue another loop.
		
		System.out.println("=== labels ===");
		outerloop : for (int i=0; i<8; i++) {
			System.out.println("-- started with i : " + i);
			innerloop : for (int j=0; j<8; j++) {
				System.out.println("-- started with j : " + j);
				if ( j > 4) {
					System.out.println("Not processing for j > 4, moving to next i");
					break innerloop;
					
				}
				System.out.println(" i * j : " + (i*j) );
				if ((i*j) > 12) {
					System.out.println("Breaking j's loop when i*j goes beyond 12");
					continue outerloop;
				}
				int p = i*j;
				System.out.println("Value of p: " + p);
				
			}
		}
	}

}

/*
OP:
----
=== labels ===
-- started with i : 0
-- started with j : 0
 i * j : 0
Value of p: 0
-- started with j : 1
 i * j : 0
Value of p: 0
-- started with j : 2
 i * j : 0
Value of p: 0
-- started with j : 3
 i * j : 0
Value of p: 0
-- started with j : 4
 i * j : 0
Value of p: 0
-- started with j : 5
Not processing for j > 4, moving to next i
-- started with i : 1
-- started with j : 0
 i * j : 0
Value of p: 0
-- started with j : 1
 i * j : 1
Value of p: 1
-- started with j : 2
 i * j : 2
Value of p: 2
-- started with j : 3
 i * j : 3
Value of p: 3
-- started with j : 4
 i * j : 4
Value of p: 4
-- started with j : 5
Not processing for j > 4, moving to next i
-- started with i : 2
-- started with j : 0
 i * j : 0
Value of p: 0
-- started with j : 1
 i * j : 2
Value of p: 2
-- started with j : 2
 i * j : 4
Value of p: 4
-- started with j : 3
 i * j : 6
Value of p: 6
-- started with j : 4
 i * j : 8
Value of p: 8
-- started with j : 5
Not processing for j > 4, moving to next i
-- started with i : 3
-- started with j : 0
 i * j : 0
Value of p: 0
-- started with j : 1
 i * j : 3
Value of p: 3
-- started with j : 2
 i * j : 6
Value of p: 6
-- started with j : 3
 i * j : 9
Value of p: 9
-- started with j : 4
 i * j : 12
Value of p: 12
-- started with j : 5
Not processing for j > 4, moving to next i
-- started with i : 4
-- started with j : 0
 i * j : 0
Value of p: 0
-- started with j : 1
 i * j : 4
Value of p: 4
-- started with j : 2
 i * j : 8
Value of p: 8
-- started with j : 3
 i * j : 12
Value of p: 12
-- started with j : 4
 i * j : 16
Breaking j's loop when i*j goes beyond 12
-- started with i : 5
-- started with j : 0
 i * j : 0
Value of p: 0
-- started with j : 1
 i * j : 5
Value of p: 5
-- started with j : 2
 i * j : 10
Value of p: 10
-- started with j : 3
 i * j : 15
Breaking j's loop when i*j goes beyond 12
-- started with i : 6
-- started with j : 0
 i * j : 0
Value of p: 0
-- started with j : 1
 i * j : 6
Value of p: 6
-- started with j : 2
 i * j : 12
Value of p: 12
-- started with j : 3
 i * j : 18
Breaking j's loop when i*j goes beyond 12
-- started with i : 7
-- started with j : 0
 i * j : 0
Value of p: 0
-- started with j : 1
 i * j : 7
Value of p: 7
-- started with j : 2
 i * j : 14
Breaking j's loop when i*j goes beyond 12
*/