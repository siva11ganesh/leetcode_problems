package com.java.example;

/**
 * Author: Sivaganesh S
 * Date:9/19/2025
 */

public class ExceptionTest {

    public static void main(String[] args) {
        int a = 10;
        int v=    divide(a);
        System.out.println(v);
    }

    static int divide(int a) {
        try {
            int c = a / 0;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
