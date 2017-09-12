package com.forte.grp;

import java.util.Scanner;

public class NumberComplement {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int i = sc.nextInt();
	System.out.println(numberComplement(i));
	
	
}
private static int numberComplement(int i) {
    int ones = (Integer.highestOneBit(i) << 1) - 1;
    return i ^ ones;
}
}
