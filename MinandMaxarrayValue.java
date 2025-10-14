package Java10000.arrayslearn;

public class MinandMaxarrayValue {
	public static void MinandMax(int[] nums) {
		int min=nums[0];
		int max=nums[0];
//		for(int x: nums) {
//			
//		
//			if(nums[x]>max)
//				max=nums[x];
//			if(nums[x]<min)
//				min=nums[x];
//		}
		for (int x : nums) {
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }

		System.out.println(min);
		System.out.println(max);
		
		
	}
	public static void main(String[] args) {
		int[]  val= {2,4,3,1,5,8,9,2};
		MinandMax(val);
	}
	

}
