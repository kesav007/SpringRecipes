package com.kesav.springreceips.chap03_03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kesav.springreceips.chap02_03.DatePrefixGenerator;
import com.kesav.springreceips.chap02_03.PrefixGenerator;
import com.kesav.springreceips.chap02_03.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfig {
	
	@Bean
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator sequenceGenerator = new SequenceGenerator();
		sequenceGenerator.setPrefixGenerator(prefixGenerator());
		sequenceGenerator.setInitial(1000);
		sequenceGenerator.setSuffix("A");
		return sequenceGenerator;
	}

	@Bean
	public PrefixGenerator prefixGenerator() {
		DatePrefixGenerator prefixGenerator = new DatePrefixGenerator();
		prefixGenerator.setPattern("MMM-dd-yyyy-");
		return prefixGenerator;
	}
	
	@Bean
	public SequenceDAO sequenceDAO() {
		return new SequenceDAOImpl();
	}
	
}
