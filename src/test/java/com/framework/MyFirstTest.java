package com.framework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MyFirstTest {
    @Test
    public void myFirstTest() {
        System.out.println("Runs");
        int result = sum (2,2);
        Assertions.assertEquals(4, result);
    }
    static int sum(int a, int b) {
        return a + b;
    }
}
