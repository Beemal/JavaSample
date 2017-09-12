package com.ArrayGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		Map<String, Integer> map = new HashMap<>();
		for(int i= 0; i< n; i++){
			str[i] = sc.next();
			if(!map.containsKey(str[i]))
				map.put(str[i], 1);
			else
				map.put(str[i], 1+ (map.get(str[i])));
		}
		int n2 = sc.nextInt();
		String[] str2 = new String[n2];
		for(int i= 0; i< n2; i++){
			str2[i] = sc.next();
		}
		for(String s : str2){
			if(map.keySet().contains(s)){
				System.out.println(map.get(s));
			}else
				System.out.println(0);
		}
	}

}
