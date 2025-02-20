package dsa.searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is smaller, search the left subarray
            if (arr[mid] > target)
                return binarySearch(arr, left, mid - 1, target);

            // search the right subarray
            return binarySearch(arr, mid + 1, right, target);
        }
        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
