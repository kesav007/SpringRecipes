package com.kesav.springreceips.chap02_07;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kesav.springreceips.chap02.Battery;
import com.kesav.springreceips.chap02.Disc;
import com.kesav.springreceips.chap02.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_7/beans.xml");
		String msg = applicationContext.getMessage("welcome.message", null, Locale.US);
		String alert = applicationContext.getMessage("alert.checkout", new Object[]{4, new Date()}, Locale.US);
		System.out.println(msg);
		System.out.println(alert);
		
		ShoppingCart shoppingCart =  applicationContext.getBean("shoppingCart", ShoppingCart.class);
		Battery aaaBattery = applicationContext.getBean("aaa", Battery.class);
		Disc cdrw= applicationContext.getBean("cdrw", Disc.class);
		Disc dvdrw = applicationContext.getBean("dvdrw", Disc.class);
		shoppingCart.getProducts().add(aaaBattery);
		shoppingCart.getProducts().add(cdrw);
		shoppingCart.getProducts().add(cdrw);
		shoppingCart.getProducts().add(dvdrw);
		
		Cashier cashier= applicationContext.getBean("cashier", Cashier .class);
		cashier.checkout(shoppingCart);
	}

}
