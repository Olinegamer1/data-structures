package com.company.recursion;

public class SimpleRecursionAlgorithms {
    public static int triangleNumber(int number) {
        if (number < 2) return 1;
        return number + triangleNumber(--number);
    }

    public static int factorial(int number) {
        if (number < 2) return 1;
        return number * factorial(--number);
    }
}
