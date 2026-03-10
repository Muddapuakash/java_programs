package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDEmo {

	public static void main(String[] args) {
		ArrayList<String> CountryList=new ArrayList<>();
		CountryList.add("India");
		CountryList.add("Singapore");
		CountryList.add("Taiwan");
		CountryList.add("Canada");
		System.out.println(CountryList);
		
		ListIterator<String> lItr=CountryList.listIterator();
		while(lItr.hasNext()) {
			String country=lItr.next();
			System.out.println(country);
			if(country.equals("India")) {
				lItr.set("Pak");
			}
			
		}
		System.out.println(CountryList);
		
		while(lItr.hasPrevious()) {
			String country=lItr.next();
			System.out.println(country);
			
			
		}
		System.out.println(CountryList);
	}

}
