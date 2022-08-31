package com.datastructure.data_structures.Queue.UseingNode;

import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

//Queue conatin first in first out order
// enqueue
//dequeue
//printQueue
class Node{
	int data;
	Node next;
	public Node(int val) {
		this.data = val;
		this.next = null;
	}
}
public class QueueStr {
	Node first;
	Node last;
	int length;
	
	public QueueStr() {
		this.length = 0;
	}
	
	IntConsumer enqueue = val ->{
		Node newNode =new Node(val);
		if(length == 0) {
			this.first = newNode;
			this.last = newNode;
			length ++;
		}else {
			this.last.next = newNode;
			this.last = newNode;
			length ++;
		}
		
	};
	
	IntSupplier deQueue = () ->{
		Node currentNode = first;
		first = first.next;
		length --;
		return currentNode.data;
	};
	
	public void printQueueData() {
		Node currentNode = first;
		while(currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
}
