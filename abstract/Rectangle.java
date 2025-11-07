package com.abstracts;

public class Rectangle extends Shape{
	int length,breadth;
	Rectangle(int length, int breadth){
		this.length= length;
		this.breadth=breadth;
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		int area= length*breadth;
		System.out.println("Area :"+area);
		
	}
	

}
