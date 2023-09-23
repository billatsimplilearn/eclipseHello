package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CollectionsDemo {

	public static void main ( String [ ] args ) throws Throwable {
//		arraysDemo();
//		genericsDemo();
//		iterationDemo();
		joinDemo() ;
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
