package com.example.interview;

//public class C  implements  A,B{                  //duplicate defult method error we are getting in these case
public class C  implements  A{                  //duplicate defult method error we are getting in these case

	public static void main(String[] args) {
		// B b =  new C().foo();   // getting error can not convert to b type error 
		 A a= new C();
		 a.foo();
		 
		 C c = new C();
		 c.foo();
	}
	
}
