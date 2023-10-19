package com.simplilearn.java.hello;

import java.util.LinkedList ;
import java.util.List ;
import java.util.Queue ;

public class Reversi {

	public String reverse ( String s ) {
		String retVal = "" ;
		for ( int i = s.length ( ) - 1 ; i >= 0 ; --i ) {
			char c = s.charAt ( i ) ;
			retVal += c ;
		}
		return retVal ;
	}

	public String reverseRecursively ( String s ) {
		// Terminal Step
		if ( s.length ( ) == 1 || s.length ( ) == 0 ) {
			System.out.println ( "Finished!  " + s ) ;
			return s ;
		} else {
			// Incremental Step
			// we know we can do this because if we're in the else
			// our string is greater than size 1.
			char first = s.charAt ( 0 ) ;
			String rest = s.substring ( 1 ) ;
			System.out.println ( "Reverse Recursively: " + s + " is split into " + first + " and " + rest ) ;
			return reverseRecursively ( rest ) + first ;
		}
	}

	public static void main ( String [ ] argv ) {
		Reversi r = new Reversi ( ) ;	
		System.out.println ( r.reverseRecursively ( "01234" ) ) ;
		Queue <String> groceryLine = new LinkedList <> ( ) ;
		groceryLine.addAll ( List.of ( "Abby", "Bhargav", "Chris" ) ) ;
		recursivelyGoThroughLine ( groceryLine ) ;
	}

	private static void recursivelyGoThroughLine ( Queue <String> groceryLine ) {
		if ( groceryLine.isEmpty ( ) ) {
			return ;
		}
		String person = groceryLine.poll ( ) ; // Removes the first person
												// and so we get one step closer
												// to finish
		System.out.println ( "Now serving " + person ) ;
		recursivelyGoThroughLine ( groceryLine ) ;
	}
}
