package com.datastructure.data_structures.stack.array;

import java.util.ArrayList;

public class MyStackWithArray {

    private ArrayList<Integer> data;
    private int stackSize;

    private int capacity;

    public MyStackWithArray(int size){
        this.capacity = size;
        this.data = new ArrayList<>(size);
        this.stackSize = 0;
    }

    public void push(int value){
        if (isFull()){
            throw new StackOverflowError();
        }
        this.data.add(value);
        this.stackSize++;
    }

    public void pop(){
        this.data.remove(this.data.size()-1);
        this.stackSize--;
    }

    public Integer peek(){
        if(this.data.size() > 0){
            return this.data.get(this.data.size()-1);
        }
            return null;
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    public boolean isFull(){
        return this.capacity == stackSize ? true : false;
    }

    public int count(){
        return this.stackSize;
    }

    public void change(int position,int element){
        if(position > this.stackSize){
            throw new IndexOutOfBoundsException();
        }
        this.data.add(position,element);
    }

    public void display(){
        this.data.stream().forEach(System.out::println);
    }

}
