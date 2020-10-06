package com.polymorphism;

class Car {

	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

	public String startEngine() {
		return "Car -> StartEngine()";
	}

	public String accelerate() {
		return "Car -> accelerate()";
	}

	public String brake() {
		return "Car -> brake()";
	}
}

class Mitsubishi extends Car {

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);

	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Mitsubishi -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Mitsubishi -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Mitsubishi -> brake()";
	}

}

class Holden extends Car {

	public Holden(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Holden -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Holden -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Holden -> brake()";
	}

}

class Ford extends Car {

	public Ford(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Ford -> brake()";
	}

}

public class MainPolymorphismChallenge {

	public static void main(String[] args) {
		Car car = new Car(8, "Base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());

		Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRM 4WD");
		System.out.println(mitsubishi.startEngine());
		System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());

		Holden holden = new Holden(6, "Holden");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());

		Ford ford = new Ford(6, "Ford Titanium");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
	}

}
