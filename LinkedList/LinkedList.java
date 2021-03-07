package com.datastructure.LinkedList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LinkedList {

	Node head;
	Node tail;
	int length = 0;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public static LinkedList append(LinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
		}
		if (list.tail == null) {
			list.tail = list.head;
		} else {
			list.tail.next = new_node;
			list.tail = new_node;
			/*
			 * Node last = list.head; while (last.next != null) { last = last.next; }
			 * 
			 * last.next = new_node;
			 */
		}
		list.length ++;
		return list;
	}

	public static LinkedList prepend(LinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = list.head;
		list.head = new_node;
		list.length ++;
		return list;
	}

	static Consumer<LinkedList> printList = l -> {
		Node currentNode = l.head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	};
	
	static LinkedList insert(int index,int data,LinkedList list) {
		Node currentNode = list.head;
		Node preNode = list.head;
		for(int i=0;i<list.length;i++) {
			if((index-1) == i) {
				preNode = currentNode;
			}else if(index == i) {
				Node newNode = new Node(data);
				newNode.next = preNode.next;
				preNode.next = newNode;
				list.length ++;
				break;
			}else {
				currentNode = currentNode.next;
			}
		}
		return list;
	}
	
	static void remove(int index,LinkedList list) {
		Node currentElement = list.head;
		for(int i=0;i<list.length;i++) {
			if(index ==0) {
				list.head = list.head.next;
				list.length --;
				break;
			}else if(i== (index-1)) {
				currentElement.next = currentElement.next.next;
				list.length --;
				break;
			
			}else {
				currentElement = currentElement.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list = append(list, 10);
		list = append(list, 20);
		list = append(list, 30);
		printList.accept(list);
		list = prepend(list, 30);
		System.out.println();
		printList.accept(list);
		list = insert(2,101,list);
		System.out.println();
		printList.accept(list);
		remove(2,list);
		System.out.println();
		printList.accept(list);
		
	}

}
