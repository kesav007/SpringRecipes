package com.kesav.springreceips.chap02_06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.Resource;

public class BannerLoader {
	
	private Resource banner;
	
	public void setBanner(Resource banner) {
		this.banner = banner;
	}
	
	public void showBanner() throws Throwable{
		InputStream is = banner.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		while(true){
			String line = reader.readLine();
			if(line == null){
				break;
			}
			System.out.println(line);
		}
		reader.close();		
	}

}
