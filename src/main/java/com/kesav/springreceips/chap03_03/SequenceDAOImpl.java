package com.kesav.springreceips.chap03_03;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("sequenceDAO")
public class SequenceDAOImpl implements SequenceDAO {

	private Map<String, Sequence> sequences;
	private Map<String, Integer> values;
	private Map<String, SequenceGeneratorPrefix> sequenceGenerators;
	private PrefixGeneratorNew datePrefixGeneratorNew = new DatePrefixGeneratorNew("mmddyy");
	
	public SequenceDAOImpl() {
		sequences = new HashMap<>();
		sequences.put("IT", new Sequence("IT", "30", "A"));
		values = new HashMap<>();
		values.put("IT", 10000);
		sequenceGenerators = new HashMap<>();
		sequenceGenerators.put("Kesav", new SequenceGeneratorPrefix(1000, datePrefixGeneratorNew, "A"));
		sequenceGenerators.put("Nallan", new SequenceGeneratorPrefix(2000, datePrefixGeneratorNew, "B"));}

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

	@Override
	public SequenceGeneratorPrefix getSequenceGeneratorPrefix(String sequenceId) {
		return sequenceGenerators.get(sequenceId)
				;
	}

}
