package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> CountryList=new ArrayList<>();
		CountryList.add("India");
		CountryList.add("Singapore");
		CountryList.add("Taiwan");
		CountryList.add("Canada");
		System.out.println(CountryList);
		
		Iterator<String> itr=CountryList.iterator();
		while(itr.hasNext()) {
			String Country=itr.next();
			
			if(Country.equals("India")) {
				itr.remove();
			}
			//System.out.println(Country);
		}
		System.out.println("After Removal: "+CountryList);	
		
		
		//linkedlist implemnataion of Queue
		//queue 
	}

}
