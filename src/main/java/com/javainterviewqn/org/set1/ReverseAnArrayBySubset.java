package com.javainterviewqn.org.set1;

public class ReverseAnArrayBySubset {

	public static void main(String[] args) {

		int num[] = {5,6,7,2,3,8,9,0,3,4,8,2,0,8,5};
		// output when subSetReverse is set as 3:  7,6,5,8,3,2,3,0,9,2,8,4
		int subSetSetter = 3;
		int count = 1;
		
		int[] tempNum = new int[subSetSetter]; 
		System.out.println(num);
		
		for (int numIndex=0;numIndex<num.length;numIndex++) {
			
			tempNum[count-1] = num[numIndex];
			
			if(count==subSetSetter) {
				int tempNumIndexStore = numIndex;
				for(int tempIndex=0;tempIndex<tempNum.length;tempIndex++) {
					num[tempNumIndexStore] = tempNum[tempIndex];
					tempNumIndexStore--;
				}
				count=0;
				tempNum = new int[subSetSetter];
			}
			count++;
			
		}
		
		System.out.println(num);

		
	}

}
