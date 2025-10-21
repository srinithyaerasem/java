package Java10000.arrayslearn;

import java.util.Arrays;

public class DiagonalAndBoundaryElements {
	public static void main(String[] args) {
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int row=a.length;
		int col=a[0].length;
		int[][] ans= new int[row][col];
		int[][] ans2=new int[row][col];
		int[][] fin = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					ans[i][j]= a[i][j];
				}
			}
		}
		System.out.println("Diagonal Matrix:");
		System.out.println(Arrays.deepToString(ans));
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || i==row-1||j==0||j==row-1) {
					ans2[i][j]=a[i][j];
				}
			}
		}
		System.out.println("Boundary Matrix:");
		System.out.println(Arrays.deepToString(ans2));
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || i==row-1||j==0||j==row-1|| i==j) {
					fin[i][j]=a[i][j];
				}
			}
		}
		
		System.out.println("Final Matrix:");
		System.out.println(Arrays.deepToString(fin));
	}

}
