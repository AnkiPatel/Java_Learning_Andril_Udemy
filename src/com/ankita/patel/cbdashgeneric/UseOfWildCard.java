package com.ankita.patel.cbdashgeneric;

import java.util.ArrayList;
import java.util.List;

// Read this for detail understanding" https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html
// https://docs.oracle.com/javase/tutorial/java/generics/lowerBounded.html

class Parent {
	public void parentMethod() {
		System.out.println("Parent method got called");
	}
}

class Child extends Parent {
	public void childMethod() {
		System.out.println("Child method got called");
	}
}

class Grandchild extends Child {
	public void grandChildMethod() {
		System.out.println("Grandchild method got called");
	}
}

public class UseOfWildCard {
	
	
	public void operations() {
		
		List<Child> cList = new ArrayList<>();
		cList.add(new Child());
		System.out.println("Upper bounded wildcard check");
		upperBoundGenericMethod(cList);
		
		List<Parent> plist = new ArrayList<>();
		lowerBoundgenericMethod(plist);
		
		List<Child> clist = new ArrayList<>();
		lowerBoundgenericMethod(clist);
	}
		
	
	public void upperBoundGenericMethod(List<? extends Parent> paramList ) {
		
		//Below code gives compilation error: Type mismatch: cannot convert from capture#1-of ? extends Parent to Child
		//Child c = paramList.get(0);
		
		//In upper bound based generic, you can only use parent class to access the element and use parent level 
		//methods and attributes 
		
		Parent p = paramList.get(0);
		p.parentMethod();
		
		// You also CANNOT add Parent type element in this list. Why ? Because it is possible that in such method
		// developer add the element but outside of this method, there will be no-knowledge that which kind of elements
		// whether child or parent has been added and by mistake child specific operation can be called.
		
		//Following gives compile time error : The method add(capture#2-of ? extends Parent) in the type List<capture#2-of ? extends Parent> is not applicable for the arguments (Parent)
		
		// paramList.add(new Parent());	
		
		//You can just add null
		paramList.add(null);
		
	}
	
	// IMP: here we used "super" keyword to express lower Bounded wild card. 
	// Which means this method will take those type of parameter which is having type "child" or it's parent
	public void lowerBoundgenericMethod(List< ? super Child> paramList) {
		
		
		//get compile time error for following: Type mismatch: cannot convert from capture#2-of ? super Child to Parent
		//Parent p = paramList.get(0);
		
		// Get Compile time error for follwoing : Type mismatch: cannot convert from capture#3-of ? super Child to Child
		//Child c = paramList.get(0);
		
		//you can extract element with object type only because there is no guarantee what kind of type as here list will have
		Object o = paramList.get(0);
		
		// you can put any type which are "Child" or "Grandchildren" type you can put here. 
		paramList.add(new Child());
		paramList.add(new Grandchild());
		paramList.add(null);
		
		// We cannot put any super type of "Child" class i.e Parent or Object
		
		//compilation error for below code: The method add(capture#7-of ? super Child) in the type List<capture#7-of ? super Child> is not applicable for the arguments (Parent)
		//paramList.add(new Parent());
		
		//compilation error for below code: The method add(capture#7-of ? super Child) in the type List<capture#7-of ? super Child> is not applicable for the arguments (Object)
		//paramList.add(new Object());
		
		
		
	}

}
