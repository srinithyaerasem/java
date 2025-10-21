package Java10000.arrayslearn;

import java.util.Arrays;

public class CheckDiagonalMatrix {
	public static void main(String[] args) {
		int [][] a= {{1,0,0},{0,5,0},{0,0,9}};
		int row= a.length;
		int col= a[0].length;
		int[][] dia=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					dia[i][j]=a[i][j];
				}
			}
		}
		if(Arrays.deepEquals(a, dia)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println(Arrays.deepToString(dia));
		System.out.println(Arrays.deepToString(a));
	}

}
