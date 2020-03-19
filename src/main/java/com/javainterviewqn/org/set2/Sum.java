package com.javainterviewqn.org.set2;

import java.util.HashMap;
import java.util.Map;

public class Sum {
	
	public int[] findSumElements(int[] arr, int target){

		   Map<Integer, Integer> elements = new HashMap<>();
		   int[] num = new int[2];	
		   for(int i=0; i<=arr.length-1; i++){
			
			int secondElement = target - arr[i];
			
			if(elements.keySet().contains(secondElement)){
			 num[0] = elements.get(secondElement);
			 num[1]	= i;
			 return num;
			}else {
			 elements.put(arr[i], i);
			}
			
		   }

		   return num;
			
		 }


		 public static void main (String[] args){
			
			int[] arr = {-1,3,5,7,8};
			Sum sum = new Sum();
			int[] result = sum.findSumElements(arr, 5);
		 	System.out.println(result[0]+":"+result[1]);
		 }

}
