package com.simplilearn.java.hello.model.orders.model;

public class OrderItem {

	// Parent of the other side of the composition relationship
	private Order parent ;

	// Sometimes the child should know the parent in an OO has-a relationship
	// This is a design choice.

	// Aggregate has-a (or part-of) relationship instead of by composition
	private Product product ;
/*
 * Aggregate means that if either side is destroyed, the other side just carries on.
 * For aggregate relationships we will more often see unidirectional relationships.
 * But not always ... there are no hard and fast rules.
 */
	private int quantity ;
	private double discount ;
}
