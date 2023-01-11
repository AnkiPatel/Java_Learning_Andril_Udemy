package com.ankita.patel.aqdashenum;

/* Each enum value may have its own properties and methods.  
 * Definition of properties and methods always should go after the list of constants.*/

public enum Month {
	
	//Below way of listing values internally calls constructor
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31),
	AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
	
	private int daysAmount;
	
	private Month(int noOfDays) {
		this.daysAmount = noOfDays;
	}
	
	public int getDaysAmount() {
		return this.daysAmount;
	}
}
