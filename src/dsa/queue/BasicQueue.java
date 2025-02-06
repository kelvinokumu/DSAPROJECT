package dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Display front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Removed: " + queue.remove());
        System.out.println("Removed: " + queue.poll());

        // Display remaining elements
        System.out.println("Queue: " + queue);
    }
}
