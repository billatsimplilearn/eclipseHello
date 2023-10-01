package com.simplilearn.java.hello.model.bookstore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {

	private List <Author> authors = new ArrayList <> ( ) ;
	private BookCategory cat ;
	private Set <Tag> tags = new HashSet <> ( ) ;
}
