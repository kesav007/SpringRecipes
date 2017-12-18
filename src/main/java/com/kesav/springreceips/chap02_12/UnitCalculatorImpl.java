package com.kesav.springreceips.chap02_12;

public class UnitCalculatorImpl implements UnitCalculator {
	
	public UnitCalculatorImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double kilogramToPound(double kilogram) {
		double pound = kilogram * 2.2;
		System.out.println(pound);
		return pound;
	}

	@Override
	public double kilometerToMile(double kilometer) {
		double mile = kilometer * 0.62;
		System.out.println(mile);
		return mile;
	}

}
