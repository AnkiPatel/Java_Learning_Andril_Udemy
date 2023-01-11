package com.ankita.patel.bbdashoops.epolymorphisam;

public class ElectricCar extends Car{
	
	@Override // annotation is for you.. code will work just fine without it. 
	// But when you add annotation, it make sure that method which you are overriding, must have
	// same signature as it declared in either base class or interface.
	
	// Without this annotation, in future you might try to add parameter or change return type by mistake
	// complier will not even complain as it will be considered as "compile time binding" a.k.a overloading. 
	// that will be problematic in terms of software behavior.
	public void resetMilageCounter() {
		System.out.println("Reseting ElectirCar milage");
	}

	@Override 
	// NOTE: Compile time binding for abstract method is not possible
	public HistoryInfo getHistoryInfo() {
		System.out.println("Fetching Engine history of Electric car");
		// Here return type is HistoryInfo but we are returning type "EngineHistory"
		// EngineHistory is concrete implementation of type HistoryInfo so it is compatible with
		// this overridden method. 
		return new EngineHistory();
	}

	@Override
	public double getCurrentSpeed() {
		return 45;
	}

}
