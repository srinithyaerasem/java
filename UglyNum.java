package java10k;
/* 
 * WHAT IS AN UGLY NUMBER?
 * a number which when divide by 2|3|5 and if we get a remainder of 1 then that number 
 * is called as an ugly number.
 * ex: 6/2 => 3/3 = 1
 *     15/5=3 => 5/5 = 1
 *     **** not a ugly number 14/2 => 7 != 1  ******
 * */



public class UglyNum {
	static void isUgly(int num) {
		int original =num;
		while(num%2==0) {
			num/=2;
		}
		while(num%3==0) {
			num/=3;
		}
		while(num%5==0) {
			num/=5;
		}
		if(num==1) {
			System.out.println(original+ " is a ugly number");
			
		}
		else {
			System.out.println(original+ " is a not an ugly number");
		}
	}
	public static void main(String[] args) {
		isUgly(6);
	}
}
