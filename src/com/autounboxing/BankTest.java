package com.autounboxing;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("ICICI Bank");
		System.out.println("Bank name : " + bank.getBankName());
		bank.addBranch("Habsiguda", new Customer("Ravi Gajul", 1000.00));
		bank.addMoney("Habsiguda", "Ravi Gajul", 1500.00);
		bank.addMoney("Habsiguda", "Ravi Gajul", 500.00);
		bank.displayCustomers("Habsiguda");
		
		bank.addBranch("Hitech-City", new Customer("Anjali Pulli", 5000.00));
		bank.addMoney("Hitech-City", "Anjali Pulli", 200.00);
		bank.addCustomer("Hitech-City","Radhika");
		
		bank.displayCustomers("Hitech-City");
		bank.displayBranches();
		
		bank.locateBranch("Hitech-City");
	}

}
