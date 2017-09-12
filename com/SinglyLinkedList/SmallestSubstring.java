package com.SinglyLinkedList;

import java.util.HashMap;

public class SmallestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] arr = new Character[3];
		arr[0] = 'x';
		arr[1] = 'y';
		arr[2] = 'z';
		
		smallestSubString(arr,"xyyzyzyx");
	}

	private static void smallestSubString(Character[] arr, String word) {
		HashMap hmap = new HashMap<>();
		for (int i = 0; i < word.length(); i++) {
	        for (int j = i + 1; j <= word.length(); j++) {
	            	System.out.println(word.substring(i, j));
	        }
		}
	}

}
