package com.java.opps;

public class BankAccount {
	String accountHolderName;
	int accountNumber;
    double balance;
	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount();
		b1.accountHolderName="Akash";
		b1.accountNumber=1234567;
		b1.balance=27000.00;
		
		BankAccount b2= new BankAccount();

		
		
		System.out.println(b1.accountHolderName);
		System.out.println(b2.accountHolderName);
        
	}

}
