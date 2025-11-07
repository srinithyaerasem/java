package com.interfaces;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        Rectangle rect = new Rectangle();
        rect.area(length, breadth);
        rect.perimeter(length, breadth);

        sc.close();
    }

}
