package com.hackerRank;

import java.util.Scanner;

public class BinaryRepresentation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String binary = Integer.toBinaryString(n);
		// to count the consecutive 1's in a binary representation.
		
		int cnt = 0,max=0;
		for(int i=0;i<binary.length();i++){
		   cnt=0;
		   while(i<binary.length() && binary.charAt(i) == '1'){
		      cnt++;
		      i++;
		   }
		   if(cnt>max) max=cnt;
		}
		System.out.println(binary.length());
		System.out.println(max);
	}
}
