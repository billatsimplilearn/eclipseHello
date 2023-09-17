package com.simplilearn.java.hello;

public abstract class CardSuit {

	protected String name ;

	protected CardSuit ( String name ) {
		this.name = name ;
	}

	public String getName ( ) {
		return name ;
	}
}
