package java10k;

import java.util.*;
public class AllFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value to find its factors: ");
		int num = sc.nextInt();
		int i=1;
		while(num>=i) {
			if(num%i==0) {
				System.out.print(" "+i+ " ");
			}
			i++;
		}
	}

}
