package com.kesav.springreceips.chap02_13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kesav.springreceips.chap02.Battery;
import com.kesav.springreceips.chap02.Disc;
import com.kesav.springreceips.chap02.Product;

public class Main {
	
	public static final Product AAA = new Battery("AAA", 2.5);
	public static final Product CDRW= new Disc("CD-RW", 1.5);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_13/beans.xml");
		Product aaa = applicationContext.getBean("aaa", Product.class);
		System.out.println(aaa);
		Product cdrw = applicationContext.getBean("cdrw", Product.class);
		System.out.println(cdrw);
		
		Product aaastatic = applicationContext.getBean("aaastatic", Product.class);
		System.out.println(aaastatic);

		Product bestSeller = applicationContext.getBean("bestSeller", Product.class);
		System.out.println(bestSeller );

		Product bestSellerPath = applicationContext.getBean("bestSellerPath", Product.class);
		System.out.println(bestSellerPath);
		
		
	}

}
