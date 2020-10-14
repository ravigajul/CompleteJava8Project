package com.arraylists.grocerylist;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ". " + groceryList.get(i));
		}
	}

	public void modifyGroceryItem(String replacementItem, String newItem) {
		int position = findItem(replacementItem);
		if (position >= 0) {
			modifyGroceryItem(position, replacementItem, newItem);
		} else {
			System.out.println("Replacement Item " + replacementItem + " not found");
		}
	}

	private void modifyGroceryItem(int position, String replacementItem, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position + 1) + ". " + replacementItem + " is replaced with " + newItem);
	}

	public void removeGroceryItem(String item) {

		int position = findItem(item);
		if (position >= 0) {
			removeGroceryItem(position, item);

		}
	}

	private void removeGroceryItem(int position, String item) {
		groceryList.remove(position);
		System.out.println("Removed " + item);
	}

	public int findItem(String searchItem) {
		int position = groceryList.indexOf(searchItem);
		return position;

	}
	

}
