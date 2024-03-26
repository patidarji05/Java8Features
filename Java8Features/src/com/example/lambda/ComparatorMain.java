package com.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorMain {
	
	public static void main(String[] args) {
		
		
		Car c = new Car(1, "Maruti");
		Car c1 = new Car(2, "Tata");
		Car c2 = new Car(3, "Honda");
		Car c3 = new Car(4, "Enova");
		
		List<Car> listCar = new ArrayList<>();
		listCar.add(c1);
		listCar.add(c2);
		listCar.add(c3);
		listCar.add(c);
		
		System.out.println(listCar);
		Collections.sort(listCar, (a,b) -> b.getId() - a.getId());
		System.out.println(listCar);
		
		
		
		//using TreeMap
		Map<String, Integer> map = new TreeMap<>();
		map.put("d", 23);
		map.put("x", 27);
		map.put("a", 02);
		map.put("m", 15);
		
		System.out.println(map);
		
		Map<Integer, String> map1 = new TreeMap<>((a,b)-> b-a);
		map1.put(23, "sd");
		map1.put(02, "s");
		map1.put(56, "i");
		map1.put (17, "d");
		map1.put(02, "d");
		
		System.out.println(map1);
		
		
		
		// Using TreeSet
	
		Set<Integer>  set = new TreeSet<>();
		set.add(12);
		set.add(34);
		set.add(23);
		set.add(8);
		set.add(99);
		set.add(6);
	
		System.out.println(set);
		Set<Integer> set1 = new TreeSet<>((a,b) -> b-a);
		
		set1.add(12);
		set1.add(34);
		set1.add(23);
		set1.add(8);
		set1.add(99);
		set1.add(6);
		
		System.out.println(set1);
		
		
		
		
		// USing lambda expression
	
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(23);
		list.add(8);
		list.add(99);
		list.add(6);
		
		Collections.sort(list, (a,b)->	b-a);   // using lambda expresion implement comparator inteface compare to method
		System.out.println(list);
		
		
		
		
		
		// using implemet comparator interface method campareTo
	/**	List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(23);
		list.add(8);
		list.add(99);
		list.add(6);
		
		Collections.sort(list);  //ASC order
		System.out.println(list);
		Collections.sort(list, new ComparatorClass());  //DESC order
		System.out.println(list);*/
		
	}

}
