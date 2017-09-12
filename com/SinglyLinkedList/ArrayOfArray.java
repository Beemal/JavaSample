package com.SinglyLinkedList;

public class ArrayOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 7, 3, 4}; // output  [7*3*4, 2*3*4, 2*7*4, 2*7*3])
		
		int[] opArray = new int[array.length];
		for(int i=0; i<opArray.length; i++){
			opArray[i] = 1;
		}
		for(int i=0; i<array.length; i++){
			for(int j = 0; j<array.length; j++){
				if(i != j){
					opArray[i] *= array[j]; 
				}
			}
		}
		System.out.print("[ ");
		for (int i : opArray) {
			System.out.print(i+" ,");   // [84, 24, 56, 42]
		}
		System.out.print("]");
	
	}

}
