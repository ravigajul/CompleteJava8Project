package com.staticdemo;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog rex = new Dog("Rex");
		rex.displayName(); // Rex

		/*
		 * Every instance of that class shares the same static variable. If
		 * changes are made to that variable, all other instances will see the
		 * effect of the change
		 */
		Dog fluffy = new Dog("Fluffy");
		fluffy.displayName(); // Fluffy
		rex.displayName(); // Fluffy 

	}

}
