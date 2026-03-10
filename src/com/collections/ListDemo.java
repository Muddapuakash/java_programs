package com.collections;

import java.util.ArrayList;
//import java.util.Arrays;

public class ListDemo {
     public static void main(String[] args) {
		/*String[] fruitsArray=new String[3];
		fruitsArray[0]="Apple";
		fruitsArray[1]="Bananana";
		fruitsArray[2]="pineApple";
		for(String fruit:fruitsArray) {
			System.out.println(fruit);
		}
		System.out.println(Arrays.toString(fruitsArray));
		System.err.println(fruitsArray[2]);*/
    	 
    	 ArrayList<String> fruitsArray=new ArrayList<>();
    	 fruitsArray.add("apple");
    	 fruitsArray.add("mango");
    	 fruitsArray.add("bananana");
    	 
    	 System.out.println(fruitsArray);
    	 
	}
}
