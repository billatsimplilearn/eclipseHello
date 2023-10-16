package com.simplilearn.java.hello;


public class SimonSaysException extends Exception {

	private static final long serialVersionUID = -1664348653287712026L ;
	// no-arg (no argument):
	public SimonSaysException ( ) { super ( ) ; }
	// String contains a message that should give context to your exception
	// can give what arguments/variables are available
	public SimonSaysException ( String s ) { super ( s ) ; }
	// t gives an underlying cause
	public SimonSaysException ( Throwable t ) { super ( t ) ; }
	// takes both message and underlying cause
	public SimonSaysException ( String s, Throwable t ) { super ( s, t ) ; }
}
