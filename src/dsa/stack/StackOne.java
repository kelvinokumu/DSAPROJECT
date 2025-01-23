package dsa.stack;

import java.util.Stack;

public class StackOne {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push operations: " + stack);

        // Peek
        System.out.println("Top element (peek): " + stack.peek());

//        confirm no item was removed
        System.out.println("Stack after push operations: " + stack);

        // Pop
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop operation: " + stack);

        // isEmpty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Search for an element in the stack
        int position = stack.search(10);
        if (position != -1) {
            System.out.println("Element 10 found at position: " + position);
        } else {
            System.out.println("Element 10 not found in the stack.");
        }
    }
}

