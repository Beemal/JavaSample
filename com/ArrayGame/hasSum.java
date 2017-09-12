package com.ArrayGame;

import java.util.Arrays;

public class hasSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {2,3,4,4};
		int[] a2 = {9,3,1,4};
		int[] a3 = {9,3,-1,4};
		System.out.println(hasSum(a1,8));
		System.out.println(hasSum(a2,8));
		System.out.println(hasSum(a3,8));
	}

	private static boolean hasSum(int[] a1, int sum) {
		Arrays.sort(a1);
		int start = 0;
		int end = a1.length - 1;
		while(start < end){
			int s = (a1[start] + a1[end]);
			if(s == sum)
				return true;
			if(s<sum)
				start++;
			else
				end--;
		}
		return false;
	}

}
