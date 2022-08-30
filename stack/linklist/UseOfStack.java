package com.datastructure.stack.linklist;

public class UseOfStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek :"+s.peek());
        s.printStack();
        s.pop();
        s.printStack();
    }
}
