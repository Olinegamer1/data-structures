package com.company;

public class PriorityQueue {
    private final int maxSize;
    private final long[] queArray;
    private int countOfElements;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
    }

    public void insert(long item) {
        if (countOfElements == 0) {
            queArray[countOfElements++] = item;
        } else {
            int i;
            for (i = countOfElements - 1; i >= 0; i--) {
                if (item > queArray[i]) {
                    queArray[i + 1] = queArray[i];
                } else {
                    break;
                }
            }
            queArray[i + 1] = item;
            countOfElements++;
        }
    }

    public long remove() {
        return queArray[--countOfElements];
    }

    public long peekMain() {
        return queArray[countOfElements - 1];
    }

    public boolean isEmpty() {
        return countOfElements == 0;
    }

    public boolean isFull() {
        return countOfElements == maxSize;
    }
}
