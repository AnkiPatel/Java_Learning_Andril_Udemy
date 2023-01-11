package com.ankita.patel.bbdashoops.bclasstypes.dpojoclass;

/* POJO class: Class which is normal in nature. It is not extending any other base class and not 
 * implementing any interface. 
 * if only getter and setter methods along with constructor and toString method suffice the need, 
 * 	that class will considered as POJO class
 */

public class CarSeat {
	private String colour;
	private String material;
	
		
	public CarSeat(String colour, String material) {
		this.colour = colour;
		this.material = material;
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "CarSeat [colour=" + colour + ", material=" + material + "]";
	}
	
	
	
	
}
