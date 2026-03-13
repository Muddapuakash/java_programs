package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hashset=new HashSet<>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		
		System.out.println("HashSet Output: "+hashset);
		System.out.println("LinkedHashSet Output: "+linkedHashSet);
		

	}

}
