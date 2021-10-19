package com.sayan.selectionSort;

public class SelectionSort {
	int[] sortAsc(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min_idx] > arr[j])
					min_idx = j;
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] arr = { 5, 2, 6, 7, 2, 5, 9, 45 };

		arr = sort.sortAsc(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
