package com.simplilearn.java.hello;

import java.util.List;

public class SimilarBread {

	public boolean matchBread ( List <String> sandwich1, List <String> sandwich2 ) {
		// NOW, I can solve it
		return false ; // just temporarily
	}

	private List <String> extractBreads ( List <String> sandwich ) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main ( String [ ] args ) {
		SimilarBread breadTester = new SimilarBread ( ) ;
	
		// One bread matches but not both.
		List <String> pbj = List.of ( "pumpernickel", "peanut butter", "jelly", "rye" ) ;
		List <String> cbs = List.of ( "rye", "corned beef", "mustard", "rye" ) ;
		// Expect non-match
		boolean result = breadTester.matchBread(pbj, cbs) ;
		System.out.println ( result ) ;

		List <String> s1 = List.of ( "brown bread", "tuna", "bacon", "lettuce", "toast" ) ;
		List <String> s2 = List.of ( "toast", "cheese", "mustard", "brown bread" ) ;
		// expect match
		result = breadTester.matchBread ( s1, s2 ) ;
		System.out.println ( result ) ;
	}
}
