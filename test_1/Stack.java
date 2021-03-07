package com.datastructure.test_1;

import java.util.function.BooleanSupplier;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class Stack {
	private int[] arr;
	private int size;
	private int index = 0;
	
	public Stack(int length) {
		this.size = length;
		this.arr = new int[this.size];
	}

	public IntConsumer push = val ->{arr[index] = val;index ++;};
	public IntSupplier pop = () ->arr[--index];
	public BooleanSupplier isEmpty = ()->index == 0;
	public BooleanSupplier isFull = ()-> index == size;
	
	public void printArray() {
		for(int i=0;i<index;i++) {
			System.out.println(arr[i]);
		}
	}
}
