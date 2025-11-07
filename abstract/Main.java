package com.abstracts;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shape:");
		String input=sc.next();
		switch(input) {
			case "circle":
				System.out.println("Enter radius of circle: ");
				double radius = sc.nextDouble();
				Shape circle= new Circle(radius);
				circle.calculateArea();
                break;
			case "rectangle":
				System.out.println("Enter length of rectangle: ");
				int length = sc.nextInt();
				System.out.println("Enter breadth of rectangle: ");
				int breadth = sc.nextInt();
				Shape rect=new Rectangle(length,breadth);
				rect.calculateArea();
		}
	}

}
