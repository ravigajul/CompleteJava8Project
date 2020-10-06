package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arrayIntegers = readIntegers(6);
		System.out.println("Minimum Element is " + findMin(arrayIntegers));
	}

	public static int[] readIntegers(int count) {
		int[] myArray = new int[count];
		System.out.println("Enter " + count + "numbers\r");
		for (int i = 0; i < count; i++) {
			myArray[i] = scanner.nextInt();
		}
		return myArray;
	}

	public static int findMin(int[] array) {
		for (int j = array.length; j > 0; j--) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}

			}
		}
		System.out.println("Sorted Array is " + Arrays.toString(array));
		return array[0];
	}

}
