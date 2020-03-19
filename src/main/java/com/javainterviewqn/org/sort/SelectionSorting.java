package com.javainterviewqn.org.sort;

public class SelectionSorting {
	
	public int[] sort(int[] arr) {
		
		int result[] = new int[arr.length];
		
		for (int i = 0; i <= arr.length-1; i++) {
			int smallest, index=0, currentValue;
			for (int j = i; j <= result.length-1; j++) {
				
				if(arr[i] <= arr[j]) {
					
					smallest = arr[i];
					index = j;
				}else {
					smallest = arr[j];
					index = j;
				}
			}
			
			currentValue = arr[i];
			arr[i] = arr[index];
			arr[index]=currentValue;
			
		}
		
		return result;
		
	}

	
	public void readArray(int arr[]) {

		for (int i = 0; i <= arr.length - 1; i++) {

			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {

		int arr[] = {5,2,8,1,4,3,7,6};
		SelectionSorting sorting = new SelectionSorting();
		sorting.readArray(sorting.sort(arr));
	}

}
