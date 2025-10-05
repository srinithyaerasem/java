package java10k;
import java.util.*;
public class PrimeRange {
	static boolean isPrime(int num) {
		int count=0; //isPrimeChecker=0;
		if(num<2) {
			return false;
		}
		int i=2;
		
		while(i<=num/2) {
			if(num%i==0) {
				count++;
			}
			i++;
		}
		if(count==0)
				return true;
		else
				return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt(); //4
		System.out.println("Enter a number");
		int b= sc.nextInt();//10
		int i=a;//4
		while(i<=b) { //4<10
			
			if(isPrime(i)) { //4/3
				//count++;
				System.out.println(i);
			}
			i++;
		
		}
		
	}
	

}
