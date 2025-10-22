package Java10000.arrayslearn;

import java.util.Arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] a= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		int row=a.length;
		int col=a[0].length;
//		for(int i=0;i<1;i++) {
//			for(int j=0;j<col;j++) {
//				if(i==0||j==0||j==row-1||j==col-1) {
//					System.out.print(a[i][j]+" ");
//				}
//				else {
//					System.out.print(0+" ");
//				}
//			}
//			System.out.println();
//		}
		//System.out.println("Top row");
//		
//		//STATICALY IMPLEMENTING
//		for(int i=0;i<col;i++) {
//			System.out.print(a[0][i]+", ");
//			
//		}
//		//System.out.println("last col");
//		for(int i=1;i<row;i++) {
//			System.out.print(a[i][col-1]+", ");
//		
//		}
//		//System.out.println("last row");
//		for(int i=col-2;i>=0;i--)
//		{
//			System.out.print(a[row-1][i]+",");
//		}
//		//System.out.println("first col");
//		for(int i=1;i<row-1;i++) {
//			System.out.print(a[row-i-1][0]+",");
//		}
		int[] rev=new int[row*col];
		int index=0;
		int top=0;
		int bottom=a.length-1;
		int left=0;
		int rigth=a[0].length-1;
		
		
		while(top<=bottom && left<=rigth ) {
			
			for(int i=top;i<=rigth;i++) {
				System.out.print(a[top][i]+",");
			}
			for(int i=top+1;i<=bottom;i++) {
				System.out.print(a[i][rigth]+",");
			}
			for(int i=rigth-1;i>=left;i--) {
				System.out.print(a[bottom][i]+",");
			}
			for(int i=bottom-1;i>top;i--) {
				System.out.print(a[i][left]+",");
			}
			top++; bottom--;
			left++; rigth--;
			
		}
		System.out.println(); 
		//PRING REV Sprial
		int top1=0;
		int bottom1=a.length-1;
		int left1=0;
		int rigth1=a[0].length-1;
		while(top1<=bottom1 && left1<=rigth1 ) {
			
			for(int i=top1;i<=rigth1;i++) {
				//System.out.print(a[top1][i]+",");
				rev[index]=a[top1][i];
				index++;
				
			}
			for(int i=top1+1;i<=bottom1;i++) {
				//System.out.print(a[i][rigth1]+",");
				rev[index]=a[i][rigth1];
				index++;
			}
			for(int i=rigth1-1;i>=left1;i--) {
				//System.out.print(a[bottom1][i]+",");
				rev[index]=a[bottom1][i];
				index++;
			}
			for(int i=bottom1-1;i>top1;i--) {
				//System.out.print(a[i][left1]+",");
				rev[index]=a[i][left1];
				index++;
			}
			top1++; bottom1--;
			left1++; rigth1--;
			
		}
		System.out.println();
		int i=0;
		int j=rev.length-1;
		while(i<j) {
			int temp=rev[j];
			rev[j]=rev[i];
			rev[i]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(rev));
		
		
		
	}
}
