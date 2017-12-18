package com.kesav.springreceips.chap02_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_03/beans.xml");
		SequenceGenerator sequenceGenerator = applicationContext.getBean("sequenceGenerator", SequenceGenerator.class);
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());		
		}

}
