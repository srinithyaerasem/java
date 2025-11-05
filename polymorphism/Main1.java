package com.polymorphism;

public class Main1 {
	public static void main(String[] args) {
		String input = "Bike";
		Vehicle v;
		if(input.equals("Bike")) {
			v= new Bike();
		}else if (input.equals("Car")) {
            v = new Car();
        } else {
            v = new Vehicle();
        }
		v.startEngine();
	}

}
