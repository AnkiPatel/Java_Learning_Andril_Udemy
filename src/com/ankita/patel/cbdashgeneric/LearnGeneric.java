package com.ankita.patel.cbdashgeneric;

// When you have multiple types in your program but you also have common methods,
// you should not implement same method for each type. Use generic
// It is equivalent to templates in c++

public class LearnGeneric {

	public static void main(String[] args) {
		
//		BasicsOfGeneric basicGenricOp = new BasicsOfGeneric();
//		basicGenricOp.operationsWithDifferetType();
		
//		GenericFuncWithComparable gfuncComp =  new GenericFuncWithComparable();
//		gfuncComp.genericWitBoundedType();
		
		genericClassUseage();	
		
	}
	
	public static void genericClassUseage() {
		//Below style is used till java 1.7
		GenericClassType<Integer> intType = new GenericClassType<Integer>();
		
		//After java 1.7 you can use below style 
		GenericClassType<String> strType = new GenericClassType<>();
		
		intType.setData(24);
		System.out.println(intType.toString());
		
		strType.setData("tofu");
		System.out.println(strType.toString());
	}
	
	/*
	OP:
	-----
	Data value: 24
	Data value: tofu
	*/

}
