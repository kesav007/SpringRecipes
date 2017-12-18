package com.kesav.springreceips.chap02_02;

public class SequenceGenerator {

	private String prefix;
	private String suffix;
	private int initial;
	private int counter;

	public SequenceGenerator(String prefix, int initial) {
		this.prefix = prefix;
		this.initial = initial;
	}

	public SequenceGenerator(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}
	

	public SequenceGenerator(int initial1, String suffix1) {
		this.suffix = suffix1;
		this.initial = initial1;
	}

	public SequenceGenerator() {
		// TODO Auto-generated constructor stub
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public SequenceGenerator(String prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
	}

}