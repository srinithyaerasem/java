package Java10000.arrayslearn;


import java.util.Arrays;

public class ReplaceNegitiveWithZeros {
	public static void replaceNegative(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				nums[i]=0;
			}
			
		}
		System.out.println(Arrays.toString(nums));
		
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,45,-6,-7,8};
		replaceNegative(nums);
	}
}
