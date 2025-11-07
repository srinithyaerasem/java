package com.abstracts;

public class Bike extends Vehicle{
	int speed;
	Bike(int speed){
		this.speed=speed;
	}

	@Override
	void getMaxSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Max speed:"+speed+"km/h");
		
	}

}
