package Java10000.arrayslearn;

public class AntiSpiralMatrix {
	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		/*
		 * 			{{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}}*/
		int top=0;
		int bottom=a[0].length-1;
		int left=0;
		int rigth=a[0].length-1;
		while(top<=bottom&& left<=rigth) {
			for(int i=bottom;i>=top;i--) {
				System.out.print(a[top][i]+" ");
			}
			for(int i=left+1;i<=bottom;i++) {
				System.out.print(a[i][top]+" ");
			}
			for(int i=left+1;i<=bottom;i++) {
				System.out.print(a[bottom][i]+" ");
			}
			for(int i=bottom-1;i>top;i--) {
				System.out.print(a[i][rigth
				                      ]+" ");
			}
			top++; bottom--;
			left++; rigth--;
		}
		
	}

}
