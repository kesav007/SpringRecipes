package com.kesav.springreceips.chap02_10;

import java.util.Map;

import com.kesav.springreceips.chap02.Product;

public class ProductCreatorInstanceFactoryBean {
	
	private Map<String, Product> products;
	
	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}
	
	public Product createProduct(String productId){
		Product product = products.get(productId);
		if(product != null){
			return product;
		}
		throw new IllegalArgumentException("Invalid Product");
	}
}