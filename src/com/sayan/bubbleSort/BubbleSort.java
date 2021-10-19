package com.sayan.bubbleSort;

/**
 * In ascending sort, pushes the highest element in each iteration to the end
 * 
 * @author dedasdude
 *
 */
public class BubbleSort {

	int[] sortAsc(int[] arr) {
		int l = arr.length;

		for (int i = 0; i < l - 1; i++) {
			boolean f = true;
			for (int j = 0; j < l - i - 1; j++) {
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

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
	}
}
