package dsa.queue;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = size = 0;
        rear = capacity - 1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);

        System.out.println("Front element: " + circularQueue.peek());

        System.out.println("Removed: " + circularQueue.dequeue());
        System.out.println("Removed: " + circularQueue.dequeue());

        circularQueue.enqueue(6);

        System.out.println("Queue after enqueueing 6: " + circularQueue.peek());
    }
}

