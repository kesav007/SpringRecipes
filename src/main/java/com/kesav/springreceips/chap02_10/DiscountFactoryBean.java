package com.kesav.springreceips.chap02_10;

import org.springframework.beans.factory.config.AbstractFactoryBean;

import com.kesav.springreceips.chap02.Product;

public class DiscountFactoryBean extends AbstractFactoryBean {

	private Product product;
	private double discount;

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	protected Object createInstance() throws Exception {
		product.setPrice(product.getPrice() * (1 - discount));
		return product;
	}

	@Override
	public Class getObjectType() {
		return product.getClass();
	}

	@Override
	public String toString() {
		return "DiscountFactoryBean [product=" + product + ", discount=" + discount + "]";
	}
	
	

}
