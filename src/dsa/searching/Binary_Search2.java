package dsa.searching;

public class Binary_Search2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 15};
        int target = 10;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids integer overflow

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid;
            }
            // If target is greater, ignore left half
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }



}
