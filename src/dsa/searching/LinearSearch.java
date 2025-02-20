package dsa.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 15};
        int target = 1;
//        System.out.println(linearSearch(arr, target));
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println(result);
        }else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return -1;
    }
}
