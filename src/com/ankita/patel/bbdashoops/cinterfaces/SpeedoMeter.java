package com.ankita.patel.bbdashoops.cinterfaces;


//Class can contain more than one interfaces. 
/*
Class can implement multiple interfaces. Problem at compilation happen when 
two or more interface have "default" method with same signature (return type, name and parameters).
as compiler doesn't know that time which method to call. 
*/
public class SpeedoMeter implements DashboardDataProvider{

	private double currentSpeed;
	
	//Initialization block
	{
		currentSpeed = 10;
	}
	
	//Class specific method
	private double getCurrentSpeed() {
		return currentSpeed;
	}

	
	@Override
	public double currentValue() {
		return this.getCurrentSpeed();
	}
	
	@Override
	public void connect() {
		System.out.println("Connecting with speed calculator");
		
	}
	
}
