package java10k;
import java.util.*;
public class GcdWhile {
	static int isGCD(int x, int y){
        
        int i=x;
        int gcd=0;
        while(i>0){
            if(x%i==0 && y%i==0){
                gcd =i;
                break;
            }
            i--;
        }
        return gcd;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a value :");
        int a =sc.nextInt();
        System.out.print("Enter a value: ");
        int b =sc.nextInt();
        System.out.print("The gcd of "+a+" and "+b+" is:");
        System.out.print(isGCD(a,b));
    }

}
