package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
		
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
		System.out.println("Before adding C "+linkedList);
		
		linkedList.add(2,"C");
		System.out.println("After Adding C "+linkedList);
		
		linkedList.remove(2);
		System.out.println("After removing elemnet from index 2: "+linkedList);
		
		linkedList.addFirst("Start");
		
		System.out.println(linkedList);
		
		linkedList.addLast("End");
		
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println(linkedList);
		
		
		//Queue implemenation of liknked list ..method queue
		//to add an element at the end 
		
		System.out.println(linkedList.offer("F"));
		System.out.println(linkedList);
		
		//to lookup the first element of LinkedList
		//peek()
		
		System.out.println(linkedList.peek());
		System.out.println(linkedList);
		//to remove an element at the begining- poll()
		
		
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		


	}

}
