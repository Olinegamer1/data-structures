package com.company;

public class Queue {
    private final int maxSize;
    private final long[] queueArray;
    private int front;
    private int rear;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new long[maxSize];
        rear = -1;
    }

    public void insert(long value) {
        rear = rear == maxSize - 1 ? -1 : rear;
        queueArray[++rear] = value;
    }

    public long remove() {
        long temp = queueArray[front++];
        front = front == maxSize ? 0 : front;
        return temp;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (rear + 1 == front)
                || (front + maxSize - 1 == rear);
    }

    public boolean isFull() {
        return (rear + 2 == front)
                || (front + maxSize - 2 == rear);
    }

    public int size() {
        return rear >= front ? rear - front + 1
                : (maxSize - front) + (rear + 1);
    }

}
