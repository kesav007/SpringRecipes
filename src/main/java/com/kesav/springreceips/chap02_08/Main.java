package com.kesav.springreceips.chap02_08;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kesav.springreceips.chap02.Battery;
import com.kesav.springreceips.chap02.Disc;
import com.kesav.springreceips.chap02.Product;
import com.kesav.springreceips.chap02.ShoppingCart;

public class Main {
	
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_08/beans.xml");
		ShoppingCart shoppingCart = context.getBean("shoppingCart", ShoppingCart.class);
		Product aaa = context.getBean("aaa", Battery.class);
		Product cd = context.getBean("cdrw", Disc.class);
		Product dvd = context.getBean("dvdrw", Disc.class);
		shoppingCart.getProducts().add(aaa);
		shoppingCart.getProducts().add(cd);
		shoppingCart.getProducts().add(dvd);
		Cashier cashier = context.getBean("cashier", Cashier.class);
		cashier.checkout(shoppingCart);
		
	}

}
