package com.datastructure.linklist.singly;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
        this.length++;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void printList(){
        System.out.println();
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
    }

    public void insert(int index,int value){
        if(index >= this.length){
            this.append(value);
        }
        Node newNode = new Node(value);
        Node leader = trversalToIndex(index-1);
        Node nextPointer = leader.next;
        leader.next = newNode;
        newNode.next = nextPointer;
        length ++;
    }

    public void remove(int index){
        Node leader = trversalToIndex(index-1);
        Node unwantedNode = leader.next;
        leader.next = unwantedNode.next;
        length--;
    }

    public void reverse() {
        if (this.head.next != null) {
            Node firstNode = head;
            Node secondnode = firstNode.next;

            while (secondnode != null) {
                Node thiredNdode= secondnode.next;
                secondnode.next = firstNode;
                firstNode = secondnode;
                secondnode = thiredNdode;
            }
        }
    }


    private Node trversalToIndex(int index){
        Node currentNode = head;
        int counter = 0;
        while (counter <= index){
            currentNode = head.next;
            counter++;
        }
        return currentNode;
    }

}
