package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList studentList=new ArrayList();
		Student Student1=new Student(100,"Akash");
		Student Student2=new Student(101,"Praveen");
		Student Student3=new Student(103,"Sai");
		
		studentList.add(Student1);
		studentList.add(Student2);
		studentList.add(Student3);
		
		Collections.sort(studentList);
		
		System.out.println(studentList);
	}

}
