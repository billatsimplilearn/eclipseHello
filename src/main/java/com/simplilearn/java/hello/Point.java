// package goes first
package com.simplilearn.java.hello;

// class declaration goes after import statements and package
/**
 * Describes a point like would be found on a screen or other
 * two-dimensional surface.
 * @author bill
 *
 */
public class Point {

	// if we have the word static it is a "class" variable
	private static int maximumX = 4000 ;
	private static int maximumY = 3000 ;

	{
		Point a = new Point ( 242, 342, true ) ;
		int x = a.x ;
		// When referring to static variables or methods
		// from outside the class, we use the class
		// name before the dot.
		int otherX = Point.getMaximumX ( ) ;
		otherX = Point.maximumX ;
	}

	public static int getMaximumX ( ) {
		return maximumX ;
	}

	public static void setMaximumX ( int newValue ) {
		maximumX = newValue ;
	}

	// fields declarations go next
	// instance fields
	private int x ;
	private int y ;
	private boolean visible ;

	// constructors go next
	public Point ( int x, int y, boolean visible ) {
		this.x = x ;
		this.y = y ;
		this.visible = visible ;
	}

	// Instance methods follow:
	// Java "Bean" standard for getters / setters (aka accessors / modifiers)
	// Always (or mostly always) public so that others can see / use
	// Returning the same type as the field in question
	// Getters are called that because they start with get (unless boolean)
	// after the "get" is the name of the field.  Format for camelCase.
	// no parameters!
	// inside the body of the getter, most of the time, just return the field.
	public int getX ( ) {
		return x ;
	}

	public String getXasString ( ) {
		return String.valueOf ( x ) ;
	}

	// for boolean "getters"
	// we use the word "is" instead of get
	public boolean isVisible ( ) {
		return visible ;
	}

	// for a setter:
	// always public (or mostly always)
	// void return (means there is no return value)
	// next always start with the word "set"
	//		followed by the name of the field.  Format for camelCase.
	// Will take one parameter of the type that we are trying to set.
	// in the body, just set the field.
	public void setX ( int newValue ) {
		this.x = newValue ;
	}

	// Overloading: use different param types or different number of types
	public void setX ( String newValue ) {
		this.x = Integer.parseInt ( newValue ) ;
	}

	public void setX ( int newValueA, int newValueB ) {
		this.x = newValueA + newValueB ;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setVisible ( boolean newValue ) {
		this.visible = newValue ;
	}

	// business methods after that
	/**
	 * Finds the distance between two points in pixels.
	 * 
	 * @param that must be a non-null point
	 * @return distance in pixels
	 */
	public double distance ( Point that ) {
		return Math.sqrt ( ( this.x - that.x ) * ( this.x - that.x ) +     // can access that x and y
					( this.y - that.y ) * ( this.y - that.y ) ) ;	// even though private
	}

	// if there is a main (which most of the time there is not) it usually
	// goes either first or last
	public static void main ( String [ ] args ) {
		Point a = new Point ( 42, 24, true ) ;
		Point b = new Point ( 123, 341, true ) ;

		System.out.println ( a.distance ( b ) ) ;
	}
}
