package com.ankita.patel.bbdashoops.cinterfaces;


public class FuelLevelObserver implements DashboardDataProvider{

	private int fuelLevel;
	
	{
		fuelLevel = 0;
	}
	
	private void updateValue() {
		fuelLevel = 25;
	}
	
	@Override
	public void connect() {
		System.out.println("Connecting with fuel tank controller");
		
	}

	@Override
	public double currentValue() {
		updateValue();
		return (double)fuelLevel;
	}

}
