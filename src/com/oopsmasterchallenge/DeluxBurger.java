package com.oopsmasterchallenge;

public class DeluxBurger extends Hamburger{

	public DeluxBurger() {
		super("Delux", "Sausage & Bacon", 14.54, "White");
		super.addHamburgeraddition1("Chips", 2.75);
		super.addHamburgeraddition2("Drink", 1.81);
	}

	@Override
	public void addHamburgeraddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to Delux burger");
	}

	@Override
	public void addHamburgeraddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to Delux burger");
	}

	@Override
	public void addHamburgeraddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to Delux burger");
	}

	@Override
	public void addHamburgeraddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to Delux burger");
	}
	 

}
