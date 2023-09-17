package com.simplilearn.java.hello;

public class GraphicsProgram {

	public static void main ( String [ ] args ) {
		Point a = new Point ( 42, 24, false ) ;
		Point b = new Point ( 123, 341, false ) ;

		System.out.println ( "Position of a is (" + a.getX() + ", " + a.getY() + ")." ) ;
	}
}
