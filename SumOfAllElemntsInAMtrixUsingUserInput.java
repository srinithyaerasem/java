package Java10000.arrayslearn;
import java.util.*;

public class SumOfAllElemntsInAMtrixUsingUserInput {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a the size of matrix nxn : ");
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter a the value ofa["+i+"]["+j+"]: ");
				a[i][j]=sc.nextInt();
			}
		}
		//System.out.println("The sum of all elements in the matrix is:");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum+=a[i][j];
			}
		}
		System.out.println("The sum of all elements in the matrix is:"+sum);
	}

}
