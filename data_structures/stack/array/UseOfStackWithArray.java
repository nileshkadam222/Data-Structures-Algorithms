package com.datastructure.data_structures.stack.array;

public class UseOfStackWithArray {

    public static void main(String[] args) {
        MyStackWithArray array = new MyStackWithArray(10);
        System.out.println(array.isEmpty());
        System.out.println(array.isFull());
        array.push(1);
        array.push(2);
        System.out.println(array.isEmpty());
        System.out.println(array.isFull());
        System.out.println(array.count());
        System.out.println(array.peek());
        array.display();


    }
}
