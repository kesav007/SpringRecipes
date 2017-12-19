package com.kesav.springreceips.chap03_02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kesav.springreceips.chap02.Product;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.kesav.springreceips.chap03_02");
		context.refresh();
		Product aaa = context.getBean("aaa", Product.class);
		Product cdrw = context.getBean("cdrw", Product.class);
		Product dvdrw = context.getBean("dvdrw", Product.class);
		System.out.println(aaa);
		System.out.println(cdrw);
		System.out.println(dvdrw);
	}

}
