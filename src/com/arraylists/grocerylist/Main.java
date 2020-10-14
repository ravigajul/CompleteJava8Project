package com.arraylists.grocerylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				System.out.println("Thank you for shopping with us!!");
				break;
			default:
				break;
			}
		}

	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void addItem() {
		
		System.out.print("Please enter the grocery item : ");
		groceryList.addGroceryItem(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.print("Enter item to be replaced :");
		String replacementItem=scanner.nextLine();
		System.out.print("Enter the replacement item :");
		String newItem=scanner.nextLine();
		groceryList.modifyGroceryItem(replacementItem,newItem);
	}
	public static void removeItem(){
		System.out.print("Enter item to remove :");
		String item=scanner.nextLine();
		groceryList.removeGroceryItem(item);
	}
	public static void searchForItem(){
		System.out.print("Enter the item to search for :");
		String searchItem=scanner.nextLine();
		if(groceryList.findItem(searchItem)>=0){
			System.out.print("Search item " + searchItem + " is found");
		}else
		{
			System.out.print("Search item " + searchItem + " is not in the shopping list");
		}
	}
	
	public static void processArrayList(){
		
		//one way to copy array list
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(groceryList.getGroceryList());
		
		//another way to copy array list
	
		ArrayList<String> nextArray= new ArrayList<String>(groceryList.getGroceryList());
	
		//one more way to copy array list
		String[] altArray = new String[groceryList.getGroceryList().size()];
		altArray= (String[]) groceryList.getGroceryList().toArray();
	}
}

