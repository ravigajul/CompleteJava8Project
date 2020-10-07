package com.scanner;

import java.util.Scanner;

public class scannerDemo {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int i=0;
		while(i<5){
			
			System.out.println("Enter your choice as, 1 Ravi Kumar, to understand the output");
			System.out.println("1 : " +scanner.nextInt());
			System.out.println("2 : " +scanner.next());
			System.out.println("3 : " +scanner.nextLine());
			i++;
		}

	}

}
