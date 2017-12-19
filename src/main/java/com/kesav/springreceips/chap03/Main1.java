package com.kesav.springreceips.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("com/kesav/springreceips/chap03/beans.xml");
		SequenceDAO sequenceDAO = context.getBean("sequenceDAO", SequenceDAO.class);
		System.out.println(sequenceDAO.getNextValue("IT"));
		System.out.println(sequenceDAO.getNextValue("IT"));
	}

}