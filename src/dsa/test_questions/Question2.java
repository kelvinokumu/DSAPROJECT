package dsa.test_questions;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 7, 9, 10);
        countEvenOdd(numbers);
    }

    public static void countEvenOdd(List<Integer> numbers) {
        int evenCount = 0, oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount + ", Odd: " + oddCount);
    }
}
