package com.kesav.springreceips.chap02_10;

import com.kesav.springreceips.chap02.Product;
import com.kesav.springreceips.chap02.Disc;
import com.kesav.springreceips.chap02.Battery;

public class ProductCreator {
	
	public static Product createProduct(String product){

		if("aaa".equals(product)){
			return new Battery("AAA", 2.5);
		}

		if("cdrw".equals(product)){
			return new Disc("CD-RW", 3.5);
		}

		if("dvdrw".equals(product)){
			return new Disc("DVD-RW", 4.5);
		}
		throw new IllegalArgumentException("Unknown Product");
	}

}
