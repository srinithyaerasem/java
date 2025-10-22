package Java10000.arrayslearn;

import java.util.Scanner;

public class ReadASquareMatrixAndPrintInMatrixForm {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a the size of matrix nxn : ");
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter a the value ofa["+i+"]["+j+"]: ");
				a[i][j]=sc.nextInt();
			}
		}
		//Printing the array in matrix form
		for(int i=0;i<n;i++) {
			System.out.print("[ ");
			for(int j=0;j<n;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			System.out.print("]");
			System.out.println();
		}
	}

}
