package com.regex.javaSyntax;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {
	public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      StringBuilder sb = new StringBuilder();
	      while(testCases>0){
	         String pattern = in.nextLine();
	             //Write your code
	         try{
	                Pattern.compile(pattern);
	                sb.append("Valid\n");
	            }catch(PatternSyntaxException exception){
	                sb.append("Invalid\n");
	            }
	         testCases--;
	      }
	      System.out.println(sb.toString());
	   }
}
