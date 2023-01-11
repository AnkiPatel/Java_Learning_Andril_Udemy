package com.ankita.patel.aaaaMiscTopics;

public class VariableLengthArguments {

	public static void main(String[] args) { // here also args are variable length 
		//Other way to declare is 'public static void main(String... args)
		
		System.out.println(doSum(10,45));
		System.out.println(doSum(34,22,67,8,45));
		System.out.println(doSum("checking is the reason", 44,3,2,5,78));
			
		//Method which has variable length argument needs special attention. 
		//in parameter list, the parameter which has variable length should always be last. 
		
	}
	
	private static int doSum(int var1, int var2) {
		return var1 + var2;
	}
	
	private static int doSum(int... vars) {
		int sum = 0;
		for (int v : vars) {
			sum += v;
		}
		return sum;
	}
	
	private static int doSum(String message, int... vars) {
		System.out.println(message);
		int sum = 0;
		for (int v : vars) {
			sum += v;
		}
		return sum;
	}
	
	
	//Below declaration gives compile time error: The variable argument type int 
	//of the method doSum must be the last parameter
	//private static int doSum(int... vars, String message) {}

}


/*
 OP:
----
55
176
checking is the reason
132
 */