package com.kesav.springreceips.chap02;

public class Battery extends Product {

	private boolean rechargeable;	

	public Battery() {
	}

	public Battery(String name, double price) {
		super(name, price);
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

	@Override
	public String toString() {
		return "Battery [rechargeable=" + rechargeable + ", " + super.toString() + "]";
	}
	
	

}
