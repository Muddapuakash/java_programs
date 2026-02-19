package com.java.opps;

public class BankAccount {
	private String accountHolderName;
	private int accountNumber;
    private double balance;
	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount();
		b1.accountHolderName="Akash";
		b1.accountNumber=1234567;
		b1.balance=27000.00;
		
		BankAccount b2= new BankAccount();

		
		
		System.out.println(b1.accountHolderName);
		System.out.println(b2.accountHolderName);
        
		
	}
	public BankAccount() {
		System.out.println("default Constructor");
		
	}
	
	public BankAccount(int accountNumber, int balance, String accountHolderName) {
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
		
		
	}
	
	
	
	

}
