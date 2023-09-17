package com.simplilearn.java.hello;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public class Demo2 {

	public int something = ( int ) ( 4 * 8 + 2 / 3.0 ) % 5 ;
	public int somethingSimpler =  5 ;

	public boolean someBool = true && false || false && true || ! false ;
	public boolean someSimplerBool = true ;

	private static final int IMPORTANT_THING = 42 ;

	public static void main ( String [ ] args ) {

		// create 100 items
//		List<Item> items = createItems ( 100 ) ;
		// print them
///		printItems ( items ) ;
//		countNoHigherThan17 ( 100 ) ;
//		countButIgnoreMultiplesOf7 ( 100 ) ;
//		readFile5 ( ) ;
//		try {
//			readStuff ( ) ;
//		} catch ( Exception e ) {
//			e.printStackTrace(System.err);
//		}
		//demoNPE ( "demoNPE service has no way of knowing what this string is") ;
//		demoInstanceof ( "hello" ) ;
//		demoInstanceof ( LocalDate.of ( 2023, 9, 16 ) ) ;
//		demoInstanceof ( new StringBuilder ( "hello" ) ) ;
		demoInstanceof ( null ) ;
		System.out.println ( "Done with program" ) ;
	}

	private static void demoInstanceof ( Object obj ) {
		if ( obj instanceof String ) {
			System.out.println ( obj + " is a string" ) ;
		}
		if ( obj instanceof Object ) {
			System.out.println ( obj + " is a object" ) ;
		}
		if ( obj instanceof CharSequence ) {
			System.out.println ( obj + " is a charsequence" ) ;
		}

		if ( obj instanceof String ) {
			String s = ( String ) obj ;
			System.out.println ( "s is a string and we're happy" ) ;
			// now we can treat obj as a String
		}

		if ( obj instanceof String s ) { // String s = ( String ) obj ;
			System.out.println ( "s is a string and we're even happier" ) ;
		}
	}

	private static void demoNPE ( String s ) {
		if ( s != null ) {
			System.out.println ( s.length ( ) ) ;
		}
	}

	private static void demoOfNew ( ) {
		List <String> args = new ArrayList <String> ( ) ;
		Pattern p = Pattern.compile ( ".*" ) ;
		String s = new String ( "the string" ) ;
		String t = "some easier string" ; // same thing as new String ( "some easier string" ) ;
		Integer intObj = new Integer ( 42 ) ;
		Integer intObj2 = Integer.valueOf ( 43 ) ;
		Integer intObj3 = 44 ; // same thing as doing Intger.valueOf ( 44 ) ;
	}

	// Use if I am very fussy what happens when a finally fails and I will handle different exceptions different ways
	private static void readFile1 ( ) {
		BufferedReader r = null ;
		try {
			r = new BufferedReader ( new FileReader ( "/home/bill/_home/simplilearn/hello-eclipse/src/main/java/com/simplilearn/java/hello/Demo2Wrong.java" ) ) ;
			for ( String s = r.readLine ( ) ; s != null ; s = r.readLine ( ) ) {
				System.out.println ( s ) ;
			}
		} catch ( FileNotFoundException fnfe ) {
			System.err.println ( "File not found: " + fnfe ) ;
		} catch (IOException e) {
			System.err.println ( "IO Epublic static void main ( String [ ] args ) {xception" ) ;
		} finally {
			try {
				if ( r != null ) {
					r.close ( ) ;
				}
			} catch (IOException e) {
				// throw an error
			}
		}
	}

	// Use if I am going to treat all business exceptions the same way
	private static void readFile2 ( ) {
		BufferedReader r = null ;
		try {
			r = new BufferedReader ( new FileReader ( "/home/bill/_home/simplilearn/hello-eclipse/src/main/java/com/simplilearn/java/hello/Demo2.java" ) ) ;
			for ( String s = r.readLine ( ) ; s != null ; s = r.readLine ( ) ) {
				System.out.println ( s ) ;
			}
			// multi-catch
		} catch ( IllegalArgumentException | IOException e) {
			System.err.println ( "IO Exception" ) ;
		} finally {
			try {
				r.close ( ) ;
			} catch (IOException e) {
				// throw an error
			}
		}
	}

	// Use this one if I don't really care to specify what happens on close failure
	// which will be most of the time in the modern world
	private static void readFile3 ( ) {
		try ( BufferedReader r = new BufferedReader ( new FileReader ( "/home/bill/_home/simplilearn/hello-eclipse/src/main/java/com/simplilearn/java/hello/Demo2.java" ) ) ) {
			
			for ( String s = r.readLine ( ) ; s != null ; s = r.readLine ( ) ) {
				System.out.println ( s ) ;
			}
			// multi-catch
		} catch ( IllegalArgumentException | IOException e) {
			System.err.println ( "File not found" ) ;
		}
	}

	// Use this one if I have multiple methods that will handle the same exceptions the same way
	private static void doRead ( ) {
		try {
			readFile4 ( ) ;
			writeFile4 ( ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readFile4 ( ) throws FileNotFoundException, IOException {
		BufferedReader r = new BufferedReader ( new FileReader ( "/home/bill/_home/simplilearn/hello-eclipse/src/main/java/com/simplilearn/java/hello/Demo2.java" ) ) ;
		for ( String s = r.readLine ( ) ; s != null ; s = r.readLine ( ) ) {
			System.out.println ( s ) ;
		}
	}

	private static void writeFile4 ( ) throws FileNotFoundException, IOException {
		; // imagine a big write method
	}

	private static void readStuff ( ) {
		doReadAgain ( ) ;
	}

	private static void doReadAgain ( ) {
		readFile5 ( ) ;
	}

	private static void readFile5 ( ) {
		try ( BufferedReader r = new BufferedReader ( new FileReader ( "/home/bill/_home/simplilearn/hello-eclipse/src/main/java/com/simplilearn/java/hello/Demo2.java" ) ) ) {
			for ( String s = r.readLine ( ) ; s != null ; s = r.readLine ( ) ) {
				System.out.println ( s ) ;
			}
		} catch ( IOException e ) {
			// this loses context and information
//			throw new RuntimeException ( ) ;
			// Chaining exceptions:
			throw new UncheckedIOException ( e ) ;
		}
	}

	private static void loopWithLabel ( ) {
		// Imagine we have a list of documents
		// and we want to find which document has a certain phrase
		Document firstDocWithPhrase = null ;
		String searchPhrase = "Hello" ;
		List <Document> docList = new ArrayList <> ( ) ;
		outerLoopLabel:
		for ( Document doc : docList ) {
			String [ ] docContents = doc.getContents ( ) ;
			for ( String line : docContents ) {
				if ( line.contains ( searchPhrase ) ) {
					firstDocWithPhrase = doc ;
					break outerLoopLabel ;
				}
			}
		}
		// next thing after big break
	}

	private static void countButIgnoreMultiplesOf7 ( int totalCount ) {
		for ( int i = 0 ; i <= totalCount ; i++ ) {
			if ( i % 7 == 0 ) {
				continue ;
			}
			System.out.println ( i ) ;
		}
	}

	private static void countNoHigherThan17 ( int totalCount ) {
		for ( int i = 0 ; i <= totalCount ; i++ ) {
			if ( i > 17 ) {
				break ;
			}
			System.out.println ( i ) ;
		}
	}

	private static List <Item> createItems ( int count ) {
		List <Item> retVal = new ArrayList <> ( ) ;
		for ( int i = 0 ; i < count ; i++ ) {
			Item it = new Item ( ) ;
			it.name = "Item number " + ( i + 1 ) ;
			retVal.add ( it ) ;
		}
		return retVal ;
	}

	private static void printItems ( List <Item> items ) {
/* New, new way*/
		items.forEach(it -> System.out.println(it));
/* New way * /
		for ( Item it : items ) {
			System.out.println ( it.name ) ;
		}
		/* Old way * /
		for ( int i = 0 ; i < items.size() ; i++ ) {
			Item it = items.get ( i ) ;
			System.out.println ( it.name ) ;
		}
/**/
	}

	private static void printFirstHundred ( ) {
		for ( int i = 0 ; i < 100 ; i++ ) {
			System.out.println ( i ) ;
		}
	}

	private static enum Suit { SPADES, HEARTS, DIAMONDS, CLUBS } ;

	private static String getDisplayChar ( Suit s ) {
		String displayChar ;
		switch ( s ) {
			case SPADES:
				displayChar = "Spade Char" ;
				break ;
			case HEARTS:
				displayChar = "Hearts Char" ;
				break ;
			case DIAMONDS:
				displayChar = "Diamonds Char" ;
				break ;
			case CLUBS:
				displayChar = "Club Char" ;
				break ;
			default:
				displayChar = "Joker" ;
				break ;
		}

		return displayChar ;
	}

	private static void demoSwitchCase ( char c ) {
		switch ( c ) {
			case '$':
				System.out.println ( "Dollar" ) ;
				break ;
			case '{':
				System.out.println ( "Open Brace" ) ;
				break ;
			case '}':
				System.out.println ( "Close Brace" ) ;
				break ;
			default:
				System.out.println ( "Just any other letter " + c ) ;
				break ;
		}
	}

	private static String stringSize ( String s ) {
		if ( s.length ( ) > 10 ) {
			return "This is a large string: " + s ;
		} else if ( s.length ( ) == 0 ){
			return "This is an empty string: " ;
		} else {
			return "This is NOT a large string: " + s ;
		}
	}

	private static String simpler ( boolean b ) {
		String retVal = "by default false" ;
		if ( b ) {
			retVal = "true instead!" ;
		}
		return retVal ;
	}

	private static class Item {
		public String name ;
	}

	private static class Instructions {
		public String commandName ;
	}

	private static class Document {
		public String [ ] getContents ( ) {
			return new String [ ] { "A", "", "B" } ;
		}
	}
}
