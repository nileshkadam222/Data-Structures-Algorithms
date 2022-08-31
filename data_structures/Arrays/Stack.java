package com.datastructure.data_structures.Arrays;

import java.util.EmptyStackException;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 1. Push
 2. pop
 3. isEmpty
 4. isFull
  */

public class Stack {
	private int[] arr;
	private int size;
	private int index =0;
	public Stack(int size) {
		this.size = size;
		this.arr = new int[this.size];
	}
	public Supplier<Boolean> isFull = ()-> index == size;
	public Supplier<Boolean> isEmpty = ()->index==0;
	public IntSupplier getSize = ()->index;
	public void push(int data) {
		if(isFull.get()) {
			throw new StackOverflowError("Stack is full");
		}
		arr[index] = data;
		index ++;
	}
	
	public int pop() {
		if(isEmpty.get()) {
			throw new EmptyStackException();
		}
		return arr[--index];
	}
}


