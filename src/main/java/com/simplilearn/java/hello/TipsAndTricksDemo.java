package com.simplilearn.java.hello;

import java.util.ArrayList ;
import java.util.Arrays ;
import java.util.Collections ;
import java.util.HashMap ;
import java.util.List ;
import java.util.Map ;
import java.util.Set ;
import java.util.TreeSet ;

public class TipsAndTricksDemo {

	public static void main ( String [ ] argv ) throws Throwable {
//		listOfDemo ( ) ;
//		setOfDemo ( ) ;
//		mapOfDemo ( ) ;
//		varArgsDemo ( 5, 3.0, "I", "Can", "Add", "Many" ) ;
//		asListDemo ( ) ;
//		remutabilityDemo ( ) ;
//		collectionConversionDemo ( ) ;
//		mapCopyConstructorDemo ( ) ;
//		immutabilityOfExistingCollectionsDemo ( ) ;
		collectionOwnershipDemo ( ) ;
	}

	private static void collectionOwnershipDemo ( ) {
		Person a = new Person ( "Alice", "Smith" ) ;
		Person b = new Person ( "Bob", "Smith" ) ;

		List <Person> people = new ArrayList <> ( List.of ( a, b ) ) ;
		Map <String, Person> peopleAsMap = Map.of ( a.getFirst ( ), a, b.getFirst ( ), b ) ;

		System.out.println ( "People as List: " + people ) ;
		System.out.println ( "People as Map: " + peopleAsMap ) ;

//		people.get ( 0 ).setLast ( "Brown" ) ;
		Person c = people.get ( 0 ) ;

		System.out.println ( "People as List: " + people ) ;
		System.out.println ( "People as Map: " + peopleAsMap ) ;
	}

	private static void immutabilityOfExistingCollectionsDemo ( ) {
		List <String> mutableStrings = collectionConversionDemo ( ) ;
		mutableStrings.add ( "S" ) ;
		List <String> immutableStrings = Collections.unmodifiableList ( mutableStrings ) ;
		immutableStrings.add ( "T" ) ;
	}

	private static void mapCopyConstructorDemo ( ) {
		Map <String, String> strs = Map.of ( "A", "First letter", "B", "Second Letter", "C", "Third Letter", "D", "Third Letter", "E", "5", "F", "6", "G", "7", "H", "8", "I", "9", "J", "10" ) ;
		Map <String, String> mutableStrings = new HashMap <> ( strs ) ;
		mutableStrings.put ( "K", "11" ) ;
		System.out.println ( mutableStrings ) ;
	}

	private static List <String> collectionConversionDemo ( ) {
		Set <String> foo = Set.of ( "A", "C", "Z", "B", "J" ) ;
		System.out.println ( "Immutable unordered " + foo ) ;
		foo = new TreeSet <> ( foo ) ;
		foo.add ( "K" ) ;
		System.out.println ( "Mutable sorted set " + foo ) ;

		List <String> bar = new ArrayList <String> ( foo ) ;
		System.out.println ( "Mutable ordered list " + bar ) ;
		bar.add ( "G" ) ;
		System.out.println ( "Mutable ordered list after change " + bar ) ;

		return bar ;
	}

	private static void remutabilityDemo ( ) {
		List <String> immutable = List.of ( "A", "B", "C" ) ;
//		immutable.add ( "D" ) ; // won't work
		List <String> mutable = new ArrayList <> ( immutable ) ;
		mutable.add ( "D" ) ; // WILL work

		System.out.println ( mutable ) ;
	}

	private static void asListDemo ( ) {
		// First way to use asList (with varargs)
		callThing ( "A", "B", "C", "D", null ) ;
		// Second way to use asList (from array)
		String [ ] strs = new String [ ] { "E", "F", "G" } ;
		List <String> asList = Arrays.asList ( strs ) ;
		System.out.println ( asList ) ;

		// Third way to use asList, just as is
		List <String> justHere = Arrays.asList ( "H", "J", "K" ) ;
		// Basically this is the same as doing List.of
		// except you have to type more characters
		// and this allows nulls
		System.out.println ( justHere ) ;
	}

	private static void callThing ( String ... strings ) {
		// null IS allowed
		List <String> asList = Arrays.asList ( strings ) ;
		System.out.println ( asList ) ;
//		asList.add ( "D" ) ; // still immutable though
	}

	private static void addPost ( String name, String title, String description, String textContent, String ... tags ) {
		// tags are now optional, can have zero or many
	}

	private static void varArgsDemo ( int j, double d, String ... strings ) {
		for ( int i = 0 ; i < strings.length ; i++ ) {
			System.out.println ( strings [ i ] ) ;
		}
		System.out.println ( "Done!" ) ;
//		addPost ( "Name", "Title", "Description", "Some long boring post" ) ;
	}

	private static void mapOfDemo ( ) {
		// Neither null keys nor null values allowed
		// Nor duplicate keys
		// List that is returned is NOT going to respect any order.
		// MUST have an EVEN number of parameters
		// Limited to a TOTAL of ten pairs
		Map <String, String> strs = Map.of ( "A", "First letter", "B", "Second Letter", "C", "Third Letter", "D", "Third Letter", "E", "5", "F", "6", "G", "7", "H", "8", "I", "9", "J", "10" ) ;
		System.out.println ( strs ) ;
//		strs.put ( "E", "Fifth Letter" ) ; // blows up with UnsupportedOperationException
		// HashMap -- use most often but does NOT respect order
		// TreeMap -- which does not respect insertion order but DOES respect sort order
		// LinkedHashMap -- which DOES respect insertion order
		// Map.of -- which gives us an immutable hashmap
	}

	private static void setOfDemo ( ) {
		Set <String> strs = Set.of ( "A", "B", "C" ) ; // cannot add duplicates OR nulls
		System.out.println ( strs ) ;
//		strs.add ( "D" ) ; // crash with UnsupportedOperationException
	}

	private static void listOfDemo ( ) {
		// Mutable (ie changeable)
		List <String> fromArrayList = buildArrayList ( ) ;
		System.out.println ( "Before extra add: " + fromArrayList ) ;
		fromArrayList.add ( "d" ) ;
		System.out.println ( "After extra add: " + fromArrayList ) ;

		// Immutable (ie NOT changeable)
		List <String> fromListOf = List.of ( "A", "B", "C" ) ; // MUST be non-null
		System.out.println ( "Before extra add: " + fromListOf ) ;
//		fromListOf.add ( "D" ) ; // crash with UnsupportedOperationException
		System.out.println ( "After extra add: " + fromListOf ) ;
	}

	private static List <String> buildArrayList ( ) {
		List <String> retVal = new ArrayList <> ( ) ;
		retVal.add ( "a" ) ;
		retVal.add ( "b" ) ;
		retVal.add ( "c" ) ;
		retVal.add ( null ) ;
		return retVal ;
	}
}
