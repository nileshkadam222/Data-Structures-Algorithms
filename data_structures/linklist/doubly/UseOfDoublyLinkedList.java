package com.datastructure.data_structures.linklist.doubly;

public class UseOfDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.append(10);
        l.append(20);
        l.append(30);
        l.printListAsc();
        l.printListDsc();
        l.prepend(50);
        l.printListAsc();
        l.printListDsc();
        l.insert(2,66);
        l.insert(2,67);
        l.insert(2,68);
        l.printListAsc();
        l.printListDsc();
        l.delete(2);
        l.printListAsc();
        l.printListDsc();


    }
}
