package com.kesav.springreceips.chap02_11;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kesav.springreceips.chap02.Product;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
		applicationContext.getEnvironment().setActiveProfiles("spring");
		applicationContext.load("com/kesav/springreceips/chap02_11/beans.xml");
		applicationContext.refresh();
		Product cdrw = applicationContext.getBean("cdrw", Product.class);
		System.out.println(cdrw);
	}
}
