package com.java.example;

import java.beans.DesignMode;

public class TT {


    static int a = 10;
    static int x;

    private int b;

    static {
        System.out.println("Static block");
        x = 5;
    }

    TT() {
        System.out.println("Constructor");
        b = 20;
    }

    TT(int c) {
        this.b = c;
    }

    TT(int c, int d) {
        this(c);
        this.b = d;

    }


    void display() {
        System.out.println("Object initialized");
        System.out.println("X:" + x);
        System.out.println("a:" + a);

        System.out.println("B:" + b);
    }


    public static void main(String[] args) {

        TT t = new TT();
        t.display();
    }
}
