package com.simplilearn.java.hello.model.orders.model;

import java.util.ArrayList ;
import java.util.List ;

public class Order {

	// Composed-of, rather than aggregated
	// Order is a Parent of OrderItems
	// If we delete Order, we must also delete all contained order items
	// So not only "Part-of" but "Is-Only-Part-Of"
	private List <OrderItem> items = new ArrayList <> ( ) ;


	// In the world of OO, a has-a relationship may either
	// be:
	//    1.  Bidirectional (parent knows children AND each child knows parent).
					// often see this in composition relationships
	//	  2.  Parent knows child.
	//	  3.  (Not common) child knows parent.
}
