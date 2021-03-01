package com.datastructure.LinkedList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LinkedList {

	Node head;
	Node tail;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public static LinkedList insert(LinkedList list, int data) {
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

		return list;
	}

	public static LinkedList prepend(LinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = list.head;
		list.head = new_node;
		return list;
	}

	static Consumer<LinkedList> printList = l -> {
		Node currentNode = l.head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		printList.accept(list);
		list = prepend(list, 30);
		System.out.println();
		printList.accept(list);
	}

}
