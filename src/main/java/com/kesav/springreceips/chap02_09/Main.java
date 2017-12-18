package com.kesav.springreceips.chap02_09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kesav.springreceips.chap02.Product;
import com.kesav.springreceips.chap02.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_09/beans.xml");
		Product aaa = context.getBean("aaa", Product.class);
		Product cdrw = context.getBean("cdrw", Product.class);
		Product dvdrw = context.getBean("dvdrw", Product.class);
		ShoppingCart shoppingCart = context.getBean("shoppingCart", ShoppingCart.class);
		shoppingCart.getProducts().add(aaa);
		shoppingCart.getProducts().add(cdrw);
		shoppingCart.getProducts().add(dvdrw);

	}

}
