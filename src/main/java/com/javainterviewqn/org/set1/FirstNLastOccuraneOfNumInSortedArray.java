package com.javainterviewqn.org.set1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNLastOccuraneOfNumInSortedArray {
	
	public int findUsingWhile(int num[], int numberToFind) {
		
		int left =0;
		int right = num.length-1;
		int result =-1;
		while (left <= right) {
			
			int mid = (left + right )/2;
			
			if(numberToFind == num[mid]) {
				
				result = mid;
				
				right = mid -1;
				
			} else if(numberToFind < num[mid]) {
				
				right  = mid -1;
				
			} else {
				
				left = mid +1;
			}
				
		}
		
		
		return result;
	}
	
	public void findUsingMap(int num[], int numberToFind) {
		
		Map<String, Integer> occurence = new LinkedHashMap<>();
		int found = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			if(num[i]==numberToFind) {
				
				if(occurence.keySet().contains("FirstOccurence")) {
					
					occurence.put("LastOccurence", i);
					
				}else {
					
					occurence.put("FirstOccurence", i);
					
				}
				
				found =1;
				
			}
			
		}
		
		if(found != 1) {
			System.out.println("Couldn't find the number in the provided array");
		}
		
		occurence.forEach((k,v) -> {System.out.println(k  +" of "+numberToFind+" found in the index "+ v);});
	}

	public static void main(String[] args) {

		int num[] = {1,3,4,6,6,6,7,7,8,9,9};
		int number = 9;
		FirstNLastOccuraneOfNumInSortedArray firstNLastOccuraneOfNumInSortedArray = new FirstNLastOccuraneOfNumInSortedArray();
		firstNLastOccuraneOfNumInSortedArray.findUsingMap(num,number);
		
		System.out.println(firstNLastOccuraneOfNumInSortedArray.findUsingWhile(num, number));
		
	}

}
