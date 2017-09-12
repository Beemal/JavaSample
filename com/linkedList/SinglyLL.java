package com.linkedList;

public class SinglyLL {
	public static void main(String[] args) {
		Node node = new Node();
		node.data = 10;
		node.next = new Node();
		node.next.data = 20;
		insert(node, 30);
		display(node);
	}

	private static void display(Node node) {
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
		
	}

	private static void insert(Node node, int i) {
		if(node == null){
			node = new Node();
			node.data = i;
		}else{
			while(node.next != null){
				node = node.next;
			}
			node.next = new Node();
			node.next.data = i;
		}
	}

}
class Node{
	int data;
	Node next;
}
