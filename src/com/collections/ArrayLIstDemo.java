package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLIstDemo {

	public static void main(String[] args) {
		//Arraylist is Dynamic
		//ArrayList allows Hetrogeneous
		//ArrayLIst Atomatically incraese the size
		ArrayList<String> CountryList=new ArrayList<>();
		CountryList.add("India");
		CountryList.add("Singapore");
		CountryList.add("Taiwan");
		CountryList.add("Canada");
		System.out.println(CountryList);
		for(int i=0;i<CountryList.size();i++) {
			System.out.println(CountryList.get(i));
		}
		
		//Iterator iter=(Iterator) CountryList.iterator();
		//Enumeration,Iterator,ListIterator
		
		

	}

}
