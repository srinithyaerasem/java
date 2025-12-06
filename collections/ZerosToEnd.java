package com.collections;

import java.util.*;

public class ZerosToEnd {
	public static void main(String[] args) {
		ArrayList<Integer> n= new ArrayList<>(Arrays.asList(1, 2, 0, 2, 3, 0, 30,5,2,0,4,0));
		int count=0;
		for (int i = 0; i < n.size(); i++) {
            if (n.get(i) != 0) {
                n.set(count, n.get(i));
                count++;
            }
        }
        while (count < n.size()) {
            n.set(count, 0);
            count++;
        }
        System.out.println(n);
//		ArrayList<Integer> temp = new ArrayList<>();
////		for(int x: n) {
////			if(x==0) {
////				count++;
////			}else {
////				temp.add(x);
////			}
////			
////		}
////		while(count<n.size()) {
////			temp.add(0);
////			count++;
////		}
////		System.out.println(temp);
//		
//		
//		int index=0;
//		for(int i=0;i<n.size();i++) {
//			if (n.get(i)!=0) {
//				n.set(index, n.get(i));
//				index++;
//			}
//		}
	}

}
