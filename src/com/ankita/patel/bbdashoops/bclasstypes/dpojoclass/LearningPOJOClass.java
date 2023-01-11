package com.ankita.patel.bbdashoops.bclasstypes.dpojoclass;

//POJO: Plain old java object
//Simple java classes, It should not extend any other class, It should implement any interfaces and 
// contain prespecified annotations like "entity". 

//Usually people call simple classes with just getters and setters and default constructor as POJO classes.
// Here CarSeat is example of POJO class

public class LearningPOJOClass {

	public static void main(String[] args) {
		CarSeat cs = new CarSeat("gray", "nylon");
		System.out.println("cs: " + cs);

	}

}
/*
OP:
---
cs: CarSeat [colour=gray, material=nylon]
*/