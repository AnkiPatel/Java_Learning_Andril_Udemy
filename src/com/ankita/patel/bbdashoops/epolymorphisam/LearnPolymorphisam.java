package com.ankita.patel.bbdashoops.epolymorphisam;

//Polymorphisam: One type have different behaviors 

//Car is an abstract class and defining behavior "getHistoryInfo" which returns type "HistoryInfo". 
//Two child classes "ElectricCar" and "PetrolCar" will define their own specific behaviors. 

// "HistoryInfo" is an interface and concrete classes which implements this interface also override 
// interface methods with their own ways. 

//Dynamic binding: What methods should be called based on the object here during the runtime.

// NOTE : For understanding about @Override notation. Check ElectricCar.java file.

public class LearnPolymorphisam {

	public static void main(String[] args) {
		
		//Here type of reference is "Car", but object type is child class of "Car"
		// so it is compatible.  
		Car officeCar = new ElectricCar();
		Car familyCar = new PetrolCar();
		
		// Here though type of reference is abstract class, based on which child object
		// created, that method will get called. This is getting decided runtime (We are creating object
		// with new). Means we are doing dynamic binding here. 
		System.out.println("officeCar current speed: " + officeCar.getCurrentSpeed());		
		HistoryInfo officeCarHistory = officeCar.getHistoryInfo();
		officeCarHistory.populateData();
		
		System.out.println("familyCar current speed: " + familyCar.getCurrentSpeed());		
		HistoryInfo familyCarHistory = familyCar.getHistoryInfo();
		familyCarHistory.populateData();
	}

}
