package com.ankita.patel.bbdashoops.dinheritance;

public class SportCar extends BaseCar {
	
	private String model;
	
	public SportCar() {
		//Way to call parent class constructor
		// calling parent class constructor must be the first statement 
		// in child class's Constructor if you decided to call it.
		super("BMW", 46);  
		model = "sonic";		
	}
	
	public SportCar(String brandname, int id, String model ) {
		super(brandname, id);
		this.model = model;		
	}	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void checkRaceScore() {
		System.out.println("Race score is 8");
	}
	
	@Override
	public BaseCar[] listCars() {
		System.out.println("Gonna give only sport car list");
		return new SportCar[3];
	}
	
	
	//when need arrives, you can access parent class's property 
	//with "super" keyword
	public String getFullDetails() {
		return super.getBrandName() + " " + super.getId() + " " + this.model;
	}
	
	
}
