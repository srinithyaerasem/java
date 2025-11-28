package com.enums;

public class Levels {
	enum Level{
		LOW(1), MEDIUM(2), HIGH(3);
		private int i;

		Level(int i) {
			// TODO Auto-generated constructor stub
			this.i=i;
		}
		public int getCode() {
            return i;
        }
	}
	public static void main(String[] args) {
        Level l = Level.HIGH;
        System.out.println(l.getCode());
    }

}
