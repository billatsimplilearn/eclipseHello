package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

	public static final double PI_TO_FIVE_DIGITS = 3.14159 ;
	private final List <String> arr = new ArrayList <> ( Arrays.asList ( "A", "B", "C" ) ) ;

	{
		Calculator c = new Calculator ( ) ;
		System.out.println ( c.arr ) ;
		// we can't do this, cannot reassign
		// final means we cannot reassign
//		c.arr = new ArrayList <> ( ) ;
		c.arr.add ( "D" ) ;
		c.arr.add ( "E" ) ;
	}

	public static void main(String[] args) {
		// we don't like pi so let's change it
//		PI = 4 ;
		
/*
		System.out.println("Add " + add(5, 4) ) ;
		System.out.println("Subtract: " + subtract(5, 4)) ;
		System.out.println("multiply: " + multiply(5, 4)) ;
		System.out.println("divide evenly: " + divide(9, 3)) ;
		System.out.println("divide unevenly: " + divide(8, 3)) ;
		System.out.println("round down: " + round(0.4)) ;
		System.out.println("round up: " + round(0.5)) ;
		System.out.println("even false: " + isEven(3)) ;
		System.out.println("even true: " + isEven(4)) ;
		System.out.println("odd false: " + isOdd(4)) ;
		System.out.println("odd true: " + isOdd(3)) ;
		System.out.println("false xnor false: " + xnor(false, false)) ;
		System.out.println("false xnor true: " + xnor(true, false)) ;
		System.out.println("true xnor false: " + xnor(false, true)) ;
		System.out.println("true xnor true: " + xnor(true, true)) ;
		System.out.println("Add 3: " + add(5, 4, 3) ) ;
		System.out.println("5 < 4: " + lt(5, 4) ) ;
		System.out.println("4 < 5: " + lt(4, 5) ) ;
*/
		System.out.println("multiply: " + multiply(5, 4)) ;
		System.out.println("multiply: " + multiply(0, 4)) ;
		System.out.println("multiply: " + multiply(5, 0)) ;
		System.out.println("multiply: " + multiply(0, 0)) ;
	}

	// Simple Addition
	private static int add ( int left, int right ) {
		return left + right ;
	}

	private static int subtract ( int left, int right) {
		return add ( left, -1 * right ) ;
	}

	// multiply two positive integers and return an integer
	private static int multiply ( int left, int right ) {
		// 6 * 8 = 6 + 6 + 6 + 6 + 6 + 6 + 6 + 6
		// 6 * 8 = 8 + 8 + 8 + 8 + 8 + 8
		/* by a single loop of addition */
		// "reduce" operation
		int accumulator = 0 ;
		for ( int i = 0 ; i < left ; i++ ) {
			for ( int j = 0 ; j < right ; j++ ) {
				accumulator++ ;
			}
		}
		return accumulator ;
		//		return left * right ;
	}

	// divide: take two integers and return double
	private static double divide ( int left, int divisor ) {
		return left / ( double ) divisor ;
	}

	// round take a single double param, return int
	private static int round ( double param ) {
		return ( int ) ( param + 0.5 ) ;
	}

	// isEven ( take a single integer ) and return true if if it is even
	private static boolean isEven ( int i ) {
		return i % 2 == 0 ;
	}

	// isOdd ( take a single integer ) and return true if if it is odd
	private static boolean isOdd ( int i ) {
		return ! isEven ( i ) ;
	}

	// XNOR (takes two booleans and returns true if they are both true or both false
	private static boolean xnor ( boolean left, boolean right ) {
//		return left == right ;
		return left && right || ! left && ! right ;
	}

	// add three numbers
	private static int add ( int a, int b, int c ) {
		return a + b + c ;
	}

	// lt ( take two integers and return true if left is less than right)
	private static boolean lt ( int a, int b ) {
		return a < b ;
	}
}
