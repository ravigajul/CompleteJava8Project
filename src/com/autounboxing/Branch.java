package com.autounboxing;

import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customer> customerArraylist;
	public Branch(String branchName, Customer customer) {
		this.branchName = branchName;
		this.customerArraylist=new ArrayList<Customer>();
		this.customerArraylist.add(customer);
	}

	
	public String getBranchName() {
		return branchName;
	}

	public ArrayList<Customer> getCustomerArraylist() {
		return customerArraylist;
	}


	public void setCustomerArraylist(ArrayList<Customer> customerArraylist) {
		this.customerArraylist = customerArraylist;
	}


	public void addCustomer(String name){
		customerArraylist.add(new Customer(name,1000.0));
	}
	
	public void addTransaction(String name,Double amount){
		int index=findCustomer(name);
		if(index!=-1){
			customerArraylist.get(index).getTransactionsArrayList().add(amount);
		}else{
			System.out.println("Customer " + name + " doesn't exist");
		}
	}
	
	public int findCustomer(String name){
		for (Customer customer : customerArraylist) {
			if(customer.getName().equalsIgnoreCase(name)){
				return customerArraylist.indexOf(customer);
			}
		}
		return -1;
	}
	
	
}
