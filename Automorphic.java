/*
 * AUTOMORPHIC NUMBER : A number is said to be automorpic if its square is having the original number on the last 2 digits
 * (25)^2 = 625
 * (76)^2 = 5776 */
package java10k;
import java.util.*;
public class Automorphic {
/* 	static void isAutmorphic(int n) {
		int product = n*n;
		int i=0;
		int sum = 0;
		while(i<2) {
			int dig = product%10;
			sum=sum*10+dig;
			product/=10;
			i++;
		}
		//System.out.println(sum);
		int res=0;
		while(sum>0) {
			int dig= sum%10;
			res=res*10+dig;
			sum/=10;
		}
		//System.out.println(res);
		if(n==res) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("Not a automorphic number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		isAutmorphic(a);
		
	}
	*/
	
	static boolean isAutmorphic(int n) {
		int product = n*n;
		int i=0;
		int sum = 0;
		boolean isAuto = false;
		while(i<2) {
			int dig = product%10;
			sum=sum*10+dig;
			product/=10;
			i++;
		}
		//System.out.println(sum);
		int res=0;
		while(sum>0) {
			int dig= sum%10;
			res=res*10+dig;
			sum/=10;
		}
		//System.out.println(res);
		if(n==res) {
			isAuto = true;
		}
		return isAuto;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println(isAutmorphic(a));
		
	}
	

}
