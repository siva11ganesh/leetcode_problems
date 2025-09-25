package com.java.example;

public class Testing {

    static {
        System.out.println("Static block");
    }

    static void test() {
        System.out.println("empty function");
    }

    public Testing() {
        System.out.println("Constructor..");
    }

    void test2() {
        System.out.println("Object call");
    }

    public static void main(String[] args) {
        System.out.println("Testing--1");
        test();
        Testing t = new Testing();
        t.test2();
    }

//    Static variables are stored in the Method Area.
//    Instance variables are stored in the Heap.
//    Local Variables are stored Stack.
}
