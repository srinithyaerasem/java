package com.abstracts;

public class PartTimeEmployee extends Employee{
	double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double total = hourlyRate * hoursWorked;
        System.out.println("Salary: " + total);
		
	}
	

}
