package com.Demo1;

import java.util.Scanner;

public class customer {
    int id;
    String name;
    int age;

   
    customer() {
    		System.out.println("Default Constructor");
    }

    
    customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Default Constructor Output:");
        customer c1 = new customer();
        c1.display();

        
        System.out.println("\nEnter Customer ID:");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Customer Age:");
        int age = sc.nextInt();

      
        System.out.println("\nParameterized Constructor Output:");
        customer c2 = new customer(id, name, age);
        c2.display();


    }
}
