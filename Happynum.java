package java10k;
// example of a happy number == 10 -> 1^2 +0^2 = 1+0 = 1
//example of a non happy number 4 -> 4^2 =16 -> 1^2+6^2 = 37 -> 3^2+7^2 =58-> 5^2+8^2= 89
// 89 --- 8^2+9^2 = 145 -> 1^2 +4^2+5^2 = 40 -> 4^2+0^2
public class Happynum {
	public static void main(String[] args) {
		isHappynum(7);
	}
	static void isHappynum(int num) {
		int temp =num;
		int steps =0;
		for(; temp != 1 && steps<20;) {
			int sum =0;
			for(; temp !=0;) {
				int digit =temp%10;
				sum =sum+(digit*digit);
				temp = temp/10;
			}
			temp = sum;
			steps++;
			
		}
		if(temp ==1) System.out.println("Happy number");
		else System.out.println("Not a happy number");
	}

}

