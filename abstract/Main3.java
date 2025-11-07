package com.abstracts;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vehicle type(bike/car): ");
		String type = sc.nextLine();
		if(type.equals("bike")) {
			System.out.println("enter speed");
			int speed = sc.nextInt();
			Bike b= new Bike(speed);
			b.getMaxSpeed();
		}else if(type.equals("car")) {
			System.out.println("enter speed");
			int speed = sc.nextInt();
			Car c= new Car(speed);
			c.getMaxSpeed();
		}else {
			System.out.println("invalid");
		}
	}

}
