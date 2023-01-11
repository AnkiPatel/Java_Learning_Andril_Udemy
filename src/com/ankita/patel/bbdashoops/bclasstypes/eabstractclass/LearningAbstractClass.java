package com.ankita.patel.bbdashoops.bclasstypes.eabstractclass;

/*
 * You cannot create object of abstract class.
 * abstract class must have atleast one abstract method. 
 * 
 * People create abstract class in the process where they can think about few specific 
 * Behavior of class but not certain about all the behavior and which can vary. 
 */

//GearBox is an abstract class

public class LearningAbstractClass {

	public static void main(String[] args) {
		
		//You cannot directly create object of abstract class
		//GearBox gb_one = new GearBox();
		
		//Anonymous class
		//In below way of object creation, we are creating anonymous child class
		//with "on the fly" implementation of abstract method. 
		GearBox gb_two = new GearBox() {
			
			@Override
			public int changeTheGear() {
				// TODO Auto-generated method stub
				return 555;
			}
		};
		System.out.println(gb_two.changeTheGear());
		System.out.println(gb_two.getGearBoxCompanyName());
		
		//you can assign reference of child class to base class object like we do in c++
		GearBox gb = new AutomaticGearBox();
		System.out.println(gb.changeTheGear());
		System.out.println(gb.getGearBoxCompanyName());
		
		
		//Direct creation of child class object with child class reference 
		AutomaticGearBox agb = new AutomaticGearBox();
		System.out.println(agb.changeTheGear());
		System.out.println(agb.getGearBoxCompanyName());
		
		ManualGeartBox mgb = new ManualGeartBox();
		System.out.println(mgb.changeTheGear());
		System.out.println(mgb.getGearBoxCompanyName());
	}

}

/*
OP:
---
555
chevy
5
chevy
5
chevy
Will be decided by user
0
chevy
*/