package com.datastrucutre.stack;

public class UseArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithArrays s = new StackWithArrays(5);
		s.push.accept("Nilesh");
		s.push.accept("Suashant");
		s.push.accept("Pari");
		s.push.accept("Arti");
		s.printArray();
		String pe = s.peek.get();
		System.out.println("peek value in stack: "+pe);
		s.pop.get();
		String pe2 = s.peek.get();
		System.out.println("peek value in stack: "+pe2);
		s.printArray();
		
	}

}
