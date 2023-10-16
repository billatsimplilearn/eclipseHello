package com.simplilearn.java.hello.driversandcars;

import java.io.Serializable ;
import java.util.Objects ;

/*
 * Java Bean Standard
 */
public class Computer implements Serializable {

	private static final long serialVersionUID = 7062279303001343478L ;

	// Attributes / Fields
	private String cpu ;  // Attribute but not a property because not exposed
	private String hardDrive ;
	private String keyboard ;
	private boolean isOn ;
	private String id ;

	// no-arg constructor.  Optional.  Exist exactly like this even if
	// you don't define it yourself.
	/*
	public Computer ( ) {
		;
	}
	*/

	public boolean equals ( Object o ) {
		if ( o instanceof Computer that ) {
			// For an entity, inside this block I will compare ids
			return Objects.equals ( this.id, that.id ) ;
			// For a non-entity (value), we will compare the other attributes
		} else {
			return false ;
		}
	}

	// If we define an equals() we must also define hashCode.
	// all the attributes we include in the hash must be the ones
	// that are used in the equals()!
	public int hashCode ( ) {
		return Objects.hash ( id ) ;
	}

	// Properties Below:

	public String getOnLight ( ) { // Property but not attribute
		return isOn ? "Green" : "Red" ;
	}

	public String getHardDrive ( ) {
		return hardDrive ;
	}

	public void setHardDrive ( String hardDrive ) {
		this.hardDrive = hardDrive ;
	}

	public String getKeyboard ( ) {
		return keyboard ;
	}

	public void setKeyboard ( String keyboard ) {
		this.keyboard = keyboard ;
	}

	public boolean isOn ( ) {
		return isOn ;
	}

	public void setOn ( boolean isOn ) {
		this.isOn = isOn ;
	}

	public String getId ( ) {
		return id;
	}

	public void setId ( String id ) {
		this.id = id;
	}

	// What we expose to the outside are properties
}
