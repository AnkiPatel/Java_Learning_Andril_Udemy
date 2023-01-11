package com.ankita.patel.bbdashoops.bclasstypes.cfinalclass;

/*
Once class has final specifier, it cannot be inherited. 
Normally classes which has utility functionality, has such behavior 

String is the final class

 */

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
