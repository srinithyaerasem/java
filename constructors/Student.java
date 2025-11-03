package com.constructor;

public class Student {
	String name;
	int rollNo;
	double marks;
	
	Student(String name,int rollNo,double marks) {
		this.name = name;
		this.rollNo=rollNo;
		this.marks=marks;
		System.out.println("Name: "+name+"\nRoll No:"+rollNo+"\nMarks: "+marks);
		
		
	}
	public static void main(String[] args) {
		Student s= new Student("John",12,89.5);
		
	}

}
