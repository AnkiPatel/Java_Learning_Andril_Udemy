package com.ankita.patel.afdashmathclass;

public class MathClassLearning {

	public static void main(String[] args) {
		System.out.println(Math.PI);  //3.141592653589793
		System.out.println(Math.max(4, 10));  //10
		System.out.println(Math.min(4, 10));  //4
		System.out.println(Math.sqrt(25));  //5.0
		double absValDouble = Math.abs(-6.7);
		System.out.println(absValDouble); //6.7
		int absValInt = Math.abs(6);
		System.out.println(absValInt); //6
		
		//Nan = "Not a number'
		//Few operation dont give normal number as result
		//MIMP NOTE : divide by zero is exception. but 
		//divide by 0.0 gives Infinity.
		
		System.out.println(Math.sqrt(-1)); //NaN
		System.out.println(0/0.0); //NaN
		System.out.println((0/0.0) + 5);  //NaN
		
		System.out.println(5/0.0);  //Infinity
		System.out.println(-5/0.0);  //-Infinity
		
		System.out.println(20.0/3.0);  //6.666666666666667
		System.out.println(Math.round(20.0/3.0));  //7
		
		//TIPS : you can take control of scale of the
		//number by multiplying and diving operations with 100.0
		System.out.println(Math.round( 20.0 * 100.0 / 3.0)/100.0); //6.67		
	
		//Random number between 0 and 1
		System.out.println(Math.random()); //0.8380542586608761
		//get random number between 0 and 100
		System.out.println((int)(Math.random()*100)); // 37
		//getting random number between 100 and 200
		int randNum = (int)(Math.random()*100 + 100); // 110
		System.out.println(randNum);
	}

}

/*
OP:
-------
3.141592653589793
10
4
5.0
6.7
6
NaN
NaN
NaN
Infinity
-Infinity
6.666666666666667
7
6.67
0.8380542586608761
37
110
*/