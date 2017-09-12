package com.SinglyLinkedList;

public class RecursiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "bimalparajuli";
		System.out.println(reverseWord(string));
		
		
	}
	static String reverse = "";
	private static String reverseWord(String string) {
		if(string.length() <= 1){
			return string;
		}else{
			reverse += string.charAt(string.length()-1)+
		 reverseWord(string.substring(0, string.length()-1));
		return reverse;	
		}
		
	}

}
