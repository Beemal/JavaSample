package com.forte.grp;

import java.util.Scanner;

public class SearchElementInTree {

	

	public static void main(String[] args) {
		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(25);
		root.right.right = new Node(40);
		
		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
		
//		System.out.println(isPresent(root, i)?1:0);
		
		insert(root, 55);
		insert(root, 3);
		insert(root, 28);
	    display(root);
	
	}

	private static int isSymmetric(Node a) {
		while(a != null){
			if(a.left.data != a.right.data){
				return 0;
			}
			else
				isSymmetric(a.left);
		}
		return 1;
	}

	private static void display(Node root) {
		if(root != null){
			display(root.left);
			System.out.print(root.data+", ");
			display(root.right);
		}
	}

	private static void insert(Node root, int key) {
		if(key < root.data){
			if(root.left == null)
				root.left = new Node(key);
			else
				insert(root.left, key);
		}else if(key > root.data){
			if(root.right == null)
				root.right = new Node(key);
			else
				insert(root.right, key);
		}
	}
	public static boolean isPresent(Node root, int x) {
		if(root != null){
			if(root.data == x)
				return true;
			else if(x < root.data)
				return isPresent(root.left, x);
			else
				return isPresent(root.right, x);
			
		}
		return false;
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}
