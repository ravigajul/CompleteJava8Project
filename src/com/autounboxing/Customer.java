package com.autounboxing;

import java.util.ArrayList;

public class Customer {
	
	private String customerName;
	private ArrayList<Double> transactionsArrayList;
	public Customer(String name, double initialTxnAmount) {
		this.customerName = name;
		this.transactionsArrayList=new ArrayList<Double>();
		transactionsArrayList.add(Double.valueOf(initialTxnAmount));
	}
	public String getName() {
		return customerName;
	}
	
	public ArrayList<Double> getTransactionsArrayList() {
		return transactionsArrayList;
	}
	
	
}
