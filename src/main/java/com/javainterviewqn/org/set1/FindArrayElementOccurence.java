package com.javainterviewqn.org.set1;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindArrayElementOccurence {
	
	public void usingMultipleForLoop(String arr[]) {
		
		System.out.println("Execution using multiple FOR loop");
		
		String checkedCharacters = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			int count =0;
			
			for (int j = 0; j < arr.length; j++) {
								
				if(arr[i].equals(arr[j])) {
					count++;
				}
				
			}		
			
			if (!checkedCharacters.contains(arr[i])) {

				System.out.println(arr[i]+" :: "+count);
				checkedCharacters = checkedCharacters + arr[i];

			} 
			
		}		
		
	}
	
	public void usingSingleForLoop(String arr[]) {
		
		Map<String, Integer> elementCount = new LinkedHashMap<String, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			int count = 1;
			
			if(elementCount.keySet().contains(arr[i])) {
				
				elementCount.put(arr[i], elementCount.get(arr[i])+count);
				
				
			}else {
				elementCount.put(arr[i], count);
				
			}
			
		}
		
		System.out.println("Execution using single FOR loop");
		for (Map.Entry<String, Integer> occurenceDetails : elementCount.entrySet()) {
			
			System.out.println(occurenceDetails.getKey()+" :: "+occurenceDetails.getValue());
		}
	}

	public static void main(String[] args) {

		String arr[] = {"Fire","Water","Wind","Cold","Ice","Air","Fire","Air","Fire","Water","Hot","Ice","Air","Hot"};
		
		FindArrayElementOccurence findArrayElementOccurance = new FindArrayElementOccurence();
		findArrayElementOccurance.usingMultipleForLoop(arr);
		findArrayElementOccurance.usingSingleForLoop(arr);
		
		
	}

}
