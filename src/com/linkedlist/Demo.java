package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Visitor;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		addInOrder(placesToVisit, "Sydney");
		addInOrder(placesToVisit, "Melbourne");
		addInOrder(placesToVisit, "Brisbane");
		addInOrder(placesToVisit, "Perth");
		addInOrder(placesToVisit, "Canberra");
		addInOrder(placesToVisit, "Adelaide");
		addInOrder(placesToVisit, "Darwin");
		printList(placesToVisit);
		addInOrder(placesToVisit, "Alice Springs");
		addInOrder(placesToVisit, "Darwin");
		printList(placesToVisit);
		visit(placesToVisit);
	}

	private static void printList(LinkedList<String> placesToVisit) {
		Iterator<String> iterator = placesToVisit.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==================================");
	}

	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> iterator = (ListIterator<String>) linkedList.iterator();
		while (iterator.hasNext()) {
			int comparison = iterator.next().compareTo(newCity);
			if (comparison == 0) {
				System.out.println(newCity + " already included as a destination!");
				return false;
			} else if (comparison > 0) {
				iterator.previous();
				iterator.add(newCity);
				return true;
			}
		}

		iterator.add(newCity);
		return true;
	}

	private static void visit(LinkedList<String> cities){
		Scanner scanner = new Scanner(System.in);
		boolean quit=false;
		ListIterator<String> listIterator=(ListIterator<String>) cities.iterator();
		if(cities.isEmpty()){
			System.out.println("No cities in the itenerary");
		}else{
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		while(!quit){
			int action= scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Vacation is over");
				quit=true;
				break;
			case 1:
				if(listIterator.hasNext())
				{
				System.out.println("Now visiting " + listIterator.next());
				}else{
					System.out.println("Reached the end of the list");
				}
				break;
			case 2:
				if(listIterator.hasPrevious()){
					System.out.println("Now visiting "+ listIterator.previous());
				}else{
					System.out.println("We are at the start of the list");
				}
				break;
			case 3:
				printMenu();
				break;
			default:
				break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available Actions :\n press");
		System.out.println("0 - to quit\n" +
		 "1 - go to next city\n"+
		 "2 - go to previous city\n"+
		 "3- print menu options");
	}
}
