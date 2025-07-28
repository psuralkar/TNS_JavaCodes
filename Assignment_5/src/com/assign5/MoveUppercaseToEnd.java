package com.assign5;
import java.util.Scanner;

public class MoveUppercaseToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
       
        StringBuilder lowerPart = new StringBuilder();
        StringBuilder upperPart = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                upperPart.append(ch);
            } else {
                lowerPart.append(ch);
            }
        }

        
        System.out.println(lowerPart.toString() + upperPart.toString());

        sc.close();
    }
}
