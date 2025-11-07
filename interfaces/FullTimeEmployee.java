package com.interfaces;

public class FullTimeEmployee implements Employee {
	String name;
	FullTimeEmployee(String name){
		this.name=name;
		
	}
	@Override
	public String getName() {
		return name;
	}

}
