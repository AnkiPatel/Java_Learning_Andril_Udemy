package com.ankita.patel.bbdashoops.epolymorphisam;

public class PetrolCar extends Car{

	@Override
	public HistoryInfo getHistoryInfo() {
		System.out.println("Fetching break history of PetrolCar");
		return new BreakHistory();
	}

	@Override
	public double getCurrentSpeed() {
		return 67;
	}

}
