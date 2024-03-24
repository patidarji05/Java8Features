package com.example.immutableclass;

public class Demo {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Pradeep", 23);

		/**
		 * after object creation we can not modified the values of object because there
		 * is no setter methods in these class
		 */
		System.out.println("Student id is : " + s1.getAge());
		System.out.println("Student name is : " + s1.getStudentName());
		System.out.println("Student age is : " + s1.getAge());
	}

}
