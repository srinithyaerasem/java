package com.ArrayObjects;

public class Student {
	String name;
	int age;
	String gender;
	Student(String name , int age, String gender){
		//Insitialising the values 
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	public void displayInfo() {
		System.out.println("Name: "+this.name+", Age: "+this.age+", Gender: "+this.gender);
	}
}
