package com.datastructure.test_1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateIn2Array {
	static BiConsumer<Integer[], Integer[]> findDuplicate = (arr1,arr2)->{
		Set<Integer> s = new HashSet<Integer>();
		Set<Integer> duplicateSet = new HashSet<Integer>();
		Stream.of(arr1).filter( i-> !s.add(i)).collect(Collectors.toList()).stream().forEach(num->duplicateSet.add(num));
		Stream.of(arr2).filter(i-> !s.add(i)).collect(Collectors.toList()).stream().forEach(i-> duplicateSet.add(i));
		System.out.println(duplicateSet);
		
		
	};
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1,4,3,5,6,7,2,2,4,1,1,1,5,5,55};
		Integer[] arr2 = {1,4,3,5,6,7,2,2,4,1,1,1,5,5,56};
		findDuplicate.accept(arr1, arr2);

	}

}
