package com.kesav.springreceips.chap02;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> products = new ArrayList<Product>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public double getTotal(){
		double total = 0;
		for (Product product : products) {
			total += product.getPrice()*product.getDiscount();
		}
		return total;
	}

}
