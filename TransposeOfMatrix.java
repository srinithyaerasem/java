package Java10000.arrayslearn;

import java.util.Arrays;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6}};
		int row=a.length;
		int col=a[0].length;
		int[][] t=new int[col][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				t[j][i]=a[i][j];
			}
		}
		System.out.println(Arrays.deepToString(a));
		System.out.println("Transpose Matrix is:\n"+Arrays.deepToString(t));
	}

}
