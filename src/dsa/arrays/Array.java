package dsa.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // 1. Accessing elements in an array
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 3: " + numbers[3]);

        // 2. Iterating through the array using a for loop
        System.out.println("\n Array elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 3. Searching for an element in the array
        int target = 30;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                System.out.println("\n" + target + " found at index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("\n" + target + " not found in the array.");
        }

        // 4. Sorting the array
        Arrays.sort(numbers);
        System.out.println("\nSorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 5. Finding the maximum element in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("\n\nMaximum value in the array: " + max);

        // 6. Finding the minimum element in the array
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
    }
}

