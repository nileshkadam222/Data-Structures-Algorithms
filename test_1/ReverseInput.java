package com.datastructure.test_1;

import java.util.function.BiConsumer;

import com.datastructure.Arrays.ReverseNumber;

public class ReverseInput {

	static BiConsumer<String, Integer> reverseInput = (str,number) ->{
		if(number != null) {
			System.out.println("Orignal Number : "+number );
			int reverseNumber = 0;
			while(number != 0) {
				int lastDigit = number%10;
				reverseNumber = (reverseNumber * 10) +lastDigit;
				number=number/10;
			}
			System.out.println("Reverse Number : "+reverseNumber);
		}
		if(str != null) {
			StringBuilder newString = new StringBuilder();
			int len = str.length();
			for(int i=len-1;i>=0;i--) {
				newString.append(str.charAt(i));
			}
			System.out.println("Orignal String : "+ str);
			System.out.println("Reverse String : "+ newString);
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseInput.accept("Nilesh", 123456789);

	}

}
