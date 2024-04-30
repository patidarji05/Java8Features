package com.example.interview;

final class ImmutableClass {

	private int id;
	private String name;
	private Address address; // holding the referance of muttable class

	public ImmutableClass(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
	
	
	
	
}


// these class  konw is not immutale becuase we are to able the modified the object of address 
// through muttable class.  to make these class is immutable make address class is also immutable class
