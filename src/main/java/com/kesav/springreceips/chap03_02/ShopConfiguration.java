package com.kesav.springreceips.chap03_02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kesav.springreceips.chap02.Battery;
import com.kesav.springreceips.chap02.Disc;
import com.kesav.springreceips.chap02.Product;

@Configuration
public class ShopConfiguration {

	@Bean
	public Product aaa() {
		Battery aaa = new Battery("AAA", 2.5);
		aaa.setRechargeable(true);
		return aaa;
	}

	@Bean
	public Product cdrw() {
		Disc cdrw = new Disc("CD-RW", 3.5);
		cdrw.setCapacity(700);
		return cdrw;
	}

	@Bean
	public Product dvdrw() {
		Disc dvdrw = new Disc("DVD-RW", 4.5);
		dvdrw.setCapacity(700);
		return dvdrw;
	}

}