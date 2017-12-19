package com.kesav.springreceips.chap03_03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kesav.springreceips.chap02_03.SequenceGenerator;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.kesav.springreceips.chap03_03");
		context.refresh();
		SequenceGenerator sequenceGenerator = context.getBean("sequenceGenerator", SequenceGenerator.class);
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());

		SequenceService service = context.getBean("sequenceService", SequenceService.class);
		System.out.println(service.generate("IT"));
		System.out.println(service.generate("IT"));
		
		
	}
}
