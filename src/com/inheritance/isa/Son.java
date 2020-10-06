package com.inheritance.isa;

public class Son extends Father {

	public Son(int age, String name, int weight) {
		super(age, name, weight);
	}

	@Override
	public void who() {

		System.out.println(name + " is a son aged " + age + " and weighs " + weight);
	}
	
	@Override
	public void eat(){
		System.out.println("Son eats....");
	}
	
	@Override
	public void sleep(){
		System.out.println("Son sleeps...");
	}
	public void play(){
		System.out.println("Son plays...");
	}
}
