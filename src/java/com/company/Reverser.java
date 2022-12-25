package com.company;

public class Reverser {
    private final String in;
    StringBuilder stringBuilder = new StringBuilder();
    public Reverser(String in) {
        this.in = in;
    }

    public String reverseString() {
        Stack stack = new Stack(in.length());

        for (char ch : in.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            stringBuilder.append((char) stack.pop());
        }

        return stringBuilder.toString();
    }
}
