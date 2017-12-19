package com.kesav.springreceips.chap03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.kesav.springreceips.chap03");
		context.refresh();
		SequenceDAO sequenceDAO = context.getBean("sequenceDAO", SequenceDAO.class);
		System.out.println(sequenceDAO.getNextValue("IT"));
		System.out.println(sequenceDAO.getNextValue("IT"));
	}

}