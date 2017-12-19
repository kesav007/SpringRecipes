package com.kesav.springreceips.chap03;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("sequenceDAO")
public class SequenceDAOImpl implements SequenceDAO {

	private Map<String, Sequence> sequences;
	private Map<String, Integer> values;

	public SequenceDAOImpl() {
		sequences = new HashMap<>();
		sequences.put("IT", new Sequence("IT", "30", "A"));
		values = new HashMap<>();
		values.put("IT", 10000);
	}

	@Override
	public Sequence getSequence(String sequenceId) {
		return sequences.get(sequenceId);
	}

	@Override
	public synchronized int getNextValue(String sequenceId) {
		int value = values.get(sequenceId);
		values.put(sequenceId, value + 1);
		return value;
	}

}
