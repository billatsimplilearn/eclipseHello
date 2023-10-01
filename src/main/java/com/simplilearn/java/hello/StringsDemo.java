package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringsDemo {

	public static void main ( String [ ] argv ) throws Throwable {
		// stringDemo();
//		stringBuilderDemo();
//		int len = argv.length ;
		scannerDemo() ;
	}

	private static void scannerDemo() {
		try (Scanner sc = new Scanner(System.in)) {
			for ( ;; ) {
				System.out.println ( "Hi!  Give me your name?" ) ;
				String name = sc.nextLine ( ) ;
				name = name.trim ( ) ;
				name = name.replaceAll ( "\\s+", " " ) ;
				System.out.println ( "Hello " + name + "!" ) ;
			}
		}
	}

	private static void stringBuilderDemo() {
		// NOT STRINGBUFFER!
		StringBuilder sb = new StringBuilder ( ) ;
		List <String> strs = List.of ( "A", "B", "C", "D" ) ;

		for ( String s : strs ) {
			sb.append ( s ) ;
		}
		String result = sb.toString ( ) ;
		System.out.println ( result ) ;
	}

	private static void stringDemo() {
		// length()
		String a = "Hello" ;
		String b = "" ;
		String d = " " ;

		System.out.println ( a + " has a length of " + a.length ( ) ) ;
		System.out.println ( b + " has a length of " + b.length ( ) ) ;

		// charAt(:int): char
		char c = a.charAt ( 2 ) ;
		System.out.println ( c ) ;

		// isEmpty() and isBlank():
		System.out.println ( "a, " + a + " is " + ( a.isEmpty ( ) ? "" : "not " ) + "empty." ) ;
		System.out.println ( "b, " + b + " is " + ( b.isEmpty ( ) ? "" : "not " ) + "empty." ) ;
		System.out.println ( "d, " + d + " is " + ( d.isEmpty ( ) ? "" : "not " ) + "empty." ) ;

		System.out.println ( "d, " + d + " is " + ( d.isBlank ( ) ? "" : "not " ) + "blank." ) ;
		System.out.println ( "b, " + b + " is " + ( b.isBlank ( ) ? "" : "not " ) + "blank." ) ;

		// trim()
		String name = "Marvin K. Mooney   " ;
		System.out.println ( "\"" + name + "\" has length of " + name.length ( ) ) ;
		name = name.trim ( ) ;
		System.out.println ( "\"" + name + "\" has length of " + name.length ( ) ) ;

		// internalization ONLY works with Strings:
		String f = "upcoming break" ;
		String g = new String ( "upcoming break" ).intern ( ) ;
		System.out.println ( "is f the same object as g? " + ( f == g ) ) ;
		System.out.println ( "does f the same value as g? " + ( f.equals ( g ) ) ) ;
	}
}
