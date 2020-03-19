package com.javainterviewqn.org.sort;

public class BubbleSorting {
	
	public int[] doSort(int[] arr){
		
		for(int i=0; i<arr.length-1; i++){
			
			for(int j=0; j<arr.length-1-i;j++){
				
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					int temp2 = arr[j+1];
					arr[j] = temp2;
					arr[j+1] = temp;
				}
			}
			
		}
		
		return arr;
	}
	
	public void readArray(int arr[]) {
		
		for(int i=0;i<=arr.length-1;i++) {
			
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]){
		
		int[] arr = {100,97,102,11,22,109};
		BubbleSorting bSort =  new BubbleSorting();
		
		bSort.readArray(bSort.doSort(arr));
	}
	
}