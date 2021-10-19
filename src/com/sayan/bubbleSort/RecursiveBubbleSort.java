package com.sayan.bubbleSort;

/**
 * No Performance Advantage over normal.
 * 
 * @author dedasdude
 *
 */
public class RecursiveBubbleSort {

	void sortAsc(int[] arr, int n) {

		if (n == 1) {
			return;
		}

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		sortAsc(arr, n - 1);
	}

	public static void main(String[] args) {
		RecursiveBubbleSort sort = new RecursiveBubbleSort();
		int[] arr = { 69, 67, 45, 18, 9, 7, 6, 5, 5, 2 };

		sort.sortAsc(arr, arr.length);
		
		for (int x = 0; x < arr.length; x++)
			System.out.print(arr[x] + ", ");
	}
}
