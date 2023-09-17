package com.simplilearn.java.hello;

public class Alligator extends Animal {

	private int teethCount = 87 ; // best practice to use private instead of default
	int toenailCount = 17 ; // this is a mistake.  Don't do this!

	@Override
	public String toString ( ) {
		return "Neighborhood friendly alligator with " + teethCount + " teeth and " + toenailCount + " toenails" ;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void digest(String food) {
		// TODO Auto-generated method stub
		
	}

	public int getToenailCount() {
		return toenailCount;
	}

	public void setToenailCount(int toenailCount) {
		this.toenailCount = toenailCount;
	}

}
