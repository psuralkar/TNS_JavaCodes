package com.Demo1;
import java.util.*;

public class BloodDonation {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();
		        
		        System.out.print("Enter your weight in kg: ");
		        int weight = scanner.nextInt();

		        if (age >= 18 && weight >= 50) {
		            System.out.println("You are eligible to donate blood.");
		        } else {
		            System.out.println("You are NOT eligible to donate blood.");
		            if (age < 18) {
		                System.out.println("Reason: Age is less than 18.");
		            }
		            if (weight < 50) {
		                System.out.println("Reason: Weight is less than 50 kg.");
		            }
		        }

		        scanner.close();
		    }
	

}

