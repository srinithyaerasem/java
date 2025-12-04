package com.collectons.vectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class MaxAndMin {
	public static void min_max_sum(Vector<Integer> nums) {
		int n= nums.size();
		Collections.sort(nums);
		int min=nums.get(0);
		int max=nums.get(n-1);
		int sum=min+max;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Vector<Integer> v= new Vector<>(Arrays.asList(1,2,3,4,5));
		min_max_sum(v);
		
	}

}
