package com.enums;

public class Main {
	enum Day{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	public static void main(String[] args) {
		Day d= Day.MONDAY;
		System.out.println(d.ordinal());
	}

}
