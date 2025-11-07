package com.abstracts;

public class Car extends Vehicle{
	int speed;
	Car(int speed){
		this.speed=speed;
	}

	@Override
	void getMaxSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Max speed:"+speed+"km/h");
		
	}
	

}
