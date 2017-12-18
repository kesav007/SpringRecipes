package com.kesav.springreceips.chap02_04;

import java.util.List;

public class SequenceGenerator {

	private List<Object> suffixes;
	private String prefix;
	private int initial;

	private int counter;

	public SequenceGenerator() {
	}

	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		for (Object object : suffixes) {
			buffer.append("-");
			buffer.append(object);
		}
		return buffer.toString();
	}

}
