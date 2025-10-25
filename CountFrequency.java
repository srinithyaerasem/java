package Java10000.arrayslearn;

import java.util.Arrays;

public class CountFrequency {
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,2,3,4,6};
		Arrays.sort(arr);
		int count=1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				System.out.println(arr[i-1]+" -> "+count+"times.");
				count=1;
				
			}
			
		}
		System.out.println(arr[arr.length - 1] + " -> "+count+"times.");
	}

}
