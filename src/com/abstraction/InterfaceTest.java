package com.abstraction;

/**
 * Author: Sivaganesh S
 * Date:9/18/2025
 */

public interface InterfaceTest {

    int calc(int x, int y);

    default void test1() {
        System.out.println("Test1");
    }

    static void testStatic() {
        System.out.println("Test Static");
    }
}
