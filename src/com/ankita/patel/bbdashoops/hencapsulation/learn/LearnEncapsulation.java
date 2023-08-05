
/*
 Encapsulation is a principle that teaches us to group data and behavior 
 (those our fields and methods) together as a single unit.

We have 4 main access modifiers. They are public, protected, package private or default private.
 */

/*
Usage tips and tricks
-------------------------

1) 99 percent of cases you will use is a private or public. Default and protected modifiers are not used very often. 
This is because you may have very few business cases when you want to keep something visible only in scope of the package or only in scope of the package and child class.

2) Most likely you will implement interfaces and would like to keep the behavior public.

3) Sometimes you will have methods which are needed only for this class and 
you will keep them private. Usually all fields have the private access modifier 
because you want to control interaction with your object.
 */

package com.ankita.patel.bbdashoops.hencapsulation.learn;

import com.ankita.patel.bbdashoops.hencapsulation.packageOne.*;
import com.ankita.patel.bbdashoops.hencapsulation.packageTwo.*;

public class LearnEncapsulation {

	public static void main(String[] args) {
		
		//-------------------
		//Understanding protected access modifier. 
		/* I can get access to protected entities only inside the same package or in a child class.
		 */
		//-------------------
		
		ClassA A = new ClassA();
		A.doSomethingForAll();
		
		//Since "doSomething" method is having access modifier protected, we get 
		//compile time error "The method doSomething() from the type ClassA is not visible" for following
		//Statement
		
		//A.doSomething();
		
		
		ClassX X = new ClassX();
		X.takeAction();
		
		ChildOfClassA CofA = new ChildOfClassA();
		CofA.ChildClassDoSomething();
		
		//-------------------
		//Understanding default access modifier.
		/*You can access private entities only in scope When it was declared. 
		Private method cannot be access by other class even if it is in same package.
		*/
		//-------------------
		ClassB b = new ClassB();
		
		//"doSomethingClassB" having default access modifier. Hence you cannot access it
		// in this "learn" package. Following statement gives error as: The method doSomethingClassB() from the type ClassB is not visible
		//b.doSomethingClassB();
		
		ClassY y = new ClassY();
		// Note that ClassY can access "doSomethingClassB" method because ClassY having same package
		// as ClassB.
		y.ClassYTakeAction();
		
		//-------------------
		//Understanding private access modifier.
		/* You can access private entities only in scope When it was declared. 
			Private method cannot be access by other class even if it is in same package.
		 */
		//-------------------
		PrivateClassZ pc = new PrivateClassZ();
		//Following two statment will give compilation error. 
		//pc.a = 9;
		//pc.doSomeWorkPrivateClassZ();
		
		//-------------------
		//Understanding access modifer in override world.
		/* Overriding the rule is simple. When you override the method, you can't reduce the visibility of the 
		 * inherited method but you can extend (or i say relax the visibilty ). Default method 
		 * can be override with public access modifer. 
		 */
		//-------------------
		ClassA AA = new ClassA();
		//Cannot call below as methodWithDefaultAM has default access specifier and ClassA is in
		//different package
		//AA.methodWithDefaultAM();
		
		ChildOfClassA coca = new ChildOfClassA();
		//While overriding, we have expanded the visibility of the function methodWithDefaultAM from "default"
		//to "public", hence we are able to access here.
		coca.methodWithDefaultAM();
		

	}

}
