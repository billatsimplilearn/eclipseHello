package com.simplilearn.java.hello;


public class ThrowageDemo {

	// Throws
	// Throwable and all subclasses including all exceptions and erros
	// allow you to throw them

	// Throw is the act of stopping execution in a method and
	// exiting with a throwable

	// Throws is a declaration that a method may throw a checked
	// throwable (not a RuntimeException or subclass)

	public static void doInstruction ( String instruction ) throws SimonSaysException {
		System.out.println ( "Getting ready to do instruction" ) ;
		if ( instruction.startsWith ( "Simon says" ) ) {
			System.out.println ( instruction ) ;
		} else {
			throw new SimonSaysException ( "Simon didn't say " + instruction ) ;
		}
		System.out.println ( "We finished instruction" ) ;
	}

	public static void main ( String [ ] args ) throws SimonSaysException {
		try {
			doInstruction ( "Simon says clap your hands" ) ;
			doInstruction ( "Simon says stomp your feet" ) ;
			doInstruction ( "Jump up and down" ) ;
		} catch ( SimonSaysException e ) {
			throw new IllegalArgumentException ( "doInstruction failed", e ) ;
		}
	}
}
