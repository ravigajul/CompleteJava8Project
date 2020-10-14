// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.
package com.arraylists.contactslist;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	public static ArrayList<ContactsList> contactsArrayList = new ArrayList<ContactsList>();
	public static int i = -1;
	static boolean quit = false;

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		displayMenu();
		while (!quit) {

			System.out.println("Enter your choice :");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				displayMenu();
				break;
			case 1:
				printContacts();
				break;
			case 2:
				System.out.println("Enter the contact to the be added");
				String contactName = scanner.nextLine();
				addContact(contactName);
				break;
			case 3:
				System.out.println("Enter the contact to be modified");
				String oldContactName = scanner.nextLine();
				modifyContactName(oldContactName);

				break;
			case 4:
				System.out.println("Enter the contact to be removed");
				String removeContact = scanner.nextLine();
				removeContact(removeContact);
				break;
			case 5:
				System.out.println("Enter the contact to search");
				String searchContact = scanner.nextLine();
				findContact(searchContact);
				break;
			case 6:
				quit = true;
				System.out.println("Quitting the contacts menu!");
				break;
			default:
				break;
			}
		}
	}

	public static void displayMenu() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print menu options.");
		System.out.println("\t 1 - To print the list of contacts.");
		System.out.println("\t 2 - To add a contact to the list.");
		System.out.println("\t 3 - To modify a contact in the list.");
		System.out.println("\t 4 - To remove a contact from the list.");
		System.out.println("\t 5 - To search for a contact in the list.");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void printContacts() {

		if (contactsArrayList.size() != 0) {
			for (int j = 0; j < contactsArrayList.size(); j++) {
				System.out.println(j + 1 + ". " + contactsArrayList.get(j).getName() + "->"
						+ contactsArrayList.get(j).getPhoneNumber());
			}
		} else {
			System.out.println("There are no contacts in the list");
		}

	}

	public static void addContact(String contactName) {
		int indexOfContact = searchContact(contactName);
		if (indexOfContact== -1) {
			System.out.println("Enter the contact number for " + contactName);
			String contactNumber = scanner.nextLine();
			i++;
			contactsArrayList.add(i, new ContactsList());
			contactsArrayList.get(i).setName(contactName);
			contactsArrayList.get(i).setPhoneNumber(contactNumber);
		} else {
			System.out.println("Contact " + contactName + " already exists");
		}
	}

	public static void modifyContactName(String oldContactName) {
		int indexOfContact=searchContact(oldContactName);
		if (indexOfContact != -1) {
			System.out.println("Enter new contact");
			String newContactName = scanner.nextLine();
			contactsArrayList.get(indexOfContact).setName(newContactName);
			System.out.println(oldContactName + " is updated to " + newContactName);
		}else{
			System.out.println(oldContactName + " doesnot exist");
		}
		
	}

	public static void removeContact(String removeContact) {
		int indexOfContactToRemove = searchContact(removeContact);
		if (indexOfContactToRemove != -1) {
			contactsArrayList.remove(indexOfContactToRemove);
			System.out.println(removeContact + " is deleted from the contacts list");
		}else{
			System.out.println(removeContact + " doesnot exist");
		}

	}
	
	public static void findContact(String searchContact){
		int index=searchContact(searchContact);
		if(index==-1){
			System.out.println(searchContact + " doesnot exist");
		}else{
			System.out.println("Contact " + searchContact + "->"+contactsArrayList.get(index).getPhoneNumber()+ "  exists");
		}
	}

	public static int searchContact(String searchContact) {

		for (ContactsList contactsList : contactsArrayList) {
			if (contactsList.getName().equalsIgnoreCase(searchContact)) {
				return contactsArrayList.indexOf(contactsList);
			}
		}
		return -1;
	}
}
