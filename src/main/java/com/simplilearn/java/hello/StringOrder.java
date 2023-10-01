package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StringOrder {

	public static void main ( String [ ] argv ) {
//		listSortDemo();
//		setSortDemo();
//		mapSortDemo();
		lambdaDemo();
	}

	private static void lambdaDemo() {
		List <String> masterData = List.of ( "A", "a", "B", "b", "C", "c", "X", "x", "Y", "y", "Z", "z" ) ;
		List <String> strs = new ArrayList <> ( masterData ) ;
		strs.add(0, null);
		strs.sort ( (a, b) -> {
			if ( a == b ) {
				return 0 ;
			} else if ( a == null ) {
				return +1 ;
			} else if ( b == null ) {
				return -1 ;
			} else {
				return a.compareToIgnoreCase(b) ;
			}
		}) ;

		System.out.println ( strs ) ;
	}

	private static void mapSortDemo() {
		Map <String, Integer> scores = new TreeMap <> ( String.CASE_INSENSITIVE_ORDER ) ;
		scores.put ( "Bob", 82 ) ;
		scores.put ( "Charlie", 74 ) ;
		scores.put ( "Alice", 92 ) ;
		scores.put ( "Danny", 74 ) ;
		scores.put ( "alice", 85 ) ;

		for ( Map.Entry <String, Integer> score : scores.entrySet ( ) ) {
			System.out.println ( score.getKey ( ) + " received a " + score.getValue ( ) ) ;
		}
	}

	private static void setSortDemo ( ) {
		List <String> masterData = List.of ( "A", "a", "B", "b", "C", "c", "X", "x", "Y", "y", "Z", "z" ) ;
		Set <String> strs = new TreeSet <> ( ) ; // Naturally ordered
		strs.addAll ( masterData ) ;
		System.out.println ( strs ) ;

		Set <String> others = new TreeSet <> ( String.CASE_INSENSITIVE_ORDER ) ;
		others.addAll ( masterData ) ;
		System.out.println ( others ) ;

		strs.add ( "d" ) ;
		strs.add ( "D" ) ;
		others.add ( "d" ) ;
		others.add ( "D" ) ;

		System.out.println ( strs ) ;
		System.out.println ( others ) ;
	}

	private static void listSortDemo() {
		List <String> strs = new ArrayList <> ( List.of ( "A", "a", "B", "b", "C", "c", "X", "x", "Y", "y", "Z", "z" ) ) ;
		Collections.sort ( strs ) ;

		System.out.println ( strs ) ;

		List <String> others = new ArrayList <> ( List.of ( "A", "a", "B", "b", "C", "c", "X", "x", "Y", "y", "Z", "z" ) ) ;
		Collections.sort ( others, String.CASE_INSENSITIVE_ORDER ) ;
		System.out.println ( others ) ;

		strs.add ( "D" ) ;
		others.add ( "D" ) ;

		System.out.println ( strs ) ;
		System.out.println ( others ) ;
	}
}
