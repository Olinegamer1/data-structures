package com.company.array;

import com.company.PriorityQueue;

public class ArrayApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        PriorityQueue stack =  new PriorityQueue(5);
        stack.insert(10);
        stack.insert(4);
        stack.insert(11);
        stack.insert(3);
    }
}
