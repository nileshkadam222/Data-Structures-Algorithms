package com.datastrucutre.stack;

public class UseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StakeImpl s = new StakeImpl();
		s.push("Google");
		s.push("Facebook");
		s.push("Udemy");
		//s.printStack();
		System.out.print(s.peek());
		s.pop();
		s.printStack();

	}

}
