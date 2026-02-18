package com.java.opps;

public class Employee {

	
	     int empid;
	     String empName;
	     int empAge;
	     double empSalary;
	     String empGender;
	     double hra;
	     double basic;
	     double incentives;
	     
	     void getEmployeeDetails() {
	    	 System.out.println("Employee Id: "+empid);
	    	 System.out.println("Employee Name: "+empName);
	    	 System.out.println("Employee Age: "+empAge);
	    	 System.out.println("Employee Salary: "+empSalary);
	    	 System.out.println("hra: "+hra);
	    	 System.out.println("basic: "+basic);
	    	 System.out.println("Incentives: "+incentives);
	    	 System.out.println("Total Salary: "+ getToSalary());
	    	 	 
	     }
	     
	     double getToSalary() {
	    	 double totalSalary = hra + basic + incentives;
	    	 return totalSalary;
	     }
	     

	}


