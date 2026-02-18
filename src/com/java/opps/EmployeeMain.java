package com.java.opps;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		
		emp1.empid=101;
		emp1.empName="Akash";
		emp1.empAge=22;
		emp1.empSalary=22000.00;
		emp1.empGender="Male";
		emp1.hra=1000.00;
		emp1.basic=2000.00;
		emp1.incentives=1000.00;
		
		emp1.getEmployeeDetails();

	}

}
