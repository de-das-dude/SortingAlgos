package com.sayan.bubbleSort;

/**
 * In ascending sort, pushes the highest element in each iteration to the end
 * 
 * if no sorts are done in one iteration => sorting is complete
 * 
 * @author dedasdude
 *
 */
public class BubbleSort {

	int[] sortAsc(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			boolean f = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					f = false;
				}
			}
			if (f) {
				System.out.println("Completed in " + i + " iterations");
				break;
			}

			for (int x = 0; x < arr.length; x++)
				System.out.print(arr[x] + ", ");
			System.out.println();
		}

		return arr;
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] arr = { 69, 67, 45, 18, 9, 7, 6, 5, 5, 2 };

		arr = sort.sortAsc(arr);

		for (int x = 0; x < arr.length; x++)
			System.out.print(arr[x] + ", ");
	}
}
