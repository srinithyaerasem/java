package Java10000.arrayslearn;

import java.util.Arrays;

public class UpperAndLowerTrinagleInMatrix {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int row=a.length;
		int col=a[0].length;
		int[][] upper = new int[row][col];
		int[][] lower=new int[row][col];
		System.out.println("Upper Matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i>j) {
					upper[i][j]=0;
				}
				else{
					upper[i][j]=a[i][j];
				}
				if(i<j) {
					lower[i][j]=0;
				}
				else{
					lower[i][j]=a[i][j];
				}
				
			}
		}
		System.out.println(Arrays.deepToString(upper));
		System.out.println("Lower Matrix:");
		System.out.println(Arrays.deepToString(lower));
				
	}

}
