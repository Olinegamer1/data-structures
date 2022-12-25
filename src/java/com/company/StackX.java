package com.company;

public class StackX {
    private final char[] stackArray;
    private int top;

    public StackX(int maxSize) {
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public char peekN(int n) {
        return stackArray[n];
    }

    public void display(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
