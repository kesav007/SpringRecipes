package com.kesav.springreceips.chap02_09;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.kesav.springreceips.chap02.Product;

public class ProductCheckBeanPostProcesser implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Product){
			String productName = ((Product)bean).getName();
			System.out.println("In Product Check Bean Post Processer, Processing Product: " + productName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

}
