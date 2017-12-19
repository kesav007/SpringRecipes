package com.kesav.springreceips.chap03_03;

public class Sequence {

	private String id;
	private String prefix;
	private String suffix;
	
	public Sequence(String prefix, String id, String suffix) {
		this.id = id;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public String getId() {
		return id;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	

}
