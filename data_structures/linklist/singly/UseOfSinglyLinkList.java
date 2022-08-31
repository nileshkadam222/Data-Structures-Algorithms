package com.datastructure.data_structures.linklist.singly;

public class UseOfSinglyLinkList {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.append(10);
        l.append(20);
        l.append(30);
        l.prepend(1);
        l.printList();
        l.insert(2,60);
        l.insert(2,60);
        l.insert(2,60);
        l.printList();
        l.remove(2);
        l.remove(2);
        l.remove(2);
        l.printList();
        l.reverse();
        l.printList();

    }
}
