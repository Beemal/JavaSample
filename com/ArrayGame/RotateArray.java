package com.ArrayGame;

public class RotateArray {
	static int[] rotateK(int[] A, int k) {
		if (A == null || k >= A.length)
			return A;

		int[] B = new int[A.length];

		// 5
		System.arraycopy(A, k, B, 0, A.length - k);

		// 1 2 3 4
		System.arraycopy(A, 0, B, A.length - k, k);
		return B;
	}
	static int[] rotateK_2(int[] A, int k) {
		if (A == null || k >= A.length)
			return A;
		reverse(A, 0, A.length - 1);// �??转整个数组
		reverse(A, 0, k - 1);// �??转�?k个数
		reverse(A, k, A.length - 1);// �??转剩下的数
		return A;
	}

	// the helper class , reverse the number from start to end
	static void reverse(int[] A, int start, int end) {
		while (start < end) {
			// 交�?�A[start]和A[end]两个数
			int temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for (int i : rotateK(arr, 3)) {
			System.out.print(" "+i);
		}
		System.out.println();
		for (int i : rotateK_2(arr, 3)) {
			System.out.print(" "+i);
		}
	}
}
