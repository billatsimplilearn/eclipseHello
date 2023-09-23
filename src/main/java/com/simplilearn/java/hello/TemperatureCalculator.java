package com.simplilearn.java.hello;

public class TemperatureCalculator {

	public double calculateToCelcius ( double degreesFahrenheit ) {
		double degreesCelcius = ( 5 / 9.0 ) * ( degreesFahrenheit - 32 ) ;
		return degreesCelcius ;
	}

	public static void main ( String [ ] args ) throws Throwable {
		// Don't write most of your code here.
		TemperatureCalculator calc = new TemperatureCalculator ( ) ;

		System.out.println ( "From 0F to " + calc.calculateToCelcius ( 0 ) + "C" ) ;
		System.out.println ( "From 212F to " + calc.calculateToCelcius ( 212 ) + "C" ) ;
	}
}

// 0.  Make sure your project is in github and public.
// 1.  Create a class with a meaningful name.
// 2.  Create a main method
// 3.  In main, create a new object of the type declared by your class.  We will not be using static methods.
// 4.  Decide the name of the operation you will be doing.
// 5.  Decide input (names and types).  Names must be meaningful and declare intention.
// 6.  Decide output type.
// 7.  Make the method that you are calling in main() to be public and add your curly braces.
// 8.  Create your tests in main
// 9.  Solve in your method that you have created.  Be creative!  If you
//		decide to make other methods to call from your method, make these private.
