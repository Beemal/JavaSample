package com.ArrayGame;

public class BinarySearchImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {2,4,6,8,10,12,14,16};
			System.out.println(binarySearch(arr,12) == -1 ?"Not Found":"Found");
	
			System.out.println(nextPrime(23));
	}

	private static int nextPrime(int n) {
		n++;
		if(isPrime(n))
			return n;
		else
			return nextPrime(n);
	}

	private static boolean isPrime(int n) {
		if(n == 2 || n == 3 )
			return true;
		if(n == 1 || n % 2 == 0)
			return false;
		for(int i=3; i< n/2; i++){
			if((n % i) == 0)
				return false;
		}
		return true;
	}

	private static int binarySearch(int[] arr, int key) {
		int start = 0, end = arr.length - 1;
		while(start <= end){
			int mid = (start+end)/2;
			if(key == arr[mid])
				return arr[mid];
			else if(key < arr[mid])
				end = mid - 1;
			else 
				start = mid + 1;
		}
		return -1;
	}

}
