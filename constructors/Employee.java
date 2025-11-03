package com.constructor;

public class Employee {
	String name;
	int id;
	long salary;
	Employee(String name,int id,long salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
	public static void main(String[] args) {
		Employee e = new Employee("John", 101, 50000);
		e.display();
	}

}
