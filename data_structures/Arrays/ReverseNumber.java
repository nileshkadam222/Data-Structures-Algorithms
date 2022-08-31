package com.datastructure.data_structures.Arrays;
import java.util.function.BiConsumer;

public class ReverseNumber {

	
	
	static BiConsumer<String, Integer> reverseStringOrNumber = (str,number) ->{
		StringBuilder newString = new StringBuilder();
		System.out.println("Orignal String : "+str);
		if(str != null && str.length() >2) {
			for(int i =str.length()-1; i>=0 ;i--) {
				newString.append(str.charAt(i));
			}
			System.out.println("Reverse String : "+newString.toString());
		}
		
		System.out.println("Orignal Number : "+number);
		if(number != null && number > 0) {
			int reverseNumber = 0;
			while(number != 0) {
				int lastDigits = number% 10;
				reverseNumber = reverseNumber * 10 +lastDigits;
				number = number/10;				
			}
			
			System.out.println("Reverse Number : "+reverseNumber);
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num = 3456345;
		String s = "Hi I am Nilesh";
		reverseStringOrNumber.accept(s,num);
	}

}

