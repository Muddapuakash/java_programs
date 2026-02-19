package com.java.opps;

public class Student {
	//data members
       private String studentName;
       private int studentAge;
       boolean isValid=true;
       
       
       //default constructor
       public Student() {
    	   System.out.println("Deafult Constructor");
       }
       
       //parametrized
       public Student(String studentName,int age) {
    	   this.setStudentName(studentName);
    	   
    	   if(age > 0 && age <= 100) {
				this.studentAge=age;
			}else {
				System.out.println("Enter valid Age between 1 to 100 to student "+studentName);
				isValid=false;
			}
    	   
       }
       
        // getter Method
	    public String getStudentName() {
		    return studentName;
	   }

		public int getStudentAge() {
			return studentAge;
		}
		
		//setter method
		 public void setStudentName(String Name) {
		        this.studentName = Name;
	   }

		public void setStudentAge(int Age) {
			this.studentAge=Age;
		}
		
		
		//display method
		public void displayStudentDetails() {
	        if (isValid) {
	            System.out.println("Student Name: " + studentName);
	            System.out.println("Student Age: " + studentAge);
	        } else {
	            System.out.println("Student object is not created due to invalid age.");
	        }
	    }
}

