package com.datastructure.stack.linklist;

import com.datastructure.linklist.singly.Node;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class MyStack {

    private List<Integer> data;
    private Integer top;
    private Integer bottom;
    public int length;


    MyStack(){
        this.data = new LinkedList<>();
        this.top = 0;
        this.bottom = 0;
        this.length = 0;
    }

    public int peek(){
        if(length == 0){
            throw new EmptyStackException();
        }
        return this.data.get(top-1);
    }

    public void push(int value){
        this.data.add(value);
        this.top++;
        length++;
    }

    public void pop(){
        if(length == 0){
            throw new EmptyStackException();
        }
        this.data.remove(top-1);
        this.top--;
        length--;
    }

    public boolean isEmpty(){
        return (length == 0) ? true : false;
    }

    public void printStack(){
        System.out.println("Top :"+this.data.get(top-1));
        System.out.println("Bottom :"+ this.data.get(bottom));
        this.data.stream().forEach(System.out::println);
    }


}
