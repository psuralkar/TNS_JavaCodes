package com.assign6;

public class bank {



		private static int totalAccounts = 0;
	    private String accountHolderName;
	    private double balance;

	    public bank(String accountHolderName, double balance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = balance;
	        totalAccounts++;
	    }

	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }

	    public void displayAccountDetails() {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Balance: ₹" + balance);
	    }

	    public static void main(String[] args) {
	        bank acc1 = new bank("Diksha", 10000);
	        bank acc2 = new bank("Nikhil", 15000);
	        bank acc3 = new bank("Deepal", 20000);

	        acc1.displayAccountDetails();
	        acc2.displayAccountDetails();
	        acc3.displayAccountDetails();

	        System.out.println("Total Bank Accounts: " + bank.getTotalAccounts());
	        }	
}


