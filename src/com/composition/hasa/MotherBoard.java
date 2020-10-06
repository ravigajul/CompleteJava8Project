package com.composition.hasa;

public class MotherBoard {
	
	private String name;	
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	public MotherBoard(String name, String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public void loadProgram(String programName){
		System.out.println("Loading " + programName);
	}
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public String getBios() {
		return bios;
	}
	
	
}
