package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class CollectionsDemo {

	public static void main ( String [ ] args ) throws Throwable {
//		arraysDemo();
//		genericsDemo();
//		iterationDemo();
//		joinDemo() ;
//		listDemo();
//		setDemo();
//		mapDemo();
//		queueDemo();
		stackDemo();
	}

	private static void stackDemo() {
		// LIFO: Last in first out (Stack)
		// Think lunchtrays
		Stack <String> s = new Stack <> ( ) ;
		s.push ( "A" ) ;
		s.push ( "B" ) ;
		s.push ( "C" ) ;
		s.push ( "D" ) ;
		s.push ( "E" ) ;

		System.out.println ( s.pop ( ) ) ;
		System.out.println ( s.pop ( ) ) ;
		System.out.println ( s.pop ( ) ) ;
		System.out.println ( s.pop ( ) ) ;
		System.out.println ( s.pop ( ) ) ;
		System.out.println ( s.pop ( ) ) ;
	}

	private static void queueDemo() {
		// FIFO: First in first out
		// Think grocery lines
		Queue <String> q = new LinkedList <> ( ) ;
		q.offer ( "A" ) ;
		q.offer ( "B" ) ;
		q.offer ( "C" ) ;

		System.out.println ( q.peek ( ) ) ;
		System.out.println ( q.remove ( ) ) ;
		System.out.println ( q.remove ( ) ) ;
		System.out.println ( q.remove ( ) ) ;
		System.out.println ( q.poll ( ) ) ;
	}

	private static void mapDemo ( ) {
		// Also remember LinkedHashMaps for predictable iteration order
		Map <String, Number> scores = new HashMap <> ( ) ;
		scores.put ( "Alice", 92 ) ;
		scores.put ( "Bob", 89 ) ;
		scores.put ( "Charlie", 72 ) ;
		scores.put ( "Danny", 98.5 ) ;

		Map <String, Integer> otherScores = new HashMap <> ( ) ;
		otherScores.put ( "Earnest", 92 ) ;
		otherScores.put ( "Frankie", 75 ) ;
		otherScores.put ( "George", 100 ) ;
		otherScores.put ( "Alice", 57 ) ;
		scores.putAll ( otherScores ) ;

		scores.put ( "Alice", 23 ) ;
		scores.put ( "Alice", 24 ) ;
		scores.put ( "Alice", 25 ) ;
		scores.put ( "Alice", 26 ) ;
		scores.put ( "Alice", 27 ) ;
		scores.put ( "Alice", 28 ) ;
		boolean hasAlice = scores.containsKey ( "Alice" ) ;
		System.out.println ( "Has Alice?" + hasAlice ) ;
		scores.remove ( "Alice" ) ;
		hasAlice = scores.containsKey ( "Alice" ) ;
		System.out.println ( "Has Alice after remove?" + hasAlice ) ;

		Number aliceScore = scores.get ( "Alice" ) ;
		System.out.println ( aliceScore ) ;

		System.out.println ( scores ) ;
		Map <String, List <Integer>> allScores = new HashMap <> ( ) ;

		Set <String> names = scores.keySet ( ) ;
		System.out.println ( "Names: " + names ) ;

		Collection <Number> values = scores.values ( ) ;
		System.out.println ( "Values: " + values ) ;

		List <Number> valueList = new ArrayList <> ( values ) ;
		System.out.println ( "Values List: " + valueList ) ;

		for ( Map.Entry <String, Number> entry : scores.entrySet ( ) ) {
			String name = entry.getKey ( ) ;
			Number score = entry.getValue ( ) ;
		}

		int size = scores.size ( ) ;
		scores.clear ( ) ;
	}

	private static void setDemo() {
		Set <String> strs = new HashSet <> () ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "monkeywrench" ) ;
		strs.add ( "aardvark" ) ;
		for ( String s : strs ) {
//			System.out.println ( s ) ;
		}

		Set <Dog> kennel = new LinkedHashSet <> ( ) ;
		kennel.add ( new Dog ( "Bentley", "Boxer", 8 ) ) ;
		kennel.add ( new Dog ( "Max", "Doberman", 3 ) ) ;
		kennel.add ( new Dog ( "Andy", "Boxer", 9 ) ) ;
		kennel.add ( new Dog ( "Bentley", "Boxer", 9 ) ) ;
		kennel.add ( new Dog ( "Charlie", "Boxer", 9 ) ) ;
		kennel.add ( new Dog ( "Chouchou", "Boxer", 9 ) ) ;
		kennel.add ( new Dog ( "Danny", "Boxer", 9 ) ) ;
		kennel.add ( new Dog ( "Ellie", "Boxer", 10 ) ) ;
		kennel.add ( new Dog ( "Ellie", "Boxer", 8 ) ) ;
		kennel.add ( new Dog ( "Ellie", "Boxer", 5 ) ) ;
		kennel.add ( new Dog ( "Ellie", "Boxer", 4 ) ) ;
		kennel.add ( new Dog ( "Frankie", "Boxer", 9 ) ) ;
		kennel.add ( new Dog ( "George", "Boxer", 9 ) ) ;
		for ( Dog d : kennel ) {
			System.out.println ( d ) ;
		}

		strs = new HashSet <> ( ) ;
		for ( char c = 'Z' ; c >= 'A' ; c-- ) {
			strs.add ( String.valueOf ( c ) ) ;
		}
		for ( String s : strs ) {
//			System.out.println ( s ) ;
		}
	}

	private static void listDemo() {
		List <String> strs = new ArrayList <> () ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;
		strs.add ( 10, "monkeywrench" ) ;
		for ( String s : strs ) {
			System.out.println ( s ) ;
		}
	}

	private static void joinDemo() {
		List <String> strs = List.of ( "A", "B", "C", "D" ) ;
		String result = "" ;
		for ( String s : strs ) {
			result += s ;
		}

		System.out.println ( result ) ;
	}

	private static void iterationDemo() {
		List <String> strs = List.of ( "A", "B", "C", "D" ) ;
		System.out.println ( "Old-fashioned loop" ) ;
		for ( int i = 0 ; i < strs.size ( ) ; i++ ) {
			System.out.println ( i + ":  " + strs.get ( i ) ) ;
		}

		System.out.println ( "For-each loop" ) ;
		for ( String s : strs ) {
			System.out.println ( s ) ;
		}

		System.out.println ( "Iterator loop" ) ;
		for ( Iterator <String> it = strs.iterator() ; it.hasNext ( ) ; ) {
			String s = it.next ( ) ;
			System.out.println ( s ) ;
		}

		System.out.println ( "Lambda loop" ) ;
		strs.forEach ( s -> System.out.println ( s ) ) ;
	}

	private static void genericsDemo() {
		List <Number> nums = new ArrayList <> ( ) ;
		nums.add ( 5 ) ;
		nums.add ( 5.0 ) ;
		nums.add ( Integer.valueOf ( 7 ) ) ;
		nums.add ( new AtomicInteger ( 8 ) ) ;
//		nums.add ( "hello" ) ; //

		List <CharSequence> charSeqs = new ArrayList <> ( ) ;
		charSeqs.add ( "hello" ) ;
//		strs.add ( 5 ) ;

		List <String> strs = new ArrayList <> ( ) ;
		strs.add ( "foo" ) ;
		strs.add ( "bar" ) ;

		List <List <? extends CharSequence>> allMyStuff = new ArrayList <> ( ) ;
//		allMyStuff.add ( nums ) ;
		allMyStuff.add ( charSeqs ) ;
		allMyStuff.add ( strs ) ;

//		process ( nums ) ;
//		process ( charSeqs ) ;
		process ( strs ) ;
	}

	private static void process ( List <String> something ) {
		for ( int i = 0 ; i < something.size ( ) ; i++ ) {
			Object next = something.get ( i ) ;
			String s = ( String ) next ;
			System.out.println ( s.length ( ) ) ;

			String t = something.get ( i ) ; // no need to cast
		}

		// not possible without generics at all
		for ( String s : something ) {
			;
		}
	}

	private static void arraysDemo() {
		String [ ] strs = new String [ ] { "A", "B", "C" } ;
		String [ ] others = new String [ 4 ] ;

		strs [ 2 ] = "X" ;
	}
}
