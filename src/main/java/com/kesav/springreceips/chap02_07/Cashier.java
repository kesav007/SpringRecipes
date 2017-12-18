package com.kesav.springreceips.chap02_07;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.MessageSource;

import com.kesav.springreceips.chap02.ShoppingCart;


public class Cashier {
	
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void checkout(ShoppingCart shoppingCart){
		String msg = messageSource.getMessage("alert.checkout", new Object[]{shoppingCart.getProducts(), new Date()}, Locale.US);
		System.out.println(msg);
	}

}
