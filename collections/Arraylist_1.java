package com.collections;

import java.util.*;
public class Arraylist_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0;i<n;i++) {
			System.out.println("Enter value for "+(i+1)+" :");
			list.add(sc.nextInt());
		}
		System.out.println("Array list elements:"+list);
	}

}
