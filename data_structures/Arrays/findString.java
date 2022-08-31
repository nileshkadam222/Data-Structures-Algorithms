package com.datastructure.data_structures.Arrays;
import java.util.function.Function;

public class findString {
	 public static void main(String[] args) {
		    System.out.println("Hello world!");

		    String[] shoStrings = {"Nilesh"};
		    findString.apply(shoStrings);
		       String[] lonStrings = {"Nilesh","Nilesh","Nilesh","Nilesh"};
		       findString.apply(lonStrings);
		    
		  }

		  static Function<String[],String> findString = (String[] stringArray)->{
		    String whatSearch = "Nilesh"; 
		    String found = "";
		    for(String s : stringArray){
		      if(whatSearch.equalsIgnoreCase(s)){
		        System.out.println("Nilesh Found.");
		       found = "Nilesh Found";
		      }
		    }
		    return found;
		  };
}
