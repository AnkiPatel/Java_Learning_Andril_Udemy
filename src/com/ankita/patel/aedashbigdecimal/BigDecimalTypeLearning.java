package com.ankita.patel.aedashbigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTypeLearning {

	public static void main(String[] args) {
		
		BigDecimal bd1 = BigDecimal.valueOf(100).setScale(3);
		BigDecimal bd2 = BigDecimal.valueOf(3).setScale(3);
		
		
		//If we use below line, we will get exception " Non-terminating decimal expansion; no exact representable decimal result"
		//BigDecimal result = bd1.divide(bd2);
		
		//We need to set "RoundingMode" during division to get result
		BigDecimal result = bd1.divide(bd2, RoundingMode.HALF_UP);
		System.out.println("division result: " + result);
		
		BigDecimal bd3 = BigDecimal.valueOf(55.78).setScale(3);
		BigDecimal bd4 = BigDecimal.valueOf(4.626).setScale(3);
		
		System.out.println("bd3 : " + bd3 + ", bd4 : " + bd4);
		
		BigDecimal result2 = bd3.subtract(bd4);
		System.out.println(result2);		
	}
}

/*
OP:
---
division result: 33.333
bd3 : 55.780, bd4 : 4.626
51.154
*/

