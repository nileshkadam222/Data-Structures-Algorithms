package com.datastructure.data_structures.Queue.UseingLinklist;

public class UseOfQueue {

    public static void main(String[] args) throws NoSuchFieldException {
        System.out.println("Enqueue operation:");
        QueueUsingLinkedLList queue = new QueueUsingLinkedLList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("display queue");
        queue.display();
        System.out.println("Dequeue operation");
        queue.dequeue();
        System.out.println("Display queue");
        queue.display();


    }
}
