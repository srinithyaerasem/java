package com.polymorphism;

public class B extends A{
//	@Override
//	private void display() { // shows error The method display() of type B must override or implement a supertype method
//		System.out.println("A's private method");
//	}
	//creating another private method
//	private void display() { // this access modifier will also not help to access
	public void display() {
		System.out.println("B's display method called");
		
	}

}
