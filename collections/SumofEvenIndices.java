package com.collectons.vectors;

import java.util.Arrays;
import java.util.Vector;

public class SumofEvenIndices {
	public static void main(String[] args) {
		Vector<Integer> v= new Vector<>(Arrays.asList(1,2,3,4,5,6,1,2,3,5,5));
		int sum=0;
		for(int i=0;i<v.size();i+=2) {
			sum+=v.get(i);
		}
		System.out.println(sum);
	}
	

}
