package com.javainterviewqn.org.set1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {

	public void findUsingAnArray(String str) {

		System.out.println("find using multiple for loop and an array");

		String checkedCharacters = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			
			int count = 0;
			
			for (int j = 0; j <= str.length() - 1; j++) {

				if (str.charAt(i) == str.charAt(j)) {

					count++;
				}

			}

			if (count > 1) {

				if (!checkedCharacters.contains(Character.toString(str.charAt(i)))) {

					System.out.println(str.charAt(i) + " :: " + count);
					checkedCharacters = checkedCharacters + str.charAt(i);

				} 
				
			}
		}
	}

	public void findUsingMap(String str) {

		System.out.println("find using map and a single for loop");

		Map<Character, Integer> dupeInfo = new LinkedHashMap<>();
		int count = 1;
		for (int i = 0; i <= str.length() - 1; i++) {

			if (dupeInfo.keySet().contains(str.charAt(i))) {

				dupeInfo.put(str.charAt(i), dupeInfo.get(str.charAt(i)) + count);

			} else {

				dupeInfo.put(str.charAt(i), count);
			}

		}

		dupeInfo.forEach((key, value) -> {

			if (value > 1) {
				System.out.println(key + " :: " + value);
			}
		});
	}

	public static void main(String[] args) {

		String str = "malayalam";

		System.out.println("Code to count the duplicate characters in a given string");

		FindDuplicateCharactersInString findDupes = new FindDuplicateCharactersInString();
		findDupes.findUsingMap(str);

		findDupes.findUsingAnArray(str);
	}

}
