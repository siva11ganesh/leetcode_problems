package com.java.example;

/**
 * Author: Sivaganesh S
 * Date:9/18/2025
 */

public class Main {

    /**
     * Clone interface - shallow copy example
     *
     * @param args -  main function args
     */
    public static void main(String[] args) {
        Person p = new Person(1, "Siva");
        System.out.println(p.id + "--" + p.name);

        Person p1 = p.clone();
        System.out.println(p1.id + "---" + p1.name);
    }
}
