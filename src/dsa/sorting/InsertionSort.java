package dsa.sorting;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            // Element to be inserted
            int key = inputArray[i];
            int j = i - 1;

            // Move elements that are greater than key one position ahead
            while (j >= 0 && inputArray[j] > key) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            // Insert the key at the correct position
            inputArray[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
//            insert the values in the array
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

//        for(int i = 0;i < arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
    }

    public static int getInputs(){
//        get array inputs and return the
//        values (size and random)
        return 0;
    }
}

