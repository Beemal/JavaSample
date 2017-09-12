package com.SinglyLinkedList;

import java.util.ArrayList;

public class NtoLast {
		public static void main(String[] args) {
		Node slinglyLL = new Node(2);
		slinglyLL.link = new Node(3);
		slinglyLL.link.link = new Node(4);
		slinglyLL.link.link.link = new Node(5);
		slinglyLL.link.link.link.link = new Node(50);
		for(Object i : findNtoLast(slinglyLL, 2)){
			System.out.println(i);
		}
//		delete(slinglyLL,middle(slinglyLL));
		display(slinglyLL);
		ReversePrint(slinglyLL);
		Node revNode = reverseNode(slinglyLL);
			System.out.println("The reversed NODE--->");
		display(revNode);
		}

	static void ReversePrint(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		if (head == null) {
			return;
		} else {
			int size = 0;
			Node temp = head;
			while (temp != null) {
				size++;
				temp = temp.link;
			}
			System.out.println("-----> Size = "+size);
			int[] arr = new int[size];
			int i = 0;
			Node temp2 = head;
			while (temp2 != null) {
				arr[i] = temp2.data;
				i++;
				temp2 = temp2.link;
			}
			for (int j = size-1; j >= 0; j--) {
				System.out.println(arr[j]);
			}
		}
	}

	static Node reverseNode(Node head){
			Node before = null;
			Node temp = head;
			while(temp != null){
				Node next = temp.link;
				temp.link = before;
				before = temp;
				temp = next;
			}
			return before;
	}

		private static void delete(Node slinglyLL, int middle) {
			while(slinglyLL != null){
				if(slinglyLL.data ==middle){
					slinglyLL.data = 0;
				}
				slinglyLL = slinglyLL.link;
			}
			
		}

//		private static int middle(Node slinglyLL) {
//			int total = 0;
//			while(slinglyLL != null){
//				total++;
//				slinglyLL = slinglyLL.link;
//			}
//			while(slinglyLL != null){
//				if(slinglyLL.data == )
//				slinglyLL = slinglyLL.link;
//			}
//			return total/2;
//		}

		private static void display(Node slinglyLL) {
			while(slinglyLL != null){
				System.out.print("--> "+slinglyLL.data);
				slinglyLL = slinglyLL.link;
			}
		}

		private static Object[] findNtoLast(Node sLL, int n) {
			int count = 0;
			ArrayList<Integer> al = new ArrayList<>();
			while(sLL != null){
				count++;
				if(count >= n){
					al.add(sLL.data);
				}
				sLL = sLL.link;
			}
			return al.toArray();
		}

}
class Node{
	Node link;
	int data;
	Node(int data){
		this.data = data;
	}
}