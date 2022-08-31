package com.datastructure.data_structures.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringChar {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,2};
        System.out.println(recurringFistChar(array));
    }

    private static Integer recurringFistChar(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                return array[i];
            }
            map.put(array[i],0);
        }
        return null;
    }


}
