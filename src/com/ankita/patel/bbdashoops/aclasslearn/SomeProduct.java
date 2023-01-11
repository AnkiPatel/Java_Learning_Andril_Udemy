package com.ankita.patel.bbdashoops.aclasslearn;

public class SomeProduct {
	
	//Way to declare class level constants
	private static final int MONEY_SCALE = 2;
	private static final double DEAFULT_DISCOUNT_RATE = 0;
	private static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount";
	
	private int id;
	private String productName;
	private Discount discount;
	private double price;
	private VenderInfo venderdetail;
	
	//static block : code inside the static block is executed only once: the first time 
	//the class is loaded into memory. 
	static {
		System.out.println("SomeProduct.class is uploaded into JVM");
		//Good example of using static block is driver classes..where you have to register
		//driver into system before instance of class getting created
	}
	
	//Initialization block
	//you can use initialization blocks to put the code, which you want to execute no matter
	//what constructor will be called.
	{
		id = 45;
		productName = "axe";
		discount = new Discount();
		price = 89.0;
		// below statement guarantee that "venderdetail" will never point to null. 
		// you can save yourself with null pointer exception.
		venderdetail = new VenderInfo(45, "pqr traders");
	}

	
	
	@Override
	public String toString() {
		return "SomeProduct [id=" + id + ", productName=" + productName + ", discount=" + discount + ", price=" + price
				+ ", venderdetail=" + venderdetail + "]";
	}

	//Be careful: Here you are returning the reference of object which created private in this class. 
	//But with setter method of "venderdetail", outside of class also it is mutable.
	public VenderInfo getVenderInfo() {
		return this.venderdetail;
	}
	
	//Method:
	/*Understand here the difference between method and function.
	Function can exist without object independently. Method is the behavior of the object.
	*/
	public double getDiscountedPrice() {
		return ((this.price) - ((this.price * this.discount.getChristmasDiscount())/100));
	}	
	
	public static class Discount {
		
		private double diwaliDiscount;
		private double christmasDiscount;
		private double defaultDiscount;
		
		public Discount() {
			defaultDiscount = 5.0;
		}
			
		public double getDiwaliDiscount() {
			return diwaliDiscount;
		}
		public void setDiwaliDiscount(double diwaliDiscount) {
			this.diwaliDiscount = diwaliDiscount;
		}
		public double getChristmasDiscount() {
			return christmasDiscount;
		}
		public void setChristmasDiscount(double christmasDiscount) {
			this.christmasDiscount = christmasDiscount;
		}
		public double getDefaultDiscount() {
			return defaultDiscount;
		}
		public void setDefaultDiscount(double defaultDiscount) {
			this.defaultDiscount = defaultDiscount;
		}
		@Override
		public String toString() {
			return "Discount [diwaliDiscount=" + diwaliDiscount + ", christmasDiscount=" + christmasDiscount
					+ ", defaultDiscount=" + defaultDiscount + "]";
		}
		
	}
	
}
