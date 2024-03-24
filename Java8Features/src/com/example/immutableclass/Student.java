package com.example.immutableclass;

final class Student {

	private int id;
	private String studentName;
	private int age;

	public Student(int id, String studentName, int age) {
		this.id = id;
		this.studentName = studentName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getAge() {
		return age;
	}

}


// Rules for making immutable class

 /**
   make a class is final so no one extract the class
   
    make all field private no one access the filed or data of class
    
    use constructor to intilized the values of filed, 
    
    don't use setter methods, so after creating the object we can not modified the values
    
    use getter method to access the objects values
    
    Benefits :
    
    they are thread safe
    
    they can be cached more easily
    
    they can be use to create more robust and reliable code
   
  */
