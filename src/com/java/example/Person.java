package com.java.example;

/**
 * Author: Sivaganesh S
 * Date:9/18/2025
 */

public class Person implements Cloneable {

    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
