package com.kesav.springreceips.chap02_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kesav.springreceips.chap02.Battery;
import com.kesav.springreceips.chap02.Disc;
import com.kesav.springreceips.chap02.Product;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_10/beans.xml");
		Product aaa = applicationContext.getBean("aaa", Product.class);
/*		System.out.println(aaa);
		System.out.println("--------------------------");		
		Product cdrw = applicationContext.getBean("cdrw", Product.class);
		System.out.println(cdrw);
		System.out.println("--------------------------");
		Product dvdrw = applicationContext.getBean("dvdrw", Product.class);
		System.out.println(dvdrw);
		System.out.println("--------------------------");
		Product harddisc = applicationContext.getBean("harddisc", Product.class);
		System.out.println(harddisc);
	
		System.out.println("\n***********************\n");
		
		Product aaaFactory = applicationContext.getBean("aaaFactory", Product.class);
		System.out.println(aaaFactory);

		System.out.println("\n***********************\n");
*/		
		Product aaaBattery= applicationContext.getBean("aaaBattery", Product.class);
		System.out.println(aaaBattery);
/*
		Product aaaDiscountFactoryBean = applicationContext.getBean("aaadiscountFactoryBean", Product.class);
		System.out.println(aaaDiscountFactoryBean);
		
		System.out.println(aaaBattery == aaaDiscountFactoryBean);*/
	}

}
