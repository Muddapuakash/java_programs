package com.java.opps;

public class BankingSystem {

    // Private Data Members 
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private String accountType;

    private static final double MINIMUM_BALANCE = 1000.0;

    public BankingSystem(String accountHolderName, String accountNumber, double balance, String accountType) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        if (balance < MINIMUM_BALANCE) {
            System.out.println("Initial balance is less than ₹1000. Setting to minimum balance ₹1000.");
            this.balance = MINIMUM_BALANCE;
        } else {
            this.balance = balance;
        }

        if( (accountType=="Savings") || (accountType=="Current")) {
        		this.accountType = accountType;
        } else {
            System.out.println("Invalid account type. Defaulting to Savings.");
            this.accountType = "Savings";
        }
    }

    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    // Setters 
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Account holder name cannot be null or empty.");
        }
    }

    public void setAccountType(String accountType) {
        if (accountType.equalsIgnoreCase("Savings") ||
                accountType.equalsIgnoreCase("Current")) {
            this.accountType = accountType;
        } else {
            System.out.println("Account type must be Savings or Current.");
        }
    }

 

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful. Updated Balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        if (balance - amount < MINIMUM_BALANCE) {
            System.out.println("Withdrawal denied. Minimum balance ₹1000 must be maintained.");
            return;
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Updated Balance: ₹" + balance);
    }

    // Interest Calculation
    public void calculateInterest() {
        if (accountType.equalsIgnoreCase("Savings")) {
            double interest = balance * 0.05;
            balance =balance + interest;
            System.out.println("Interest Earned: ₹" + interest);
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Current Account does not earn interest.");
        }
    }

    // Display Info
    public void displayAccountInfo() {
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Type        : " + accountType);
        System.out.println("Balance             : ₹" + balance);
        System.out.println("Account Active      : " + isActive());
    }

    // Check Active Status
    public boolean isActive() {
        return balance >= MINIMUM_BALANCE;
    }
}