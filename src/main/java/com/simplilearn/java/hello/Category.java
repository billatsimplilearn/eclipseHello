package com.simplilearn.java.hello;

import java.util.List ;

public class Category {

	private String name ;
	private Category parent ;  // One to self because it is the same class as where we define it
	private List <Category> subcategories ; // one to self

	// Class attribute declaration
	// <visibility> <static or not> <final or not> <Type> <name> ;

	public Category ( String name ) {
		this.name = name ;
	}

	public void addSupercategory ( Category supercat ) {
		// <Type> <name>
		// TODO Auto-generated method stub
		
	}
}
