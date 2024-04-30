package com.example.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class FastAndSafeFail {

	public static void main(String[] args) {

		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		for (Integer integer : list) {
			list.add(7); 
		}

		for (Integer integer : list) {
			System.out.println(integer);
		}

		/*
		 * List<Integer> list = new ArrayList<>();
		 * 
		 * list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
		 * 
		 * for (Integer integer : list) { list.add(7); // it will gibe
		 * concurrentMoification errror }
		 * 
		 * 
		 * for (Integer integer : list) { System.out.println(integer); }
		 * 
		 */

	}

}
