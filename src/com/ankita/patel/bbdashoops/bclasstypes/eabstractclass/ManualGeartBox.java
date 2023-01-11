package com.ankita.patel.bbdashoops.bclasstypes.eabstractclass;

//concrete class: Class which has implementation of it's all methods.
public class ManualGeartBox extends GearBox{

	@Override
	public int changeTheGear() {
		System.out.println("Will be decided by user");
		return 0;
	}

}
