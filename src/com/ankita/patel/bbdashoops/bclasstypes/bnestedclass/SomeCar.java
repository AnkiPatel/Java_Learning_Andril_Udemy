package com.ankita.patel.bbdashoops.bclasstypes.bnestedclass;

import java.util.Arrays;

//Class Tyre can exist without car but there is no point to have it independednt hence it will be the
//correct candidate for nested class. 


public class SomeCar {
	private static final int NO_OF_TYRES = 4; 
	private Tyre[] tyreList;
	private ColorScheme color;
	
	{
		tyreList = new Tyre[NO_OF_TYRES];
		color = new ColorScheme();
	}
	
	public SomeCar() {
		for (int i=0; i<NO_OF_TYRES; i++) {
			tyreList[i] = new Tyre(233,35);
		}
	}
		
	
	@Override
	public String toString() {
		return "SomeCar [tyreList=" + Arrays.toString(tyreList) + ", color=" + color + "]";
	}


    // Nested static class
	public static class Tyre {
		private int typeId;
		private double currentAirPressure;
		
		{
			typeId = 121;
			currentAirPressure = 0.0;
		}
		
		public Tyre() {}
		public Tyre(int pTypeId, double pAirPress) {
			this.typeId = pTypeId;
			this.currentAirPressure = pAirPress;
		}
		
		@Override
		public String toString() {
			return "typeId : " + typeId + ", " + "currentAirPressure : " + currentAirPressure;
		}
		
	}
	
	//inner class
	public class ColorScheme {
		private int red;
		private int blue;
		private int yellow;
		private String colorname;
		
		{
			red = 125;
			blue = 125;
			yellow = 125;
			colorname = "gray";
		}
		
		public ColorScheme() {};
		
		@Override
		public String toString() {
			return "red : " + red + ", " + 
				   "blue : " + blue + ", " +
				   "yellow : " + yellow + ", " +
				   "colorname : " + colorname;
		}
		
	}
}
