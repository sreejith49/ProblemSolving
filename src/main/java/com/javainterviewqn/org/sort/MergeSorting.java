package com.javainterviewqn.org.sort;

public class MergeSorting {

	public void readArray(int arr[]) {	
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
	public int[] sort(int[] arr) {
		
		if(arr.length <=1) {
			return arr;
		}
		
		int midpoint;
				
		midpoint = arr.length /2;
		
		int left[], right[];
		
		left =  new int[midpoint];
		
		if(arr.length %2 == 0) {
			
			right = new int[midpoint];
			
		} else {
			
			right = new int[midpoint+1];
			
		}
		
		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[midpoint+j];
		}
		
		int result[] = new int[arr.length];
		
		left = sort(left);
		right = sort(right);
		
		result = merge(left, right);
		
		return result;
	}
	
	public int[] merge(int left[], int right[]) {
		
		int[] result = new int[left.length + right.length];
		
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		
		while (leftPointer < left.length || rightPointer < right.length) {
			
			if(leftPointer < left.length && rightPointer < right.length) {
				if(left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				}else {
					result[resultPointer++] = right[rightPointer++];
				}
			}else if(leftPointer < left.length) {
				
				result[resultPointer++] = left[leftPointer++];
				
			} else if(rightPointer < right.length) {
				
				result[resultPointer++] = right[rightPointer++];
				
			}
		
		}
		
		return result;
	}
	
	public int[] mergeSortedArrays(int left[], int right[]) {
		
		int result[] = new int[left.length+right.length];
		
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		
		while (leftPointer < left.length || rightPointer < right.length) {
			
			if(leftPointer < left.length && rightPointer < right.length) {
				if(left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				}else {
					result[resultPointer++] = right[rightPointer++];
				}
			}else if(leftPointer < left.length) {
				
				result[resultPointer++] = left[leftPointer++];
				
			} else if(rightPointer < right.length) {
				
				result[resultPointer++] = right[rightPointer++];
				
			}
		
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {5,2,1,4,3};
		
		MergeSorting mergeSort = new MergeSorting();
		mergeSort.readArray(arr);

		mergeSort.readArray(mergeSort.sort(arr));
		
		int[] left = {2,4,6,7,8};
		int[] right = {0,1,3,5};
		mergeSort.readArray(mergeSort.mergeSortedArrays(left, right));
	}

}
