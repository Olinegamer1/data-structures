package com.company.list;

public class LinkQueue {
    private final FirstLastLink list;

    public LinkQueue(FirstLastLink list) {
        this.list = list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void insert(long data) {
        list.insertLast(data);
    }

    public long remove() {
        return list.deleteFirst();
    }

    public void displayQueue() {
        list.displayList();
    }
}
