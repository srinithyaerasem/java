package java10k.patterns;
import java.util.*;

public class RigthPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int k=n-1;k>0;k--){
            for(int j=1;j<=k;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }

}
