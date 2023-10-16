package com.simplilearn.java.hello.model.orders.service.traditionalSpring;

import com.simplilearn.java.hello.model.orders.model.Customer ;
import com.simplilearn.java.hello.model.orders.model.Order ;
import com.simplilearn.java.hello.model.orders.model.OrderItem ;
import com.simplilearn.java.hello.model.orders.model.Product ;

public interface OrderService {

	public Order createOrder ( Customer c ) ;

	public void addToOrder ( Order o, Product p, int quantity, double discount ) ;

	public void removeFromOrder ( Order o, OrderItem oi ) ;

	public void placeOrder ( Order o ) ;
}
