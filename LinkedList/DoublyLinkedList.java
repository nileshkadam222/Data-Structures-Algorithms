package com.datastructure.LinkedList;


//Linked List Operations

/*
1. append
2. prepend
3. insert
4. Remove
5. Reverse

*/


class Node{
	int data;
	Node next;
	Node prev;
	public Node(int val) {
		this.data = val;
	}
}
public class DoublyLinkedList {
	static Node head;
	static Node tail;
	static int length = 0;
	private static void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node lastNode = head;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			newNode.prev = lastNode;
			lastNode.next = newNode;
			length ++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
