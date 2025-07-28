package com.Demo1;
import java.util.Scanner;

//Static class to track total accounts
class Bank {
static int totalAccounts = 0;

static int getTotalAccounts() {
   return totalAccounts;
}
}

//Abstract class Account
abstract class Account {
String name;
double balance;

Account(String name, double balance) {
   this.name = name;
   this.balance = balance;
   Bank.totalAccounts++;
}

abstract void deposit(double amount);
abstract void withdraw(double amount);

void showBalance() {
   System.out.println(name + "'s Balance: ₹" + balance);
}
}

//Subclass SavingsAccount
class SavingsAccount extends Account {
SavingsAccount(String name, double balance) {
   super(name, balance);
}

void deposit(double amount) {
   balance += amount;
   System.out.println("Deposited ₹" + amount);
}

void withdraw(double amount) {
   if (balance >= amount) {
       balance -= amount;
       System.out.println("Withdrew ₹" + amount);
   } else {
       System.out.println("Insufficient balance");
   }
}
}

//Final Transaction class
final class Transaction {
final double fee = 10.0;

final void perform(Account acc, String type, double amount) {
   System.out.println("\n--- Transaction Start ---");
   if (type.equalsIgnoreCase("deposit")) {
       acc.deposit(amount);
   } else if (type.equalsIgnoreCase("withdraw")) {
       acc.withdraw(amount + fee); // add fee
   } else {
       System.out.println("Invalid transaction type.");
   }
   acc.showBalance();
   System.out.println("--- Transaction End ---\n");
}
}


public class Banking {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	     System.out.print("Enter your name: ");
	     String name = sc.nextLine();

	     System.out.print("Enter initial balance: ");
	     double balance = sc.nextDouble();

	     SavingsAccount userAccount = new SavingsAccount(name, balance);
	     Transaction transaction = new Transaction();

	     while (true) {
	         System.out.println("\nChoose an option:");
	         System.out.println("1. Deposit\n2. Withdraw\n3. Exit");
	         System.out.print("Enter your choice: ");
	         int choice = sc.nextInt();

	         if (choice == 3) break;

	         System.out.print("Enter amount: ");
	         double amount = sc.nextDouble();

	         if (choice == 1) {
	             transaction.perform(userAccount, "deposit", amount);
	         } else if (choice == 2) {
	             transaction.perform(userAccount, "withdraw", amount);
	         } else {
	             System.out.println("Invalid choice!");
	         }
	     }

	     System.out.println("\nTotal Accounts Created: " + Bank.getTotalAccounts());
	     sc.close();
	 }
}






