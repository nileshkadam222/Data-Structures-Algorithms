package com.datastructure.data_structures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
       int[] nums = {3,2,4};
       int target = 6;
       twoSum1(nums,target);
    }


    // O(n^2)
    private static void twoSum(int[] nums,int target){


        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j]) == target){
                    System.out.println(i +" "+ j);
                    break;
                }
            }
        }
    }


    // O(n)
    private static void twoSum1(int[] nums,int target){
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] < target){
                int rem =  target -nums[i];
                if(indexMap.containsKey(rem)){
                    System.out.println(indexMap.get(rem) + " " +i);
                }
                indexMap.put(nums[i],i);
            }
        }
    }
}
