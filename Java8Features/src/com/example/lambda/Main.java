package com.example.lambda;

public class Main {

	public static void main(String[] args) {

		// Fourth concept   (using runable interface)
	/*	
		Student st = new Student();
		Thread t  = new Thread(st);
		t.run();
		
		// using lambda expression
		
		Runnable runable = ()->{
			for(int i=0; i<=10;i++) {
				System.out.println("Hello Lambda "+ i);
			}
		};
		
		Thread t1= new Thread(runable);
		t1.run();
		
		*/
		

		// Third concept (base on second concept) using lambda function

		/**
		 * Employee em = () -> { System.out.println("this is lambda expression"); };
		 * 
		 * em.getName();
		 */

		// Second concept

		/**
		 * Employee em = new Child(); em.getName();
		 */

		// first concept
		/**
		 * // anonymous class
		 * 
		 * Employee em = new Employee() {
		 * 
		 * @Override public void getName() { System.out.println("hello Anonymous
		 *           class");
		 * 
		 *           } };
		 * 
		 *           em.getName();
		 */

	}

}
