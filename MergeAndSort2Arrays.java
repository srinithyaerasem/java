package Java10000.arrayslearn;

import java.util.Arrays;

public class MergeAndSort2Arrays {
	public static void main(String[] args) {
		int[] arr1= {10,3,7,8,12};
		int[] arr2= {19,23,12,5,3,2};
		int[] arr3=new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
		for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}
}
