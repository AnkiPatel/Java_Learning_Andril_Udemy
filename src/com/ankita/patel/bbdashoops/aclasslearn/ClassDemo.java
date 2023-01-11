package com.ankita.patel.bbdashoops.aclasslearn;

// In Java, any .java file can contain only one public class. you can define other 
// non public class in same java file.

class someClass {
	
}

public class ClassDemo {

	public static void main(String[] args) {
		
		SomeProduct product = new SomeProduct();
		System.out.println("Created product: " + product);
		System.out.println("Discounted price by default : " + product.getDiscountedPrice());
		
		//Misusing the setter method
		
		/*
		 Difference between parameter and Argument
		 -----------------------------------------
		 A parameter is the variable that goes as an input during the declaration of a method, 
		 which is "vId" in below statement case while declaring the method in VenderInfo class. 
		 
		 An argument is the actual value that goes as an input while calling that method. 
		 So, 222 would be the argument in this case. 
		 
		 You can say that arguments are data that are passed into a method’s parameters
		 */
		
		product.getVenderInfo().setvId(222);
		System.out.println("After change : " + product);	
		
	}

}

/*
SomeProduct.class is uploaded into JVM
Created product: SomeProduct [id=45, productName=axe, discount=Discount [diwaliDiscount=0.0, christmasDiscount=0.0, defaultDiscount=5.0], price=89.0, venderdetail=VenderInfo [vId=45, regId=pqr traders]]
Discounted price by default : 89.0
After change : SomeProduct [id=45, productName=axe, discount=Discount [diwaliDiscount=0.0, christmasDiscount=0.0, defaultDiscount=5.0], price=89.0, venderdetail=VenderInfo [vId=222, regId=pqr traders]]
*/