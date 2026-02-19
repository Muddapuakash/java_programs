package com.java.opps;

public class StudentMain {

	public static void main(String[] args) {
		
		  Student s1=new Student(); 
		  s1.setStudentName("Akash");
		  s1.setStudentAge(22);
		  s1.displayStudentDetails();
		 
		
		
		Student s2=new Student("Ramu",-5);
		s2.displayStudentDetails();
		
		              
		
	}

}
