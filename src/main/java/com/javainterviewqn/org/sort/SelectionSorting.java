package com.javainterviewqn.org.sort;

public class SelectionSorting {
	
	public int[] sort(int[] arr) {
		
		/*
		 * logic applied here: Step 1: Consider the first element in array as the
		 * smallest one and assign it to variable smallest and step 1 will be continued
		 * on each start of the iteration. Step 2: In the nested loop, the defined value
		 * in the variable smallest is checked with each element in the array and
		 * fetches the smallest value and transpose it location with the current
		 * ith(first loop index) index
		 */
		
		int smallest, index=0, currentValue;
		
		for (int i = 0; i <= arr.length-1; i++) {
			
			smallest=arr[i];
			
			//for (int j = arr.length-1; j >=i; j--) {
			for (int j = i; j <=arr.length-1; j++) {
				
				if(arr[j] <= smallest) {
					
					smallest = arr[j];
					index = j;
				}
				
			}
			
			currentValue = arr[i];
			arr[i] = arr[index];
			arr[index]=currentValue;
				
		}
		
		return arr;
		
	}

	
	public void readArray(int arr[]) {

		for (int i = 0; i <= arr.length - 1; i++) {

			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {

		int arr[] = {5,2,8,1,4,3,7,6,0};
		
		SelectionSorting sorting = new SelectionSorting();
		sorting.readArray(sorting.sort(arr));
	}

}
