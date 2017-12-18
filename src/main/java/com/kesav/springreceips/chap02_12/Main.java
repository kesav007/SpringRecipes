package com.kesav.springreceips.chap02_12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_12/beans.xml");
		ArithmeticCalculator arithmeticCalculator = applicationContext.getBean("arithmeticCalculator", ArithmeticCalculator.class);
/*		arithmeticCalculator.add(20, 10);
		arithmeticCalculator.sub(20, 10);
		arithmeticCalculator.mul(20, 10);
		arithmeticCalculator.div(20, 10);
*/
		UnitCalculator unitCalculator= applicationContext.getBean("unitCalculator", UnitCalculator.class);

		unitCalculator.kilogramToPound(200);
		unitCalculator.kilometerToMile(100);
	}

}
