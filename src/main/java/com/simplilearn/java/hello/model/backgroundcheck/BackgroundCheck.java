package com.simplilearn.java.hello.model.backgroundcheck;

import java.util.ArrayList;
import java.util.List;

public class BackgroundCheck {

	private CreditScore score ; // 1-to-1
	private List <Address> addressHistory = new ArrayList <> ( ) ; // 1-to-many
	private List <DrugTest> drugTestHistory = new ArrayList <> ( ) ;
}
