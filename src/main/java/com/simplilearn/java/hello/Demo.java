package com.simplilearn.java.hello;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {

	public static void main ( String [ ] args ) throws Exception {
//		integerDemo ( ) ;
//		floatingPointDemo ( ) ;
//		autoBoxDemo ( ) ;
//		characterDemo();
//		booleanDemo ( ) ;
//		stringDemo();
//		intDivisionExample();
//		castDemo();
//		System.out.println ( round ( 5.999999999 ) ) ;
//		badCast ( ) ;
//		System.out.println ( "true xor true: " + xor ( true, true ) ) ;
//		System.out.println ( "true xor false: " + xor ( true, false ) ) ;
//		System.out.println ( "false xor true: " + xor ( false, true ) ) ;
//		System.out.println ( "false xor false: " + xor ( false, false ) ) ;
//		arrayDemo();
		System.out.println ( coinFlip ( ) ) ;
		System.out.println ( coinFlip ( ) ) ;
		System.out.println ( coinFlip ( ) ) ;
		System.out.println ( coinFlip ( ) ) ;
		System.out.println ( coinFlip ( ) ) ;
		System.out.println ( coinFlip ( ) ) ;
		System.out.println ( coinFlip ( ) ) ;
	}

	private static void arrayDemo() {
		String [ ] strs = new String [ ] { "A", "Bunch", "Of", "Strings" } ;
		strs = new String [ 4 ] ;
		Date [ ]  adfdf ;
		List [ ] sdfsfd ;
		UnsupportedEncodingException [ ] sdf ;
		int [ ] sdfsd ;
		System.out.println ( strs [ 2 ] ) ; // "Of"
	}

	public static String coinFlip ( ) {
		return round ( Math.random ( )  ) == 1 ? "Heads" : "Tails" ;
	}

	public static String otherCoinFlip ( ) {
		double randomVal = Math.random ( ) ;
		int roundedRandom = round ( randomVal ) ;
		boolean isHeads = roundedRandom == 1 ;
		if ( isHeads ) {
			return "Heads" ;
		} else {
			return "Tails" ;
		}
	}

	/**
	 * Returns the xor between left and right.
	 *
	 * @param left
	 * @param right
	 * @return
	 */
	public static boolean xor ( boolean left, boolean right ) {
/** /
		if ( left && right ) {
			return false ;
		} else if ( left || right ) {
			return true ;
		} else {
			return false ;
		}
/**/
//		return left != right ;
		// left or right are true and not both
//		return ( left || right ) && ! ( left && right ) ;
		// left and not right, or not left and right
		return left && ! right || ! left && right ;
	}

	private static void badCast ( ) {
		long a = Long.MAX_VALUE ;
		int b = ( int ) a ;
		System.out.println ( a + " cast to " + b ) ;
	}

	private static int round ( double d ) {
		int roundedValue = ( int ) ( d + 0.5 ) ;
		return roundedValue ;
	}

	private static void castDemo() {
		double a = 5.99999 ;
		int b = ( int ) a ;

		System.out.println ( "a: " + a ) ;
		System.out.println ( "b: " + b ) ;

		int c = 5 ;
		double d = c ;
		System.out.println ( "c: " + c ) ;
		System.out.println ( "d: " + d ) ;

		int e = 5 ;
		long f = c ;
		System.out.println ( "e: " + e ) ;
		System.out.println ( "f: " + f ) ;

		long g = 5 ;
		int h = c ;
		System.out.println ( "g: " + g ) ;
		System.out.println ( "h: " + h ) ;
	}

	private static void intDivisionExample() {
		int numerator = 8 ;
		int denominator = 3 ;
		System.out.println ( "Fraction : " + ( ( numerator / ( double ) denominator ) ) ) ; // 2.6667
	}

	private static void stringDemo() {
		String s = "" ;
		System.out.println ( "Value is " + s + ", and is value null ? " + ( s == null ) ) ;
		s = null ;
		System.out.println ( "Value is " + s + ", and is value null ? " + ( s == null ) ) ;
	}

	private static void booleanDemo ( ) {
		boolean a = true ;
		boolean b = false ;
		Boolean c = a ;
		Boolean d = b ;
		Boolean e = Boolean.TRUE ;
		Boolean f = Boolean.FALSE ;
		Boolean g = null ;
	}

	private static void characterDemo() throws UnsupportedEncodingException {
		char d = '文' ;
		System.out.println ( d ) ;
		char c = "Hello".charAt ( 2 ) ;
		System.out.println ( c ) ;
		String name = "Hello文" ;
		String s = "Hello World" ;
		byte [ ] bb = s.getBytes ( ) ;
		s = new String ( bb, "UTF-16" ) ;
		System.out.println ( s ) ;
		Character boxed = d ;
	}

	private static void autoBoxDemo ( ) {
		Object arr = new Object [ ] {
				"strnig",
				new Date ( ),
				1
		} ;

		int a = 5 ;
		Integer b = a ;
		int c = new Integer ( 6 ) ;
		List <Integer> listOfNum = new ArrayList <> ( ) ;
		listOfNum.add ( new Integer ( 9 ) ) ;
		listOfNum.add ( 11 ) ;
	}

	private static void floatingPointDemo ( ) {
		double d = 2.49 ;  // Mainly use these
		float f = 2.49f ; // Don't use these
		// if still not precise enough, BigDecimal
		double negInf = Double.NEGATIVE_INFINITY ;
		double posInf = Double.POSITIVE_INFINITY ;
		double nan = Double.NaN ;

		System.out.println ( "Double: " + d ) ;
		System.out.println ( "Float: " + f ) ;
		System.out.println ( "Negative Infinity: " + negInf ) ;
		System.out.println ( "Positive Infinity: " + posInf ) ;
		System.out.println ( "Not a Number: " + nan ) ;
	}

	private static void integerDemo ( ) {
		System.out.println ( "Hello Demo!" ) ;
		System.out.println ( "Largest integer is " + Integer.MAX_VALUE ) ;
		System.out.println ( "Smallest integer is " + Integer.MIN_VALUE ) ;
		System.out.println ( "Largest long is " + Long.MAX_VALUE ) ;
		System.out.println ( "Smallest long is " + Long.MIN_VALUE ) ;
		System.out.println ( "Largest short is " + Short.MAX_VALUE ) ;
		System.out.println ( "Smallest short is " + Short.MIN_VALUE ) ;
		System.out.println ( "Largest byte is " + Byte.MAX_VALUE ) ;
		System.out.println ( "Smallest byte is " + Byte.MIN_VALUE ) ;
		// if still not big / small enough, use BigInteger
	}

	String soliloquy = """
			'Twas brillig, and the slithy toves
			      Did gyre and gimble in the wabe:
			All mimsy were the borogoves,
			      And the mome raths outgrabe.
			"Beware the Jabberwock, my son!
			      The jaws that bite, the claws that catch!
			Beware the Jubjub bird, and shun
			      The frumious Bandersnatch!"
			""" ;

}
