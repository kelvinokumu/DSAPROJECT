package dsa.basic;

public class twoloops {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
//            System.out.println(" Outer loop "+i + " ");
            for(int j = 1; j <= 10; j++){
//                System.out.println(j + " Inner loop");
                System.out.println("outer " +i+ " inner "+ j +" = "+ (j*i));
            }
        }
    }
}
