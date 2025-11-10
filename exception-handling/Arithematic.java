package com.exceptions;
import java.util.Scanner;
public class Arithematic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a =sc.nextInt();
		System.out.println("Enter second  number: ");
		int b =sc.nextInt();
		try {
			int c= a/b;
			System.out.println("Division performed:  "+c);
		}catch(ArithmeticException e){
			System.out.println("Error: Division by zero is not allowed!");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
}
