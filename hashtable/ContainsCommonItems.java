package com.datastructure.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsCommonItems {

    public static void main(String[] args) {

        String[] array1 = {"a","b","b","c"};
        String[] array2 = {"a","b","b"};
        printCommonItems(array1,array2);
    }

    private static  void printCommonItems(String[] array1,String[] array2){
        Set<String> set = new HashSet<>();
        Arrays.stream(array1).forEach(f-> set.add(f));

        Arrays.stream(array2).forEach(f-> {
            if(set.contains(f)){
                System.out.println(f);
            }
        });

    }
}
