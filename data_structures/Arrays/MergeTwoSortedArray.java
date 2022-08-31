package com.datastructure.data_structures.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
       int[] array1= {1,2,3,4};
        int[] array2= {1,2,3,4};
        mergeTowArrays(array1,array2);
    }

    private static void mergeTowArrays(int[] array1,int[] array2){

        List<Integer> mergedData = new ArrayList<>();

        for(int i=0;i<array1.length-1;i++){
            for (int j=0;j<array2.length-1;j++){
                if(array1[i] < array2[j]){
                    mergedData.add(array1[i]);
                    break;
                }else {
                    mergedData.add(array2[j]);
                    break;
                }
            }
        }

        mergedData.stream().forEach(System.out::print);

    }
}
