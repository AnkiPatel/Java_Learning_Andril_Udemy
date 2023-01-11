package com.ankita.patel.bbdashoops.dinheritance;


/*
 So the idea of inheritance is to describe new types based on existing one from technical side.
This allows us to reuse already written code

In Java multiple inheritance is not supported
 */


public class LearningInheritance {

	public static void main(String[] args) {
		BaseCar car = new SportCar();
		car.setBrandName("TATA"); // this will be base class function call
		
		// this gives error as "car" is reference of BaseCar. It don't have visibility 
		// of child class's property even though object creation happened with child class template 
		//car.setModel("TaMo");
		//car.checkRaceScore();
		
		car.setId(89);
		
		System.out.println("BaseCar brand: " + car.getBrandName());
		System.out.println("Get stock in factory: " + car.calculateStock());
		
		SportCar scar = new SportCar("Ferrari", 23, "Roma");
		scar.checkRaceScore();
		scar.setId(55); // Accessing parent class method
		
		// Now how you will get to know runtime,
		// What is the type of object?
		// Ans: use of instanceof operator
		
		if (car instanceof SportCar) {
			System.out.println("object assigned was SportCar");
			
			//casting the car type into SportCar
			SportCar scarTwo = (SportCar) car; 
			scarTwo.checkRaceScore();
		}
		
		System.out.println(scar.getFullDetails());		
	}

}

/*
OP:
----
BaseCar brand: TATA
Get stock in factory: 160
Race score is 8
object assigned was SportCar
Race score is 8
Ferrari 55 Roma
*/