package com.collections;

import java.util.ArrayList;

public class LIstOperationDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("Before adding C "+arrayList);
		
		arrayList.add(2,"C");
		System.out.println("After Adding C "+arrayList);
		
		arrayList.remove(2);
		System.out.println("After removing elemnet from index 2: "+arrayList);
		

	}

}
