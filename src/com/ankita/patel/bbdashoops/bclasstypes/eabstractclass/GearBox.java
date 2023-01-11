package com.ankita.patel.bbdashoops.bclasstypes.eabstractclass;

//Abstract class
//We dont want user to allow create an object of GearBox as GearBox can be classified in specific
//variants 1) Manual Gear Box 2) Automatic Gear Box

public abstract class GearBox {
	
	private int type;
	
	//abstract method which need to be implemented by child class
	//abstract method dont have body
	public abstract int changeTheGear();
	
	// Here "getGearBoxCompanyName" is common function among child class of GearBox
	public String getGearBoxCompanyName() {
		return "chevy";
	}

}
