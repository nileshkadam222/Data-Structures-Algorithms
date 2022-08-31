package com.datastructure.data_structures.Arrays;

import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args)
    {
        //reverseString("nilesh");
        System.out.println(reverseUsingStream("nilesh"));
    }

    private static String reverseString(String str){
        System.out.println("Orignal String :"+ str);
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println("Reverse String : "+ sb.toString());
        return sb.toString();
    }

    private String  reverseWithStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();
    }

    private static String reverseUsingStream(String str){
        return Stream.of(str.split("")).reduce("", (reversed, character) -> character + reversed);
    }
}
