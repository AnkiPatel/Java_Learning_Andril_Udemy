package com.ankita.patel.bbdashoops.bclasstypes.eabstractclass;

/*
Once class has final specifier, it cannot be inherited. 
Normally classes which has utility functionality, has such behavior 

String is the final class

 */

//NOTE: In this section we are using this class as supporting class as one of the specialized variant 
// of "GearBox" class, "AutomaticGearBox".

public final class AutoGrearShiftAlgorithem {

	private int breakPressure;
	private int acceleratorPresure;
	
	public int calulateGearShift() {
		return 5;
	}
	
	public AutoGrearShiftAlgorithem(int bp, int ap) {
		this.breakPressure = bp;
		this.acceleratorPresure = ap;
	}
	
}
