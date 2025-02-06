package dsa.arrays;

public class Arrays {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Get elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Change an element
        numbers[2] = 35;
        System.out.println("Modified third element: " + numbers[2]);

        // Loop through the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("For each loops");
        // same as above
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
