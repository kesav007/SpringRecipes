package com.kesav.springreceips.chap03;

public class Sequence {

	private String id;
	private String prefix;
	private String suffix;
	
	public Sequence() {
	}

	public Sequence(String prefix, String id, String suffix) {
		this.id = id;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

}
