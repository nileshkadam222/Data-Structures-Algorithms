package com.datastrucutre.stack;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class StackWithArrays {

	String[] arr;
	int index;
	int size;
	public StackWithArrays(int size) {
		// TODO Auto-generated constructor stub
		this.index = 0;
		this.size = size;
		this.arr = new String[size];
	}
	

	public Consumer<String> push = s -> {arr[index]=s;index++;};
	public Supplier<String> pop = () -> arr[--index];
	public Supplier<String> peek = () -> arr[index-1];
	public BooleanSupplier isEmpty = () -> index==0;
	public BooleanSupplier isFull = () -> index==size;
	public void printArray() {
		for(int i=0;i<index;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
