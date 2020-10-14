package com.autounboxing;

import java.util.ArrayList;

public class Bank {

	private String bankName;
	private ArrayList<Branch> branchArrayList;

	public Bank(String bankName) {
		this.bankName = bankName;
		this.branchArrayList =new ArrayList<Branch>();
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public ArrayList<Branch> getBranchArrayList() {
		return branchArrayList;
	}

	public void addBranch(String branchName, Customer customer) {
		branchArrayList.add(new Branch(branchName, customer));
	}

	public void addMoney(String branch, String customer, Double money) {
		int index = findBranch(branch);
		if (index != -1) {
			branchArrayList.get(index).addTransaction(customer, money);
		}
	}

	public void locateBranch(String name){
			int index=findBranch(name);
			if(index!=-1){
				System.out.println(name + " branch found");
			}else{
				System.out.println(name + " branch doesnot exist");
			}
	}
	private int findBranch(String name) {
		for (Branch branch : branchArrayList) {
			if (branch.getBranchName().equalsIgnoreCase(name)) {
				return branchArrayList.indexOf(branch);
			}
		}
		return -1;
	}

	public void addCustomer(String branch,String customerName) {
		int index=findBranch(branch);
		if(index!=-1){
			branchArrayList.get(index).addCustomer(customerName);
		}
	}

	public void displayCustomers(String branch) {
		int index = findBranch(branch);
		if (index != -1) {
			System.out.println("Customers in branch " + branch + " :");
			ArrayList<Customer> custList = branchArrayList.get(index).getCustomerArraylist();
			for (Customer customer : custList) {
				System.out.println("\tCustomer Name :" + customer.getName());
				ArrayList<Double> txns = customer.getTransactionsArrayList();
				System.out.println("\tTransactions" + txns.toString());
			}
		}
	}

	public void displayBranches() {
		System.out.println("Branches :");
		for (Branch branch : branchArrayList) {
			System.out.println("\t" + branch.getBranchName());
		}
	}
}
