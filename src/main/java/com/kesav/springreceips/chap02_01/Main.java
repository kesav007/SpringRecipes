package com.kesav.springreceips.chap02_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_01/beans.xml");
		SequenceGenerator sequenceGenerator1 = (SequenceGenerator) applicationContext.getBean("sequenceGenerator1");
		SequenceGenerator sequenceGenerator2 = (SequenceGenerator) applicationContext.getBean("sequenceGenerator2");
		SequenceGenerator sequenceGenerator3 = (SequenceGenerator) applicationContext.getBean("sequenceGenerator3");
		SequenceGenerator sequenceGenerator4 = (SequenceGenerator) applicationContext.getBean("sequenceGenerator4");

		System.out.println(sequenceGenerator1.getSequence());
		System.out.println(sequenceGenerator1.getSequence());
		System.out.println("======================");
		System.out.println(sequenceGenerator2.getSequence());
		System.out.println(sequenceGenerator2.getSequence());
		System.out.println("======================");
		System.out.println(sequenceGenerator3.getSequence());
		System.out.println(sequenceGenerator3.getSequence());
		System.out.println("======================");
		System.out.println(sequenceGenerator4.getSequence());
		System.out.println(sequenceGenerator4.getSequence());

	}

}
