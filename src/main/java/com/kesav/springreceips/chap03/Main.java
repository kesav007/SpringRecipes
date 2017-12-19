package com.kesav.springreceips.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kesav.springreceips.chap02_01.SequenceGenerator;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/kesav/springreceips/chap03/beans.xml");
		SequenceGenerator sequenceGenerator = context.getBean("sequenceGenerator", SequenceGenerator.class);
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());
	}

}
