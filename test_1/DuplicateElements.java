package com.datastructure.test_1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {
	static Consumer<Integer[]> findDuplicateInArray = arr ->{
		Set<Integer> s = new HashSet();
		List<Integer> collect = Stream.of(arr).filter(num-> !s.add(num)).collect(Collectors.toList());
		System.out.println("Duplicate Number in Array : "+ collect);
	};
	public static void main(String[] args) {
		Integer[] arr = {1,3,2,1,3,2,5,6,7,8,2};
		findDuplicateInArray.accept(arr);
	}
}
