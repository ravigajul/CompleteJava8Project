package com.oopsmasterchallenge;

public class Main {

	public static void main(String[] args) {

		Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
		hamburger.addHamburgeraddition1("Tomato", 0.27);
		hamburger.addHamburgeraddition2("Lettuce", 0.75);
		hamburger.addHamburgeraddition3("Cheese", 1.13);
		System.out.println("Total Hamburger price is " + hamburger.itemizeHamburger() + "\n");

		HealthyBurger healthyburger = new HealthyBurger("Bacon", 5.67);
		healthyburger.addHamburgeraddition1("Egg", 5.43);
		healthyburger.addHealthAddition2("Lentils", 3.41);
		System.out.println("Total Healthyburger price is " + healthyburger.itemizeHamburger() + "\n");
		
		DeluxBurger db = new DeluxBurger();
		db.addHamburgeraddition1("Cheese", 2.30);
		db.addHamburgeraddition2("Coke", 5.00);
		System.out.println("Total Deluxe Hamburger price is " + db.itemizeHamburger());
		
	}
	

}
