package com.ankita.patel.addashoperators;

public class OperatorsLearning {

	public static void main(String[] args) {
		
		//-- Arithmatic operators
		// *** Unary Arithmetic Operators
		
		//		+
		//		-
		//		++
		//		--
		System.out.println("\n===unary arithmetic operators===\n");
		
		int i = 30;
		System.out.println("i = " + i);
		
		int i1 = +10;
		System.out.println("i1 = " + i1);
		
		int i2 = -10;
		System.out.println("i2 = " + i2);
		
		int i3 = ++i;
		System.out.println("i3 = " + i3);
		
		i = i + 20;
		System.out.println("Now i = " + i);
		
		int i4 = i++;
		System.out.println("i4 = " + i4);
		
		int i5 = --i;
		System.out.println("i5 = " + i5);
		
		int i6 = i--;
		System.out.println("i6 = " + i6);
		System.out.println();
		
		// *** Binary Arithmetic Operators
				
		//		+
		//		-
		//		/
		//		%
		//		*

		
		System.out.println("\n===Binary Arithmetic Operators===\n");
		
		int i7 = 10 + 1;
		System.out.println("i7 = " + i7);	// 11
		
		int i8 = i7 - 1;
		System.out.println("i8 = " + i8);	// 10
		
		int i9 = i8 / 2;
		System.out.println("i9 = " + i9);	// 5
		
		int i10 = i9 % 2;
		System.out.println("i10 = " + i10);	// 1
		
		int i11 = 5 % 10;
		System.out.println("i11 = " + i11);	// 5
		
		int i12 = i10 * 3;
		System.out.println("i12 = " + i12);	// 3
		System.out.println("Hello " + "World" + "!" + "\n");
		
		// ============ Assignment Operators
				
		//		=
		//		+=
		//		-=
		//		*=
		//		/=
		//		%=
		
		System.out.println("\n===Assignment Operators===\n");
		
		int i13 = 10;
		i13 += 2;
		System.out.println("i13 = " + i13);	// 12
		System.out.println();
		
		// ============ Relational Operators
				
		//		==
		//		!=
		//		>
		//		<
		//		>=
		//		<=
		
		System.out.println("\n===Relational Operators===\n");
		
		int i14 = 10;
		int i15 = 20;
		
		System.out.println("i14: " + i14 + "\ni15: " + i15);
		
		System.out.println("i14 == i15 : " + (i14 == i15));	// false
		System.out.println("i14 != i15 : " + (i14 != i15));	// true
		System.out.println("i14 > i15 : " + (i14 > i15));	// false
		System.out.println("i14 < i15 : " + (i14 < i15));	// true
		System.out.println("i14 >= i15 : " + (i14 >= i15));	// false
		System.out.println("i14 <= i15 : " + (i14 <= i15));	// true
		
		System.out.println();
		
		// ============ Logical Operators
				
		//		&
		//		&&
		//		|
		//		||
		//		!
		//		^
		
		System.out.println("\n===Logical Operators===\n");
		
		//System.out.println((5 / 0 == 0)); // this gives runtime exception as below. 
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		//System.out.println(false & (5 / 0 == 0) ); // gives same runtime exception
		System.out.println(false && (5 / 0 == 0) ); // false. 
		/*Now in above statement, detection of "false" happens first and because it is && operation, 
		 * Statement get finished before reaching calculation part "divide by zero". hence no excpetion.*/
		
		//System.out.println(true | (5 / 0 == 0) ); // Runtime Exception
		System.out.println(true || (5 / 0 == 0) ); // true
		/*Now in above statement, detection of "true" happens first and because it is && operation, 
		 * Statement get finished before reaching calculation part "divide by zero". hence no exception.*/
		
		System.out.println("!true = " + !true); //false
		System.out.println("true ^ true : "+ (true ^ true)); 			// false
		System.out.println("true ^ false : "+ (true ^ false));			// true
		System.out.println("false ^ true : "+ (false ^ true));			// true
				
		System.out.println();
		
		// ============ Bitwise Operators
				
		//		&
		//		|
		//		^
		//		~
		//		>>
		//		>>>
		//		<<
		
		System.out.println("\n===Bitwise Operators===\n");
		System.out.println("21 & 19 = " + (21 & 19)); // 17 : And operator
		/*
		  	1 0 1 0 1
		  &
		    1 0 0 1 1
		    ------------
		    1 0 0 0 1
		 */
		System.out.println("21 | 19 = " + (21 | 19)); // 23 : OR operator
		/*
		  	1 0 1 0 1
		  |
		    1 0 0 1 1
		    ------------
		    1 0 1 1 1
		*/
		System.out.println("21 ^ 19 = " + (21 ^ 19)); // 6 : XOR operator
		/*
		  	1 0 1 0 1
		  ^
		    1 0 0 1 1
		    ------------
		    0 0 1 1 0
		*/
		//Left shift operator 
		// x << y means x * 2 ^ y (2 having power of y)
		System.out.println("5 = " + 0b101);
		int result_leftShift = 0b101 << 1; //0b1010
		System.out.println("5 << 1 = " + (0b101 << 1));
		System.out.println("5 in binary format = " + Integer.toBinaryString(5));
		System.out.println("result in binary format = " + Integer.toBinaryString(result_leftShift));
		
		//Right shift operator
		// x >> y means x / 2 ^ y (2 having power of y)
		System.out.println("5 = " + 0b101);
		int result_rightShift = 0b101 >> 1; //0b010 = 2
		System.out.println("5 >> 1 = " + (0b101 >> 1));
		System.out.println("5 in binary format = " + Integer.toBinaryString(5));
		System.out.println("result in binary format = " + Integer.toBinaryString(result_rightShift));
		
		System.out.println("~1 = " + ~1); // NOT  1
		
		System.out.println(Integer.toBinaryString(1));		// 00000001
		System.out.println(Integer.toBinaryString(-2));		// 11111110
		// so negative number get stored as "most significant bit is enabled with 1 and other bits 
		//get stored with 2's compliment of bits. 
		System.out.println(Integer.toBinaryString(5));		// 00000101
		System.out.println(Integer.toBinaryString(-5));		// 11111011
		
		System.out.println((byte)0b11111110);				// -2
		System.out.println((byte)0b10000000);				// -128 = -(2 ^ 7)
		System.out.println((byte)0b11111111);				// -1
		System.out.println((byte)0b11000000);				// -64 = -(2 ^ 7) + (2 ^ 6) 
		
		//The Unsigned Right Shift
		/*
		 * the >> operator automatically fills the high-order bit with its previous
		 * contents each time a shift occurs. This preserves the sign of the value.
		 * 
		 * In few cases, you will generally want to shift a zero into the high-order
		 * bit no matter what its initial value was. This is known as an unsigned shift.
		 */
		int a = -1;
		int result = a >>> 24;
		/*
		Here, a is set to –1, which sets all
		32 bits to 1 in binary. This value is then shifted right 24 bits, filling the top 24 bits with zeros,
		ignoring normal sign extension. This sets a to 255. 
		
		11111111 11111111 11111111 11111111 –1 in binary as an int
		>>>24
		00000000 00000000 00000000 11111111 255 in binary as an int
		
		*/
		System.out.println("-1 stored as: " + Integer.toBinaryString(a));
		System.out.println("Result: " + result + 
				" :in Binary: " + Integer.toBinaryString(result));
		
		// ============ Ternary Operator
				
		//		(condition) ? true expression : false expression
		
		System.out.println("\n===Ternary Operator===\n");
		
		System.out.println(2 > 1 ? "2 is greater than one" : "2 is not less than one");
		System.out.println(2 < 1 ? "2 is greater than one" : "2 is not less than one");		
		
	}

}

/*
OP:
------

===unary arithmetic operators===

i = 30
i1 = 10
i2 = -10
i3 = 31
Now i = 51
i4 = 51
i5 = 51
i6 = 51


===Binary Arithmetic Operators===

i7 = 11
i8 = 10
i9 = 5
i10 = 1
i11 = 5
i12 = 3
Hello World!


===Assignment Operators===

i13 = 12


===Relational Operators===

i14: 10
i15: 20
i14 == i15 : false
i14 != i15 : true
i14 > i15 : false
i14 < i15 : true
i14 >= i15 : false
i14 <= i15 : true


===Logical Operators===

false
true
!true = false
true ^ true : false
true ^ false : true
false ^ true : true


===Bitwise Operators===

21 & 19 = 17
21 | 19 = 23
21 ^ 19 = 6
5 = 5
5 << 1 = 10
5 in binary format = 101
result in binary format = 1010
5 = 5
5 >> 1 = 2
5 in binary format = 101
result in binary format = 10
~1 = -2
1
11111111111111111111111111111110
101
11111111111111111111111111111011
-2
-128
-1
-64
-1 stored as: 11111111111111111111111111111111
Result: 255 :in Binary: 11111111

===Ternary Operator===

2 is greater than one
2 is not less than one
*/
