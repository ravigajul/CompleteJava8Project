package com.staticdemo;

public class Dog {

	private static String name;

	public Dog(String name) {
		Dog.name = name;
	}

	public void displayName() {
		System.out.println(name);
	}
}