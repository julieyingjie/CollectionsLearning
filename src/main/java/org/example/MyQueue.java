package org.example;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {

        if (inStack.empty()&& outStack.empty()) throw new RuntimeException("Queue is empty");
        else if (outStack.empty()){
            while (!inStack.empty()){
                outStack.push(inStack.pop());
            }
        }

     return outStack.pop();
    }

    public int peek() {
        if (inStack.empty() && outStack.empty()) throw new RuntimeException("Queue is empty");
        else if (outStack.empty()){
            while (!inStack.empty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.empty() && outStack.empty();
    }

}
