package com.kesav.springreceips.chap02_06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BannerTester {
	public static void main(String[] args) throws Throwable {
		ApplicationContext applicationContext = new GenericXmlApplicationContext("com/kesav/springreceips/chap02_6/beans.xml");
//		BannerLoader bannerLoader = applicationContext.getBean("bannerLoader", BannerLoader.class);	
//		bannerLoader.showBanner();
	}
}
