package com.datastructure.data_structures.Queue.UseingLinklist;

import java.util.LinkedList;
import java.util.List;

public class QueueUsingLinkedLList {

    private List<Integer> data;

    public QueueUsingLinkedLList(){
        this.data = new LinkedList<>();
    }

    public void enqueue(Integer val){
        this.data.add(val);
    }

    public Integer dequeue() throws NoSuchFieldException {
        if(isEmpty()){
            throw new NoSuchFieldException();
        }
        return this.data.remove(0);
    }

    public boolean isEmpty(){
        return this.data.isEmpty();
    }

    public void display(){
        this.data.stream().forEach(System.out::println);
    }
}
