package Java10000.arrayslearn;

public class CountNonZeroDiagonal {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{2,0,5},{5,6,0}};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					if(a[i][j]==0) {
						count++;
					}
				}
			}
		}
		int ans=a.length-count;
		System.out.println("The count of non zro elemnts in the diagonal are:"+ans);
	}

}
