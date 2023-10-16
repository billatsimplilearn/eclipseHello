package com.simplilearn.java.hello.driversandcars;

import java.time.LocalDateTime ;

public class DrivingExperience {

	private Car car ;
	private Driver driver ;
	private LocalDateTime start ;
	private LocalDateTime end ;

	// These attributes are FROZEN because after they are set up
	// they can't be changed.

	public DrivingExperience ( Car car, Driver d, LocalDateTime s, LocalDateTime e ) {
		this.car = car ;
		driver = d ;
		start = s ;
		end = e ;
	}

	public Car getCar ( ) {
		return car ;
	}

	public Driver getDriver ( ) {
		return driver ;
	}

	public LocalDateTime getStart ( ) {
		return start ;
	}

	public LocalDateTime getEnd ( ) {
		return end ;
	}
}
