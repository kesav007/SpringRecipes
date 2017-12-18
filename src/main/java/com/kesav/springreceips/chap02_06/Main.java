package com.kesav.springreceips.chap02_06;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.kesav.springreceips.chap02.Battery;
import com.kesav.springreceips.chap02.Disc;
import com.kesav.springreceips.chap02.ShoppingCart;

public class Main {

	public static void main(String[] args) throws IOException {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_6/beans.xml");
		ShoppingCart shoppingCart =  applicationContext.getBean("shoppingCart", ShoppingCart.class);
		Battery aaaBattery = applicationContext.getBean("aaa", Battery.class);
		Disc cdrw= applicationContext.getBean("cdrw", Disc.class);
		Disc dvdrw = applicationContext.getBean("dvdrw", Disc.class);
		shoppingCart.getProducts().add(aaaBattery);
		shoppingCart.getProducts().add(cdrw);
		shoppingCart.getProducts().add(cdrw);
		shoppingCart.getProducts().add(dvdrw);
		System.out.println(shoppingCart.getProducts());		
		System.out.println(shoppingCart.getTotal());		
		Resource resource = new ClassPathResource("discounts.properties");
		Properties properties = PropertiesLoaderUtils.loadProperties(resource);
		System.out.println("And don't forget our discounts");
		System.out.println(properties);
		
		}

}
