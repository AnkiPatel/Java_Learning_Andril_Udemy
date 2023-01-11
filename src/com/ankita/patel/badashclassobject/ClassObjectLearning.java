package com.ankita.patel.badashclassobject;

public class ClassObjectLearning {

	public static void main(String[] args) {
/*
if they have constructor's on this example, you can see that no matter which constructor will be called

Utilization, initialization block will be executed.

Knowing this, you can use initialization blocks to put their code, which you want to execute no matter

what constructor will be called.
*/
		
		/*
		 And now you can understand the difference between method and function.

Function can exist without object independently.

Method is the behavior of the object.

That's why in OOP we call specific box of code, which can be invoked by their names methods but not

functions methods.

This is something that is always associated with an object.
		 */
		
		// BEST practice is not to return reference of property in getter methods
		
		// With setter method you can have control over which value user of your class is
		// assigning 
		
		/*
		  why it's called concrete because this class

has an implementation for all of its methods.

Concrete classes can have any and implemented methods.
		 */
		
		/*
		In interface, by default method's access specifier are "public abstract". 
		Hence all methods are abstract method in interface.
		
		2) @override notation is for successful compilation 
		
		3) In interface you can have method "default" which behave as concrete 
		class method. 
		
		4) Interface also can have static method. But it is not "good object oriented approach"
		
		5) Interface can have constants
		if you define as "int MYCONSTANT = 5" , Internally it will be same as
		"public static final int MYCONSTANT = 5"
		
		6) Class can implement multiple interfaces. Problem at compilation happen when 
		two or more interface have "default" method with same signature (return type, name and parameters).
		as compiler doesn't know that time which method to call. 
		*/
		
		/*When an abstract class is implementing interface, that class don't need to
		 * provide concert implementation of interface methods.
		 */

	}

}
