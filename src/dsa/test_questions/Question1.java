package dsa.test_questions;

import java.util.Arrays;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 9, 5);
        int max = findLargest(numbers);
        System.out.println("Largest Number: " + max);
    }

    public static int findLargest(List<Integer> numbers) {
        int max = numbers.get(0); //  first number is the largest

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
