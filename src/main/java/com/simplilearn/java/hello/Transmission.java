package com.simplilearn.java.hello;

public class Transmission {

	private static final int TOP_GEAR = 5 ;
	private static int LOWEST_GEAR = 1 ;

	public int gear ( int rpms, boolean sportMode, int currentGear ) {
		if ( currentGear < 0 ) {
			return currentGear ; // Reverse
		} else if ( rpms > 3500 && ! sportMode && currentGear < TOP_GEAR ) {
			return currentGear + 1 ;
		} else if ( rpms > 4500 && sportMode && currentGear < TOP_GEAR ) {
			return currentGear + 1 ;
		} else if ( rpms < 1200 && currentGear > LOWEST_GEAR ) {
			return currentGear - 1 ;
		} else if ( rpms < 1200 && currentGear == LOWEST_GEAR ) {
			throw new RuntimeException ( "Stall the car!" ) ;
		} else {
			return currentGear ;
		}
	}
}
