package com.Demo1;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();

		        boolean isPrime = true;

		       		        if (num <= 1) {
		            isPrime = false;
		        } else {
		            
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println(num + " is a Prime Number.");
		        } else {
		            System.out.println(num + " is NOT a Prime Number.");
		        }

		        scanner.close();
		    }
}


