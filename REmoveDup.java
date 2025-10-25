package Java10000.arrayslearn;

import java.util.Arrays;

public class REmoveDup {
	public static void main(String[] args) {
        int[] arr = {8, 2, 3, 3, 1, 2, 4, 5, 6, 8, 5};
        Arrays.sort(arr);

        int count = 1; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        int[] ans = new int[count];
        ans[0] = arr[0];
        int j = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                ans[j] = arr[i];
                j++;
            }
        }

        System.out.println("Unique elements: " + Arrays.toString(ans));
    }

}

