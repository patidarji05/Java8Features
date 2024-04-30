package com.example.interview;

public interface B {

	default void foo() {
		System.out.println("B");
	}
}
