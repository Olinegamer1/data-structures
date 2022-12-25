package com.company.array;

import com.company.StackX;

public class IntToPost {
    private final StackX theStack;
    private final String input;
    private final StringBuilder stringBuilder = new StringBuilder();

    public IntToPost(String input) {
        this.input = input;
        theStack = new StackX(input.length());
    }

    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+', '-' -> gotOperator(ch, 1);
                case '*', '/' -> gotOperator(ch, 2);
                case '(' -> theStack.push(ch);
                case ')' -> gotParen();
                default -> stringBuilder.append(ch);
            }
        }
        while (!theStack.isEmpty()) {
            stringBuilder.append(theStack.pop());
        }
        return stringBuilder.toString();
    }

    private void gotParen() {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') {
                break;
            } else {
                stringBuilder.append(chx);
            }
        }
    }

    private void gotOperator(char currentOperator, int priorityOperator) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int priorityNewOperator = (opTop == '+') || (opTop == '-') ? 1 : 2;
                if (priorityNewOperator < priorityOperator) {
                    theStack.push(opTop);
                    break;
                } else {
                    stringBuilder.append(opTop);
                }
            }
        }
        theStack.push(currentOperator);
    }
}
