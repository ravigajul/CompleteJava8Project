package com.inheritance.isa;

public class Father {
	int age;
	String name;
	int weight;
	
	public Father(int age, String name, int weight) {
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	public void who(){
		
		System.out.println(name + " is a father aged " + age + " and weighs " + weight);
	}
	
	public void eat(){
		System.out.println("Father eats....");
	}
	
	public void sleep(){
		System.out.println("Father sleeps...");
	}
	public void work(){
		System.out.println("Father Works");
	}
	public void provide(){
		System.out.println("Fathers provides for his kids");
	}
}
