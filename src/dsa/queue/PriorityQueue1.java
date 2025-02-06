package dsa.queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Enqueue elements
        pq.add(4);
        pq.add(1);
        pq.add(3);
        pq.add(2);

        // Dequeue elements based on priority
        System.out.println("Removed: " + pq.remove());
        System.out.println("Removed: " + pq.poll());

        // Display remaining elements
        System.out.println("PriorityQueue: " + pq);
    }
}

