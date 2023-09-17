package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.List;

public class ObjectDemo {

	public static void main ( String [ ] argv ) throws Throwable {
//		getClassDemo ( ) ;
//		toStringDemo ( ) ;
//		equalsDemo ( ) ;
//		stringEqualDemo ( ) ;
		hashCodeDemo ( ) ;
	}

	private static void hashCodeDemo ( ) {
		// if two objects are equal with the .equals() method
		// then they MUST have the same hashcode.
		// the reverse is not necessarily true
		Dog d = new Dog ( "Zafir", "dachtshund", 5 ) ;
		Dog e = new Dog ( "Zafir", "dachtshund", 4 ) ;
		int hashFirst = d.hashCode ( ) ;
		int hashSecond = e.hashCode ( ) ;
		// Therefore we MUST use the same attributes
		// to calculate the hashCode as what we use
		// in the equals.

		System.out.println ( d.equals ( e ) + " and " + ( hashFirst == hashSecond ) ) ;

		String a = "Siblings";
		String b = "Teheran";
		String c = new String ( "Siblings" ) ;
		System.out.println ( "Does a == c? " + ( a == c ) ) ;
		System.out.println ( "Does a equals b? " + a.equals ( b ) ) ;
		System.out.println ( "Does a equals c? " + a.equals ( c ) ) ;
		hashFirst = a.hashCode ( ) ;
		hashSecond = b.hashCode ( ) ;
		int hashThird = b.hashCode ( ) ;
		System.out.println ( "hash for " + a + " is " + a.hashCode ( ) ) ;
		System.out.println ( "hash for " + b + " is " + b.hashCode ( ) ) ;
		System.out.println ( "hash for " + c + " is " + c.hashCode ( ) ) ;
	}

	// Don't need to know this very much
	private static void stringEqualDemo ( ) {
		String s = "hello" ; // new String ( "hello" )
		String t = "hello" ; // new String ( "hello" )
		String v = new String ( "hello" ).intern ( ) ;

		System.out.println ( s == t ) ;
		System.out.println ( s == v ) ;
		// I would still only trust the .equals()
		// because we don't know where these strings have been
	}

	private static void equalsDemo() {
		Dog candy = new Dog ( "Candy", "Miniature Schnauzer", 7 ) ;
		Dog kye = new Dog ( "Kye", "Mutt", 12 ) ;

//		System.out.println ( candy == kye ) ;
//		System.out.println ( candy == candy ) ;

		Dog anotherCandy = new Dog ( "Candy", "Miniature Schnauzer", 8 ) ;
//		System.out.println ( candy == anotherCandy ) ; // even though everything is the same
														// they are at two different
														// memory locations
		// == always compares value ... but what that means is different
		// 1 == 2, we are comparing integer values
		// true == false, we are comparing boolean values
		// candy == kye, we are comparing "References" (memory locations)
		// we use equals() to compare equality based on business definitions

		Alligator alli = new Alligator ( ) ;
		compare ( "Two different variables", candy, kye ) ;
		compare ( "Same variable twice", candy, candy ) ;
		compare ( "Same animal, two variables", candy, anotherCandy ) ;
		compare ( "Dogs vs alligators", candy, alli ) ;

		
		if ( candy != null ) {
			; // o
		}
	}

	private static void compare ( String msg, Object a, Object b ) {
		boolean areTheyEqual = a.equals ( b ) ;
		System.out.println ( msg + ": " + areTheyEqual ) ;
	}

	private static void toStringDemo ( ) {
		Alligator d = new Alligator ( ) ;
		System.out.println ( d ) ;
		Dog candy = new Dog ( "Candy", "Miniature Schnauzer", 7 ) ;
		Dog kye = new Dog ( "Kye", "Mutt", 12 ) ;

		System.out.println ( candy ) ;
		System.out.println ( kye.toString ( ) ) ;
	}

	private static void getClassDemo ( ) {
		List <String> arr = new ArrayList <> ( ) ;
		Class <? extends List> czz = arr.getClass ( ) ;
		System.out.println ( czz ) ;
//		System.out.println ( czz.getName ( ) ) ;
//		System.out.println ( czz.getSimpleName ( ) ) ;
//		System.out.println ( czz.getSuperclass ( ) ) ;
//		Field elementDataField = czz.getDeclaredField ( "elementData") ;
	}
}
