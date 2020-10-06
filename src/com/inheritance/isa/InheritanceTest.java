package com.inheritance.isa;

public class InheritanceTest {
	public static void main(String[] args) {
		Father dad = new Father (60, "Prabhakar", 80);
		//Son son = new Son(36,"Ravi",72);		
		dad.who();
		//son.who();
		
		
		Father mama = new Son(51,"Rajaram",65);
		mama.who();
		//mama.eat();
		//mama.play(); this throws error as father reference cannot access son's methods
		
		
		/*Son shiri = new Son(31,"Shiri",75);
		shiri.who();
		shiri.provide();
		shiri.play(); //this does throw error as son's reference can access fathers methods.
		
		Son shiri2= (Son) new Father(31,"Shiri",75); //this throws class cast exception.
		shiri2.provide(); */
	}

}
