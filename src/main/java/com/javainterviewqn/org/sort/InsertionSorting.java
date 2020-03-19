package com.javainterviewqn.org.sort;

public class InsertionSorting {

	public int[] sort(int arr[]) {

		int[] resultArr = new int[arr.length];
		
		for (int j = 1; j < arr.length; j++) {
			
			for (int i = j; i >= 0; i--) {

				if(i > 0) {
					
					if(arr[i]<arr[i-1]) {
						int temp = arr[i];
						int temp2 = arr[i-1];
						
						arr[i] = temp2;
						arr[i-1] = temp;
					}
				}
			}
		}
		
		
		resultArr = arr;
		return resultArr;
	}

	public void readArray(int arr[]) {

		for (int i = 0; i <= arr.length - 1; i++) {

			System.out.print(arr[i]);
		}
	}
	

	public static void main(String[] args) {

		int[] arr = { 7, 6, 5, 2, 1, 9, 0, 4 , 3, 8};
		
		InsertionSorting iSort = new InsertionSorting();
		iSort.readArray(arr);
		System.out.println();
		iSort.readArray(iSort.sort(arr));
	}

}
