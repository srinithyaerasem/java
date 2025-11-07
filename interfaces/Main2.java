package com.interfaces;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle type (car/bike):");
		String input = sc.next();
		if(input.equals("bike")) {
			Bike b= new Bike();
			b.start();
			b.stop();
			
		}
		if(input.equals("car")) {
			
			Car c= new Car();
			c.start();
			c.stop();
			
		}
		
	}

}
