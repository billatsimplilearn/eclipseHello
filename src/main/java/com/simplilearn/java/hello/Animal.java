package com.simplilearn.java.hello;

public abstract class Animal implements Walkable {

	protected int countLegs ;
	private boolean alive = true ;

	public abstract void walk ( ) ;

	public void eat ( String food ) {
		digest ( food ) ;
	}

	// Declaring a "what" without specifying "how"
	protected abstract void digest ( String food ) ;
	// form of "polymorphism"

	public final boolean isAlive ( ) {
		return alive ;
	}

	public final void die ( ) {
		alive = false ;
	}
}
