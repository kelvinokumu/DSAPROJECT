package dsa.recursion;

public class Recursion {
    public static void main(String[] args) {
        int num = 1;
        repeat(num);
    }

    public static void repeat(int n) {
        System.out.println("Recursion "+n);
        if(n == 10){
            return;
        }
        repeat(n+1);
    }
}
