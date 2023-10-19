package com.simplilearn.java.hello;

public class Address {

	private String street1 ;
	private String city ;
	private String state ;

	public String getStreet1 ( ) {
		return street1;
	}
	public void setStreet1 ( String street1 ) {
		this.street1 = street1;
	}
	public String getCity ( ) {
		return city;
	}
	public void setCity ( String city ) {
		this.city = city;
	}
	public String getState ( ) {
		if ( state == null ) {
			return "GA" ;
		} else {
			return state;
		}
	}
	public void setState ( String state ) {
		if ( state.length ( ) != 2 ) {
			throw new IllegalArgumentException ( "Bad state code" ) ;
		}
		this.state = state;
	}
}
