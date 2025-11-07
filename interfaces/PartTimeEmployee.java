package com.interfaces;

public class PartTimeEmployee implements Employee {
	String name;
	PartTimeEmployee(String name){
		this.name=name;
	}
	@Override
	public String getName() {
		return name;
		
	}

}
