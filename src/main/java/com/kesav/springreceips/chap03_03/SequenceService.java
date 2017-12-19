package com.kesav.springreceips.chap03_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SequenceService {
	
	@Autowired
	private SequenceDAO sequenceDAO;
	
	public void setSequenceDAO(SequenceDAO sequenceDAO) {
		this.sequenceDAO = sequenceDAO;
	}
	
	public String generate(String sequenceId) {
		Sequence sequence = sequenceDAO.getSequence(sequenceId);
		int value = sequenceDAO.getNextValue(sequenceId);
		return sequence.getPrefix() + value + sequence.getSuffix();
	}
	

}
