package com.simplilearn.java.hello.driversandcars;

import java.util.ArrayList ;
import java.util.List ;

public class Car {

	private List <DrivingExperience> experiences = new ArrayList <> ( ) ;
	private String id ;

	public String getId ( ) {
		return id;
	}

	// Alternate way of doing frozen,
	// we can set it up ONCE and only once with a setter.
	public void setId ( String id ) {
		if ( this.id != null ) {
			throw new IllegalArgumentException ( "id is already set" ) ;
		}
		this.id = id;
	}

	// This is an ADD-ONLY has-a relationship
	// and works well when it is a one-to-many,
	// and the "many" side has a frozen record.
	public void addExperience ( DrivingExperience exp ) {
		experiences.add ( exp ) ;
	}
}
