package com.subArray;

import java.util.Scanner;

public class AAA {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("What is the name of the goal the task is  under?: ");
	        String goalName = scanner.nextLine();
	        System.out.println("You entered: ");
	        String s = scanner.nextLine();
	        System.out.print(goalName+" ---- "+ s);
	    }
}
