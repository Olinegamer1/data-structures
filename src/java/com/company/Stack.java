package com.company;

public class Stack {
    private final int maxSize;
    private final long[] stackArray;
    private int topValue = -1;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
    }

    public void push(long value) {
        stackArray[++topValue] = value;
    }

    public long pop() {
        return stackArray[topValue--];
    }

    public long peek() {
        return stackArray[topValue];
    }

    public boolean isEmpty() {
        return topValue == -1;
    }

    public boolean isFull() {
        return topValue == (maxSize - 1);
    }
}
