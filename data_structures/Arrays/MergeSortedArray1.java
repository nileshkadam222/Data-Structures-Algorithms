package com.datastructure.data_structures.Arrays;

/*

arr1[] = { 1, 3, 4, 5}
arr2[] = {2, 4, 6, 8}

step 1:
i = 1 , j =0 ,k = 1;
arr2 = {1}

step 2:
i = 1 , j =1 ,k = 2;
arr2 = {1,2}

step 3:
i = 2 , j =1 ,k = 3;
arr2 = {1,2,3}

step 4:
i = 3 , j =1 ,k = 4;
arr2 = {1,2,3,4}

step 4:
i = 3 , j =2 ,k = 5;
arr2 = {1,2,3,4,4}



arr1[] = { 1, 3, 4, 5}
arr2[] = {2, 4, 6, 8}

step 5:
i = 4 , j =2 ,k = 6;
arr2 = {1,2,3,4,4,5}

step 6:
i = 4 , j =2 ,k = 6;
arr2 = {1,2,3,4,4,5}


 */




import java.util.Arrays;

public class MergeSortedArray1 {

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        mergeArray(arr1,arr2);

    }

    private static void mergeArray(int[] array1,int[] array2){
        int n = array1.length;
        int m = array2.length;

        //create new array with array1 size + array2 size
        int[] mergedArray = new int[n+m];

        //initalized the couner variables
        int i=0,j=0,k=0;

        //travels on both array
        while(i<n && j<m){
            if(array1[i] < array2[j]){
                mergedArray[k++] = array1[i++];
            }else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i<n){
            mergedArray[k++] = array1[i++];
        }


        while (j<m){
            mergedArray[k++] = array2[j++];
        }

        Arrays.stream(mergedArray).forEach(System.out::println);
    }
}
