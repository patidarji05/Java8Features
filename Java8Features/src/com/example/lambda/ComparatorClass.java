package com.example.lambda;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		return b - a;
	}

}
