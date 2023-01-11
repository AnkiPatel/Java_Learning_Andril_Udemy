package com.ankita.patel.bbdashoops.cinterfaces;

/*
what interfaces : interfaces, an abstraction which defines a behavioral contract that must be 
followed by every class that implements this interface. In other words, you specify 
a set of expected behavior which should be present in each class that implements

But by itself,it don't specify how exactly this behavior will be implemented.
*/


/*
When to use abstract class and when to use interface
-------------------------------------------------------
if you know that you need to list properties with private or protected access modifiers
that are not static, you already know that you need to use abstract class instead of interface.

And if you need to be able to implement specific interface together with other ones, 
you know that you need to use interfaces.

*/

/*
 Why we need interfaces: We need interfaces to build our application which depends on 
 the abstraction types, but not on the concrete classes.
 */

public class LearningInterface {

	public static void main(String[] args) {
		
		DashboardDataProvider speedM = new SpeedoMeter();
		speedM.connect();
		System.out.println(speedM.currentValue());
		
		DashboardDataProvider fuelM = new FuelLevelObserver();
		fuelM.connect();
		System.out.println(fuelM.currentValue());
		
		
	}

}

/*
Connecting with speed calculator
10.0
Connecting with fuel tank controller
25.0
 */
