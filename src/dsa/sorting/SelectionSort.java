package dsa.sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the first unsorted element is the smallest
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
