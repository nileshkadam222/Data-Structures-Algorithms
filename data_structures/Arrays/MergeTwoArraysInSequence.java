package com.datastructure.data_structures.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class MergeTwoArraysInSequence {
	
	static BiFunction<Integer[], Integer[],Integer[]> meargeTwoArray = (array1,array2)->{
		Integer[] meargeArray = new Integer[(array1.length + array2.length)];
		Integer array1Item = array1[0];
		Integer array2Item = array2[0];
		int n1 = array1.length;
		int n2 = array2.length;
		if(array1.length ==0 && array2.length ==0) {
			System.out.println("Both array does not contain any elements");
		}else if(array1.length == 0) {
			return array2;
		}else if(array2.length ==0) {
			return array1;
		}
		int i = 0;
		int j = 0;
		int k = 0;
		 
		while(i<n1 && j<n2) {
			if(array1[i] < array2[j]) {
				meargeArray[k++] =array1[i++]; 
			}else {
				meargeArray[k++] =array2[j++];
			}
		}
		
		while(i<n1) {
			meargeArray[k++] =array1[i++];
		}
		
		while(j < n2) {
			meargeArray[k++] =array2[j++];
		}
		
		Stream.of(meargeArray).forEach(System.out::println);
		//System.out.println("Mearge Array : "+meargeArray);
		
		return meargeArray;
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {2, 4,6,7};
		Integer[] b = {5,4,6,3,4};
		meargeTwoArray.apply(a,b);
	}

}
