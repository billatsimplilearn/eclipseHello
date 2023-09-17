package com.simplilearn.java.hello;

import java.util.Objects;

public class Dog {

	private String name ;
	private String breed ;
	private int age ;

	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	@Override
	public int hashCode ( ) {
		int retVal = 0 ;
		retVal += Objects.hash ( name ) ;
		retVal += Objects.hash ( breed ) ;
//		retVal += Objects.hash ( age ) ;
		return retVal ;
	}

	@Override
	public boolean equals ( Object o ) {
		if ( o == this ) {
			return true ;
		} if ( o instanceof Dog that ) {
			if ( ! this.name.equals ( that.name ) ) {
				return false ;
			}
			if ( ! this.breed.equals ( that.breed ) ) {
				return false ;
			}

			return true ;
		} else {
			return false ;
		}
/* Pre-Java 17: * /
		if ( ! ( o instanceof Dog ) ) {
			Dog that = ( Dog ) o ;
			return false ;
			// then compare dog things
		}
*/
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", getBreed()=" + getBreed() + ", getClass()=" + getClass() + "]";
	}
}
