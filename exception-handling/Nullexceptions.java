package com.exceptions;
public class Nullexceptions {
	String str;
	public static void main(String[] args) {
		Nullexceptions n = new Nullexceptions();
		try {
			System.out.println(n.str.charAt(0));
		}catch(NullPointerException e) {
			System.out.println("Error: Null value encountered!");
		}
		finally {
			System.out.println("finally block executed");
		}
	}
}
