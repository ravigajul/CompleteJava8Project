package com.autounboxing;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> strArrayList=new ArrayList<String>();
		 //this will throw an error since int is not a class but a primitive type
		//ArrayList<int> intArrayList = new ArrayList<int>();
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		for(int i=0;i<=10;i++){
			intArrayList.add(Integer.valueOf(i)); //Autoboxing
			System.out.println(i+ " ->" + intArrayList.get(i).intValue()); //unboxing
		}
		
	}

}
