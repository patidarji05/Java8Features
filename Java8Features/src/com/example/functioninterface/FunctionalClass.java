package com.example.functioninterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;

public class FunctionalClass {

	public static void main(String[] args) {

		final Logger log = Logger.getAnonymousLogger();

		Function<String, Integer> fn = x -> x.length();

		log.info("fn " + fn.apply("Pradeepo"));

		Function<String, String> fn1 = x -> x.toUpperCase();
		log.info("fn1 " + fn1.apply("Pradeepo"));

		Function<String, String> fn2 = x -> x.substring(0, 3);
		log.info("fn3 " + fn2.apply("Pradeep patidar"));

		Function<List<Student>, List<Student>> fn3 = li -> {

			List<Student> li1 = new ArrayList<>();
			for (Student s1 : li) {
				if (fn2.apply(s1.getName()).equalsIgnoreCase("pra")) {
					li1.add(s1);
				}
			}
			return li1;

		};

		Function<List<Student>, List<String>> fn4 = li -> {
			List<String> li1 = new ArrayList<>();

			for (Student s1 : li) {
				li1.add(s1.getName());
			}
			return li1;
		};

		Student s1 = new Student(1, "pradeep");
		Student s2 = new Student(2, "Aryan");

		Student s3 = new Student(3, "Ramesh");
		Student s4 = new Student(4, "Surya");

		List<Student> li = Arrays.asList(s1, s2);

		log.info("fun3  " + fn3.apply(li));

		List<Student> li2 = Arrays.asList(s1, s2, s3, s4);

		log.info("fn4: " + fn4.apply(li2));
	}

}
/**
Synatx =  Function<Input, Output> fn= ()-> {};
any type of argument and any type of string return 

 */
