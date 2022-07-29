package com.datastructure.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class DynamicArrays {

	private String[] array;
	private int capcity;
	private int currentLenght;

	public DynamicArrays() {
		this.array = new String[1];
		this.capcity = 1;
		this.currentLenght = 0;
	}

	public String get(int index) {
		if(index < capcity && index <= currentLenght) {
			return array[index];
		}
		return "Array Out of Bound";
	}
	public void push(String value) {
		if (currentLenght == capcity) {
			capcity = 2 * capcity;
			String[] tempArray = new String[capcity];

			for (int i = 0; i < array.length; i++) {
				tempArray[i] = array[i];
			}

			array = tempArray;
		}
		
		array[currentLenght] = value;
		currentLenght ++;
	}

	public void pop() {
		if(currentLenght >0) {
			currentLenght --;
		}
	}
	
	public int length() {
		return currentLenght;
	}
	
	public void delete(int index) {
		if(index < capcity && index <= currentLenght) {
			for(int in = index;in<currentLenght-1;in++) {
				array[in] = array[in+1];
				
			}
			pop();
		}else {
			System.out.println("Array out of bound");
		}
	}
	
	public Supplier<String[]> getArray = ()-> array;
	
	public static Consumer<String[]> printArray = a -> {
			for(String s : a) {
				System.out.println(s);
			}
		};
		
   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArrays array = new DynamicArrays();
		array.push("hii");
		array.push("I");
		array.push("am");
		array.push("Nilesh");
		System.out.print(array.length());
		array.delete(0);
		
		printArray.accept(array.getArray.get());
	}

}
