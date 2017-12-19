package com.kesav.springreceips.chap03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kesav.springreceips.chap02_01.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfig {
	
	@Bean
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator sequenceGenerator = new SequenceGenerator();
		sequenceGenerator.setPrefix("30");
		sequenceGenerator.setInitial(1000);
		sequenceGenerator.setSuffix("A");
		return sequenceGenerator;
	}

}
