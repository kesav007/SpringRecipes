package com.kesav.springreceips.chap02_12;

public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
	
	public ArithmeticCalculatorImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double add(double a, double b) {
		System.out.println(a+b);
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		System.out.println(a-b);
		return a-b;
	}

	@Override
	public double mul(double a, double b) {
		System.out.println(a*b);
		return a*b;
	}

	@Override
	public double div(double a, double b) {
		System.out.println(a/b);
		return a/b;
	}

}
