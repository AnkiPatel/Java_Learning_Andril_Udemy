package com.ankita.patel.bbdashoops.epolymorphisam;

public abstract class Car {
	
	private double milageCounter;
	
	public abstract HistoryInfo getHistoryInfo();
	
	public abstract double getCurrentSpeed();
	
	public void resetMilageCounter() {
		milageCounter = 0.0f;
	}

}
