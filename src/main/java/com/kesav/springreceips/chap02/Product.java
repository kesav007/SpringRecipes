package com.kesav.springreceips.chap02;

public abstract class Product {

	private String name;
	private double price;
	private double discount;

	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + ", discount=" + discount;
	}

}
