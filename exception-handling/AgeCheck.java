package com.exceptions;

import java.util.Scanner;

public class AgeCheck {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new Exception("Not eligible to vote!");
            }
            System.out.println("Eligible to vote!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
        	System.out.println("Finally block executed");
        }
    }
}
