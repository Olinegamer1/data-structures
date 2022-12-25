package com.company.list;

public class FirstLastLink {
    private Link first;
    private Link last;

    public FirstLastLink() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(long data) {
        Link newLink = new Link(data);
        if (first == null) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public long deleteFirst() {
        long tempData = first.data;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return tempData;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }
}
