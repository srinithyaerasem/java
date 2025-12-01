package com.collections;

import java.util.Scanner;
import java.util.Vector;

public class Vectors_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a number:");
		int n=sc.nextInt();
		Vector<String> vect = new Vector<>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter value for :"+(i+1)+" :");
			vect.add(sc.next());
		}
		System.out.println("Elements are:"+vect);
		sc.close();
	}

}
