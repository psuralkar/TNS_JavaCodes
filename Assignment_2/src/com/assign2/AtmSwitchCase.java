package com.assign2;
import java.util.*;

public class AtmSwitchCase {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        double balance = 0.0;  // initial balance
	        int choice;

	        while (true) {
	           
	            System.out.println("\n==== ATM Menu ====");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option (1-4): ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1: 
	                    System.out.print("Enter amount to deposit: ");
	                    double deposit = scanner.nextDouble();
	                    if (deposit > 0) {
	                        balance += deposit;
	                        System.out.println("Amount deposited successfully!");
	                    } else {
	                        System.out.println("Invalid deposit amount!");
	                    }
	                    break;

	                case 2: 
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdraw = scanner.nextDouble();
	                    if (withdraw > 0 && withdraw <= balance) {
	                        balance -= withdraw;
	                        System.out.println("Please collect your cash.");
	                    } else {
	                        System.out.println("Insufficient balance or invalid amount!");
	                    }
	                    break;

	                case 3: 
	                    System.out.println("Current Balance: ₹" + balance);
	                    break;

	                case 4: 
	                    System.out.println("Thank you for using our ATM!");
	                    scanner.close();
	                  //  System.exit(0);

	                default:
	                    System.out.println("Invalid option! Please try again.");
	            }
	        }
	    }
	

}


