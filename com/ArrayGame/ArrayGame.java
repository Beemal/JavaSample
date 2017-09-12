package com.ArrayGame;

import java.util.Scanner;

public class ArrayGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}

	private static boolean canWin(int leap, int[] game) {
		int move = 0;
		for(int i = 0; i < game.length; i++){
				if(game[i-1] == 0){
					move = i - 1;
				}
				if(game[i+1] == 0){
					move = i + 1;
				}
				if(game[i+leap] == 0){
					move = i + leap;
				}
				if(move == game[game.length-1] || (i + leap) >= game.length){
					return true;
				}
		}
		return false;
	}
}
