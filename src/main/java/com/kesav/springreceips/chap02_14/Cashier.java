package com.kesav.springreceips.chap02_14;

import org.springframework.beans.factory.BeanNameAware;

public class Cashier implements BeanNameAware {

	private String beanName;
	
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
