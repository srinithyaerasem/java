package com.constructor;

public class Complex {
	int real;
    int imaginary;
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex(Complex c1, Complex c2) {
        this.real = c1.real + c2.real;
        this.imaginary = c1.imaginary + c2.imaginary;
    }

    void display() {
        System.out.println("Sum = " + real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex sum = new Complex(c1, c2);
        sum.display();
    }

}
