package com.ankita.patel.agdashexpressiontype;

public class ExpressionLearning {

	public static void main(String[] args) {
		byte b = 1;
		short s = 8;
		int i = 22;
		long ln = 46;
		
		float fl = 0.89f;
		double db = 1.8d;
		
		char ch = 'v';
		
		int iExpr1 = b + b; 
		System.out.println(iExpr1);
		//byte bExpr1 = b + b; // Error: Type mismatch: cannot convert from int to byte
		
		int iExpr2 = s + s;
		System.out.println(iExpr2);
		//short sExpr2 = s + s; //Type mismatch: cannot convert from int to short
		
		int iExpr3 = b + s + i;
		System.out.println(iExpr3);
		
		long longExpr1  = i + ln; 
		System.out.println(longExpr1);
		
		float flExpr1 = fl + s;
		System.out.println(flExpr1);
		
		double dbExpr1 = i + ln + fl + db;
		System.out.println(dbExpr1);
		
		//IMP NOTE : When thre is a expression where non string primitive/values are
		// getting concated with string, it will converted in string. 
		
		System.out.println("Hello " + null); // Hello null
		System.out.println("Hello " + 1234); // Hello 1234

	}

}


/*
OP:
----
2
16
31
68
8.89
70.68999938964843
Hello null
Hello 1234
*/
