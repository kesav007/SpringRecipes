package com.kesav.springreceips.chap03_03;

public interface SequenceDAO {
	
	public Sequence getSequence(String sequenceId);
	
	public int getNextValue(String sequenceId);

}
