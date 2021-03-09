package com.datastrucutre.stack;

class Node{
	Node next;
	String value;
	public Node(String val){
		this.value = val;
		this.next = null;
	}
}
public class StakeImpl {
	Node top;
	Node bottom;
	int length;
	
	public StakeImpl() {
		this.length = 0;
		// TODO Auto-generated constructor stub
	}

	public void push(String value) {
		Node newNode = new Node(value);
		if(length == 0) {
			top = newNode;
			bottom = newNode;
		}else {
			bottom.next = newNode;
			bottom = newNode;
		}
		length ++;
	}
	
	public void printStack() {
		Node currentNode = top;
		while(currentNode != null) {
			System.out.println(currentNode.value);
			currentNode = currentNode.next;
		}
	}
	
	public String peek() {
		return top.value;
	}
	
	public String pop() {
		if(top.equals(bottom)) {
			
		}
		Node currentTop = top;
		top = top.next;
		length--;
		return currentTop.value;
		
	}
}
