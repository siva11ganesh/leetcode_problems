package com.easyproblems;

import java.util.Scanner;

public class ArrayUsingStack {

    private int[] stackArray; // Array to store stack elements
    private int top;          // Index of the top element
    private int capacity;

    public ArrayUsingStack(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Stack size must be positive.");
        }
        stackArray = new int[size];
        capacity = size;
        top = -1; // Stack is initially empty
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to stack.");
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1; // Sentinel value for empty stack
        }
        return stackArray[top--];
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter stack size: ");
            int size = scanner.nextInt();
            ArrayUsingStack stack = new ArrayUsingStack(size);

            while (true) {
                System.out.println("\n--- Stack Menu ---");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Display");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Clear invalid input
                    continue;
                }

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter value to push: ");
                        if (scanner.hasNextInt()) {
                            stack.push(scanner.nextInt());
                        } else {
                            System.out.println("Invalid input. Please enter an integer.");
                            scanner.next();
                        }
                        break;
                    case 2:
                        int popped = stack.pop();
                        if (popped != -1) {
                            System.out.println("Popped: " + popped);
                        }
                        break;
                    case 3:
                        int topValue = stack.peek();
                        if (topValue != -1) {
                            System.out.println("Top element: " + topValue);
                        }
                        break;
                    case 4:
                        stack.display();
                        break;
                    case 5:
                        System.out.println("Exiting program.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
