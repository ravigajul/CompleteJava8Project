package com.arrays;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		//Read array values from console
		int[] myIntegers = getIntegers(5);
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
		}
		
		//print average of elements in array
		System.out.println("The average is " + getAverage(myIntegers));
		
		//print sorted array in descending order
		int[] sortedArray=sortArray(myIntegers);
		System.out.print("The elements in sorted array are"+"\r");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i]+"\t");
		}
	}

	private static int[] getIntegers(int number) {
		// TODO Auto-generated method stub
		System.out.println("Enter " + number + " integer values.\r");
		int[] values = new int[number];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static double getAverage(int[] array){
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return (double)sum/(double)array.length;
	}
	
	public static int[] sortArray(int[] array){
		for(int j=array.length;j>0;j--){
			for(int i=0;i<array.length-1;i++){
				if(array[i]<array[i+1]){
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		
		return array;
	}
}
