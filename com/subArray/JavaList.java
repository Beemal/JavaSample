package com.subArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList arrayNumber = new ArrayList<>();
		for(int i = 0; i < n; i++){
			arrayNumber.add(i, sc.nextInt());
		}
		
		int nQueries = sc.nextInt();
		int queries[] = new int[nQueries];
		for(int j = 0; j < nQueries; j++){
			String str = sc.next();
			if(str.equals("Insert")){
				arrayNumber.add(sc.nextInt(), sc.nextInt());
			}
			if(str.equals("Delete")){
				arrayNumber.remove(sc.nextInt());
			}
		}
		for (int i = 0; i < arrayNumber.size(); i++) {
			System.out.print(arrayNumber.get(i)+" ");
		}
	}
}
