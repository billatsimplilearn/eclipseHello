package com.simplilearn.java.hello;


public class Product {

	private String name ;
	private Category category ;

	public static void illustrationOnly ( ) {
		Category condiments = new Category ( "Condiments" ) ;
		Product mustard = new Product ( ) ;
		mustard.name = "mustard" ;
		mustard.category = condiments ;

		Category food = new Category ( "Food" ) ;
		condiments.addSupercategory ( food ) ;
		Category anything = new Category ( "Anything" ) ;
		food.addSupercategory ( anything ) ;

		Category frozenFoods = new Category ( "Frozen Foods" ) ;
		frozenFoods.addSupercategory ( food ) ;

		Product frozenBurgers = new Product ( ) ;
		frozenBurgers.name = "Frozen Burgers" ;
		frozenBurgers.category = frozenFoods ;
	}
}
