package com.javainterviewqn.org.set2;

public class MergeSortedArraysInAscOrder {
    int startingPoint =0;
    public int[] mergeArrays(int[] arr1, int[] arr2){
        int[] mergedArr = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length;i++){
            mergedArr[startingPoint]=arr1[i];
            startingPoint++;
        }

        for(int i=0; i<arr2.length;i++){
            mergedArr[startingPoint]=arr2[i];
            startingPoint++;
        }

        return mergedArr;
    }

    public static void main(String[] args) {

        MergeSortedArraysInAscOrder obj = new MergeSortedArraysInAscOrder();
        int[] arr1 = {1,4,8};
        int[] arr2 = {1,2,5,8,9,1};

        int[] mergedArr = obj.mergeArrays(arr1,arr2);

        System.out.println(mergedArr[2]);

        // implement insertion sort here

        for(int i=1;i<mergedArr.length;i++){
            for (int j=i;j>=0;j--){
                if(j>0) {
                    int temp;
                    if (mergedArr[j] < mergedArr[j - 1]) {
                        temp = mergedArr[j - 1];
                        mergedArr[j - 1] = mergedArr[j];
                        mergedArr[j] = temp;
                    }
                }
            }
        }

        System.out.println(mergedArr.toString());


    }
}
