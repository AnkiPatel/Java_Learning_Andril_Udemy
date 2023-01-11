package com.ankita.patel.andashcontrolstatements;

public class ControlStatmentsLearning {

	private static void learnIfElse() {
		int amountOfMoneyInAccount = 100;
		int priceOfItemOne = 200;
		int priceOfItemTwo = 50;
		
		if(priceOfItemOne < amountOfMoneyInAccount) {
			System.out.println("Purchase successful..!!");
		} else {
			System.out.println("Not enough money in account");
		}
		
		//No braces demo
		
		//When braces are not there, after if/else statement, only next statement 
		//will have effect of condition
		
		if(priceOfItemTwo < priceOfItemOne) 
			System.out.println("Item two is less expensive");
		else 
			System.out.println("Item one is less expensive");
			System.out.println("You might need to add money in your account");
		// Now above println statement will get execute, even though else 
		// condition is not satisfying because above println is not part of else
		// block. Best practice is to use braces 
		
		// if - else - if demo
		int orderPrice = 1000;
		
		if (orderPrice > 0 && orderPrice < 100) {
			System.out.println("You have 5% discount for this order");
		} else if (orderPrice >= 100 && orderPrice < 500) {
			System.out.println("You have 10% discount for this order");
		} else if (orderPrice >= 500 && orderPrice < 5000) {
			System.out.println("You have 15% discount for this order");
		} 
	}
	
	/*
OP:
-----
Not enough money in account
Item two is less expensive
You might need to add money in your account
You have 15% discount for this order
	 */
	
	private static void learnSwitch() {
		String check = "friday";
		switch (check) {
			case "monday":
				System.out.println("No bluemoon.. work hard");
				break;
			case "tuesday":
				System.out.println("It is day of classes.. Read with focus");
				break;
			case "friday":
				System.out.println("Fun day.. party harder");
				break;
			case "sunday":
				System.out.println("Pet cuddling time");
				break;
			default:
				System.out.println("Your entry of day is not getting processed");
		}
		
		System.out.println("=== No break in switch behaviour ===");
		short rakam = 20;
		switch (rakam) {
		case 5:
			System.out.println("got 5 conis");
			break;
		case 10:
			System.out.println("got 10 coins");
			// No break here.. it can introduce bug
		case 20:
			System.out.println("got 20 coins");
			// case 20 is selected but no break here.. so 
			// it will keep processing all the cases till it hits first break.
		case 25:
			System.out.println("got 25 conis"); // this will get printed though case is not 
			// but earlier case "20" got executed and it dont have break;
			break;
		default :
			System.out.println("Not sure how to process entry");
		}
		
		System.out.println("=== Default block demo ===");
		char charCheck = 'v';
		switch (charCheck) {
		case 'a':
			System.out.println("Lucky choice");
			break;
		case 'p':
			System.out.println("Smart choice");
			break;
		default:
			System.out.println("No option to process this choice");		
		}
		
		/*
OP: 
----
Fun day.. party harder
=== No break in switch behaviour ===
got 20 coins
got 25 conis
=== Default block demo ===
No option to process this choice
		 */
			
	};
	
	public static void main(String[] args) {
		//learnIfElse();
		learnSwitch();
		

	}

}
