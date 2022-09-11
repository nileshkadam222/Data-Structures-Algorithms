package com.datastructure.data_structures.Queue.UsingStack;


import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    private Integer front;


    QueueUsingStack(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
        this.front = 0;
    }

    public void push(Integer value){
        if(this.stack1.isEmpty()){
            this.front = value;
        }

        while (!this.stack1.isEmpty()){
            this.stack2.push(this.stack1.pop());
        }

        this.stack1.push(value);

        while (!this.stack2.isEmpty()){
            this.stack1.push(this.stack2.pop());
        }
    }

    public Integer pop(){
        Integer res = stack1.pop();

        if(!stack1.isEmpty()){
            front = stack1.peek();
        }
        return res;
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }

    public Integer peek(){
        return front;
    }

    public void display(){
        System.out.println();
        stack1.forEach(f->{
            System.out.print(f+" -> ");
        });
    }
}
