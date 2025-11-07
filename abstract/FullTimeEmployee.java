package com.abstracts;

public class FullTimeEmployee extends Employee{
	
	double salary;
	FullTimeEmployee(double salary2){
		
		this.salary=salary2;
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
		System.out.println("Salary :"+salary);
		
	}

}
