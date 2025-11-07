package com.interfaces;

public class Main {

	public static void main(String[] args) {
		
		Employee ft= new FullTimeEmployee("John");
		Employee pt = new PartTimeEmployee("Abhi");
		String name=ft.getName();
		String n2 = pt.getName();
		System.out.println("Name 1:"+name);
		System.out.println("Name 2:"+n2);
		
	}
}
