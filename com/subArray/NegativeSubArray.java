package com.subArray;

import java.util.Scanner;

public class NegativeSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n]; 
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();
		}
		// Input array that resulting in the sum of elements to negative
		System.out.println(negSubArray(array));
	}

	private static int negSubArray(int[] array) {
		int n = array.length;
		int count = 0;
		for(int i = 0; i < n; i++){
			if(array[i] < 0){
				count++;
			}
		}
		System.out.println("Negative no-> "+count);
		int sum = 0;
		
		for(int i = 0; i < n; i++){		
			sum = 0;
			for(int j = i; j < n; j++){
				sum += array[j];
				if(i != j)
				if(sum < 0){
					System.out.println(i+" "+j);
					count++;
				}
			}
		}
		return count;
	}

}
