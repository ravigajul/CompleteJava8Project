package com.composition.hasa;

public class Main {
	
	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		Monitor monitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));
		MotherBoard motherboard = new MotherBoard("BJ-246", "Asus", "Intel", 4, 6, "v2.44");
		PC thePC = new PC(theCase, monitor, motherboard);
		thePC.getMotherboard().loadProgram("Windows10.0");
		thePC.getTheCase().pressPowerButton();
		thePC.getMonitor().drawPixelAt(1500, 1200, "Yellow");
	}

}
