package com.abstracts;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter type of employee(fulltime/parttime)");
		String type=sc.next();
		
		if(type.equals("fulltime")) {
			System.out.println("enter salary");
			double salary = sc.nextDouble();
			FullTimeEmployee fte = new FullTimeEmployee(salary);
			fte.calculateSalary();
		
		}else if(type.equals("parttime")){
			System.out.println("enter hourlypay , no.of hours worked");
			double hourlyRate=sc.nextDouble();
			int hoursWorked=sc.nextInt();
			PartTimeEmployee pte = new PartTimeEmployee(hourlyRate,hoursWorked);
			pte.calculateSalary();
			
		}else {
			System.out.println("invalid");
		}
		
	}

}
