package com.datastructure.Arrays;

public class LogAllParisOfArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.println(array[i] + " "+array[j]);
            }
        }
    }
}

class box{
    int height;
}

//o(n^2)
