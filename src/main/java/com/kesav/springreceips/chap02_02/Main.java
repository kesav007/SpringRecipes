package com.kesav.springreceips.chap02_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_02/beans.xml");

		SequenceGenerator sequenceGenerator1 = applicationContext.getBean("sequenceGenerator1", SequenceGenerator.class);
		SequenceGenerator sequenceGenerator2 = applicationContext.getBean("sequenceGenerator2", SequenceGenerator.class);
		SequenceGenerator sequenceGenerator3 = applicationContext.getBean("sequenceGenerator3", SequenceGenerator.class);
		SequenceGenerator sequenceGenerator4 = applicationContext.getBean("sequenceGenerator4", SequenceGenerator.class);
		SequenceGenerator sequenceGenerator5 = applicationContext.getBean("sequenceGenerator5", SequenceGenerator.class);
		SequenceGenerator sequenceGenerator6 = applicationContext.getBean("sequenceGenerator6", SequenceGenerator.class);

		System.out.println(sequenceGenerator1.getSequence());
		System.out.println(sequenceGenerator1.getSequence());
		
		System.out.println(sequenceGenerator2.getSequence());
		System.out.println(sequenceGenerator2.getSequence());
	
		System.out.println(sequenceGenerator3.getSequence());
		System.out.println(sequenceGenerator3.getSequence());
		
		System.out.println(sequenceGenerator4.getSequence());
		System.out.println(sequenceGenerator4.getSequence());		
		
		System.out.println(sequenceGenerator5.getSequence());
		System.out.println(sequenceGenerator5.getSequence());
		
		System.out.println(sequenceGenerator6.getSequence());
		System.out.println(sequenceGenerator6.getSequence());
		}

}