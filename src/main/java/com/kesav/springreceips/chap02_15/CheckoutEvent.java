package com.kesav.springreceips.chap02_15;

import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class CheckoutEvent extends ApplicationEvent{
	
	private Date time;

	public CheckoutEvent(Object source, Date time) {
		super(source);
		this.time = time;
	}
	
	public Date getTime() {
		return time;
	}

}
