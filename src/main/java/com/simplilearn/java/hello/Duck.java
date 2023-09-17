package com.simplilearn.java.hello;

public class Duck extends Animal {

	private String feet = "webbed" ;

	// Cannot do this because "die()" is final:
	/*
	public void die ( ) {
		System.out.println ( "Cheat death" ) ;
	}
	*/

	public void walk ( ) {
		System.out.println ( "Waddle with " +  this.countLegs + " legs" ) ;
	}

	public void quack ( ) {
		;
	}

	@Override
	public String toString ( ) {
		return "Daffy" ;
	}

	public String getFeet ( ) {
		return feet ;
	}

	public void setFeet ( String feet ) {
		this.feet = feet ;
	}

	@Override
	protected void digest(String food) {
		System.out.println ( "digesting " + " food " + " in one birdlike stomach" ) ;
	}
}
