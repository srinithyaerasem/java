package java10k;
import java.util.*;
public class LcmWhile {
	static int isLCM(int x, int y) {
		int product = x*y;
		
		int i=0;
		if(x>y)
				i=x;
		else
			i=y;
		int lcm=product;
		while(i<=product) {
			if(i%x==0 && i%y ==0) {
				lcm = i;
				break;
			}
			i++;
		}
		return lcm;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int a=sc.nextInt();
		System.out.print("Enter a value: ");
		int b=sc.nextInt();
		System.out.println("The LCM of "+a+" and "+b+" is:");
		System.out.println(isLCM(a,b));
	}

}
