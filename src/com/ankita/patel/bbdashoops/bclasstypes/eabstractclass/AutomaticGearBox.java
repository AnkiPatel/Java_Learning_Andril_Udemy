package com.ankita.patel.bbdashoops.bclasstypes.eabstractclass;


public class AutomaticGearBox extends GearBox {

	@Override
	public int changeTheGear() {
		AutoGrearShiftAlgorithem algo = new AutoGrearShiftAlgorithem(3,7);
		return algo.calulateGearShift();
	}

}
