package com.sayan.bubbleSort;

public class BubbleSort {

	int[] sortAsc(int[] arr) {
		int l = arr.length;

		for (int i = 0; i < l - 1; i++) {
			boolean f = true;
			for (int j = 0; j < l - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					f = false;
				}
			}
			if(f)
			{
				System.out.println("Completed in " + i + " iterations");
				break;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] arr = { 5, 2, 18, 6, 7, 67, 5, 9, 45, 69 };

		arr = sort.sortAsc(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
