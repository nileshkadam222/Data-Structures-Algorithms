package com.datastructure.data_structures.linklist.doubly;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public void append(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
        }else{
            newNode.previous = tail;
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
        length++;
    }

    public void printListAsc(){
        System.out.println("\n\nTravel form head : ");
       Node currentnode = head;
        while (currentnode != null){
            System.out.print(currentnode.value+" ->");
            currentnode = currentnode.next;
        }
    }

    public void insert(int index,int value){
        Node newNode = new Node(value);

        if(index >= length){
            prepend(value);
        }
        Node leader = travelToIndex(index-1);
        Node pointerHoldingNode = leader.next;
        leader.next = newNode;
        newNode.previous = leader;
        newNode.next = pointerHoldingNode;
        pointerHoldingNode.previous = newNode;
        length ++;
    }

    public void delete(int index){
        if(index > length){
            System.out.println("In correct  index");
        }

        Node leader = travelToIndex(index-1);
        Node unWantedNode = leader.next;
        leader.next = unWantedNode.next;
        unWantedNode.next.previous = leader;
        length--;
    }

    private Node travelToIndex(int index){
        Node currentNode = head;
        int counter = 0;
        while (counter != index){
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    public void printListDsc(){
        System.out.println("\n\nTravel from tail");
        Node currentnode = tail;
        while (currentnode != null){
            System.out.print(currentnode.value+" ->");
            currentnode = currentnode.previous;
        }
    }
}
