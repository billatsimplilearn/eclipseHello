package com.simplilearn.java.hello;

public class Person {

	private String first ;
	private String last ;
	private Address addr ;

	public Person ( String first, String last ) {
		setFirst ( first ) ;
		setLast ( last ) ;
	}

	@Override
	public String toString ( ) {
		return first + " " + last ;
	}

	public String getFirst ( ) {
		return first ;
	}
	
	public void setFirst ( String first ) {
		this.first = first ;
	}
	
	public String getLast ( ) {
		return last ;
	}
	
	public void setLast ( String last ) {
		this.last = last ;
	}
	
	public Address getAddr ( ) {
		return addr ;
	}
	
	public void setAddr ( Address addr ) {
		this.addr = addr ;
	}

}
