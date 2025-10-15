package Java10000.arrayslearn;
import java.util.*;

public class MaxInArray {

	public static void Max(int[] nums) {
        int max = nums[0];

        for (int x : nums) {
            if (x > max)
                max = x;
        }

        int[] result = {max};
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] val = {2, 4, 3, 1, 5, 8, 9, 2};
        Max(val);
    }
}
