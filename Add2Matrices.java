package Java10000.arrayslearn;

import java.util.Arrays;

public class Add2Matrices {
	public static void main(String[] args) {
		int[][] m1= {{1,2},{3,4}};
		int[][] m2= {{5,6},{7,8}};
		int m1l=m1.length;
		int m2l = m1[0].length;
		int[][] sum= new int[m1l][m2l]; 
		for(int i=0;i<m1l;i++) {
			for(int j=0;j<m2l;j++) {
				sum[i][j]=m1[i][j]+m2[i][j];
			}
			
		}
		System.out.println("Sum is:");
		System.out.println(Arrays.deepToString(sum));
		
	}

}
