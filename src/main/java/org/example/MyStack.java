package org.example;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement a last-in-first-out (LIFO) stack using only two queues.
 * The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 *
 * Implement the MyStack class:
 *
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 *
 * using 2 queue, 1 : data   2: help
 * data 用来装数据
 * 每次弹出数据后，data 和 help 发生一次指向的交换；
 */
public class MyStack {
    private Queue<Integer> data;
    private Queue<Integer> help;

    public MyStack() {
        data = new LinkedList<>();
        help = new LinkedList<>();
    }

    public void push(int x){
        data.offer(x);
    }

    /**
     * 需要用到help
     * @return
     */
    public int pop(){
        // 1. 依次弹出data前n - 1个元素， 弹出来的，装入help
        while (data.size() > 1){
            Integer poll = data.poll();
            help.offer(poll);
        }

        // 2. 只剩最后一个元素，
        Integer last = data.poll();

        // 3。 data 和 help 进行指针的交换
        swap();

        return last;
    }



    public int top(){

        // 1. 依次弹出data前n - 1个元素， 弹出来的，装入help
        while (data.size() > 1){
            Integer poll = data.poll();
            help.offer(poll);
        }

        // 2. 只剩最后一个元素，
        Integer last = data.poll();
        help.offer(last);

        // 3。 data 和 help 进行指针的交换
        swap();

        return last;
    }

    public boolean empty(){

        return data.isEmpty() && help.isEmpty();
    }

    private void swap() {
        Queue<Integer> temp = help;
        help = data;
        data = temp;
    }
}
