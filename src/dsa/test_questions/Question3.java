package dsa.test_questions;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        reverseArray(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        for (; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}

