package Java10000.arrayslearn;

import java.util.Arrays;

public class MoveAllZeroToEnd {
	public static void MoveAll(int[] nums) {
		int[] temp= new int[nums.length];
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				temp[j]=nums[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String[] args) {
		int[] arr1= {2,0,3,4,0,1,0,5,3,7,2,0,6,0,};
		MoveAll(arr1);
	}

}
