package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	

	public static void main(String[] args) {

			int[] array={1,2,3,4,5,6};
			reverseAnArray(array);
			System.out.println("After Optimal reversing " + Arrays.toString(optimalReverseArray(array)));
	}
	
	public static void reverseAnArray(int[] myArray){
		int[] tempArray=new int[myArray.length];
		int i=0;
		System.out.println("Before reversing "+ Arrays.toString(myArray));
		for(int j=myArray.length-1;j>=0;j--)
		{
			tempArray[i]=myArray[j];
			i++;
		}
		System.out.println("After reversing " + Arrays.toString(tempArray));
		
	}
	
	public static int[] optimalReverseArray(int[] myArray){
		int maxIndex=myArray.length-1;
		int halfLength=myArray.length/2;
		for(int i=0;i<halfLength;i++){
			int temp=myArray[i];
			myArray[i]=myArray[maxIndex-i];
			myArray[maxIndex-i]=temp;
		}
		return myArray;
	}
}
