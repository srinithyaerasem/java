package Java10000.arrayslearn;

public class SumOfallElementsInMatrix {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6}};
		int row = a.length;
		int col=a[0].length;
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum+=a[i][j];
			}
		}
		System.out.println("sum of elements is:"+sum);
	}

}

