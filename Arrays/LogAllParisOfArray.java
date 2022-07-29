package com.datastructure.Arrays;

public class LogAllParisOfArray {

    public static void main(String[] args) {

        box b = new box();
        box b1 = new box();
        b.height = 10;
        b1 = b;

        System.out.println(b1.height);

        String obj = "I"+"Like"+"Java";
        System.out.println(obj);


    }
}

class box{
    int height;
}

//o(n^2)
