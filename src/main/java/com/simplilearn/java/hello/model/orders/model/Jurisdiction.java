package com.simplilearn.java.hello.model.orders.model;

import java.util.ArrayList;
import java.util.List;

public class Jurisdiction {

	private String name ;
	private Jurisdiction parent ;
	private List <Jurisdiction> subs = new ArrayList <> ( ) ;

	public Jurisdiction ( String name ) {
		this.name = name ;
	}

	public static void main ( String [ ] argv ) {
		Jurisdiction usa = new Jurisdiction ( "USA" ) ;
		Jurisdiction ga = new Jurisdiction ( "GA" ) ;
		usa.subs.add ( ga ) ;
		Jurisdiction atl = new Jurisdiction ( "Atlanta" ) ;
		ga.subs.add ( atl ) ;
	}
}
