package com.hackerRank;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
//       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		int n = new Scanner(System.in).nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
           str[i] = new Scanner(System.in).next();
        }
        int j =0;
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
         for(int i = 0; i < n; i++) {
             while(j < str[i].length()){
             if(j%n == 0){
                sb1.append(str[i].charAt(j));
             }
             else{
                sb2.append(str[i].charAt(j));
             } 
                 j++;
             }
             j = 0;
             System.out.println(sb1+" "+sb2);
             sb1 = new StringBuilder("");
             sb2 = new StringBuilder("");
        }
    }
}
