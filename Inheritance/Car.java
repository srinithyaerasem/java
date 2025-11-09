package com.inherit;

public class Car extends Vehicle {
    @Override
    public void display() {
        super.display(); 
        System.out.println("This is a car");
    }

}
