package com.interfaces;

public class Rectangle implements Shape{
	

	@Override
	public  void area(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area = " + (l * b));
		
		
	}
	 @Override
	    public void perimeter(int l, int b) {
	        System.out.println("Perimeter = " + (2 * (l + b)));
	    }
	
	

}
