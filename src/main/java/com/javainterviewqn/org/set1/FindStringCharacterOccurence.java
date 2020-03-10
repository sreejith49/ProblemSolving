package com.javainterviewqn.org.set1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindStringCharacterOccurence {
	
	public void try1(String str) {
		
		Map<Character, Integer> occurenceDetails = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			
			if(occurenceDetails.keySet().contains(str.charAt(i))) {
				
				occurenceDetails.put(str.charAt(i),occurenceDetails.get(str.charAt(i))+count);
				
			} else {
				
				occurenceDetails.put(str.charAt(i), count);
			}
			
		}
		
		System.out.println("Find the character occurence for: "+str);
		for (Map.Entry<Character, Integer> occurenceResult : occurenceDetails.entrySet()) {
			
			System.out.println(occurenceResult.getKey()+" :: "+occurenceResult.getValue());
		}
		
	}

	public static void main(String[] args) {
		
		
		String str = "sreejith";
		FindStringCharacterOccurence findStringCharacterOccurence = new FindStringCharacterOccurence();
		findStringCharacterOccurence.try1(str);
	}

}
