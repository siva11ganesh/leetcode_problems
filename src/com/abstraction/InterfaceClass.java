package com.abstraction;

/**
 * Author: Sivaganesh S
 * Date:9/18/2025
 */

public class InterfaceClass implements InterfaceTest {
    @Override
    public int calc(int x, int y) {
        return x + y;
    }

//    @Override
//    public void test1() {
//        InterfaceTest.super.test1();
//    }

    public static void main(String[] args) {
        InterfaceClass i = new InterfaceClass();

        int c = i.calc(5, 7);
        System.out.println(c);
        i.test1();

        InterfaceTest.testStatic();
    }
}
