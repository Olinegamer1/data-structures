package com.company.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleRecursionAlgorithmsTest {

    @Test
    void testTriangleNumber() {
        assertEquals(1, SimpleRecursionAlgorithms.triangleNumber(1));
        assertEquals(3, SimpleRecursionAlgorithms.triangleNumber(2));
        assertEquals(6, SimpleRecursionAlgorithms.triangleNumber(3));
        assertEquals(10, SimpleRecursionAlgorithms.triangleNumber(4));
        assertEquals(15, SimpleRecursionAlgorithms.triangleNumber(5));
    }

    @Test
    void factorial() {
        assertEquals(1, SimpleRecursionAlgorithms.factorial(0));
        assertEquals(1, SimpleRecursionAlgorithms.factorial(1));
        assertEquals(2, SimpleRecursionAlgorithms.factorial(2));
        assertEquals(6, SimpleRecursionAlgorithms.factorial(3));
        assertEquals(24, SimpleRecursionAlgorithms.factorial(4));
        assertEquals(120, SimpleRecursionAlgorithms.factorial(5));
    }
}