package com.ankita.patel.bbdashoops.dinheritance;

public class BaseCar {
	private String brand;
	private int id;
	
	public BaseCar() {
		
	}
	
	public BaseCar(String pBrand, int pId) {
		brand = pBrand;
		id = pId;
	}
	
	public String getBrandName() {
		return brand;
	}
	public void setBrandName(String name) {
		this.brand = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public BaseCar[] listCars() {
		// some code that fetches the variant cars 
		// from database
		
		return new BaseCar[3];
	}
	
	// Power of inheritance comes here: Consider you had only concrete classes of each type of cars
	// now if you want to change the way you calculate stock. it would be tough as you have to change
	// all the classes. But having this common functionality in parent class solve that problem. you just change 
	// here and it will reflect in all child classes.
	public int calculateStock() {
		return 160;
	}
	
	
}
