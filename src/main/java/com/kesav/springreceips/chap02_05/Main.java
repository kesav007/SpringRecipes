package com.kesav.springreceips.chap02_05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kesav.springreceips.chap02.Battery;
import com.kesav.springreceips.chap02.Disc;
import com.kesav.springreceips.chap02.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_05/beans.xml");
		ShoppingCart shoppingCart =  applicationContext.getBean("shoppingCart", ShoppingCart.class);
		Battery aaaBattery = applicationContext.getBean("aaa", Battery.class);
		Disc cdrw= applicationContext.getBean("cdrw", Disc.class);
		Disc dvdrw = applicationContext.getBean("dvdrw", Disc.class);
		shoppingCart.getProducts().add(aaaBattery);
		shoppingCart.getProducts().add(cdrw);
		System.out.println(shoppingCart.getProducts());

		ShoppingCart shoppingCart2 =  applicationContext.getBean("shoppingCart", ShoppingCart.class);
		shoppingCart2.getProducts().add(dvdrw);
		System.out.println(shoppingCart2.getProducts());
		
		}

}
