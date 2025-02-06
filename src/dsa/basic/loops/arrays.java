package dsa.basic.loops;

public class arrays {
    public static void main(String[] args) {
//        int numbers[] = {54,1,31,12,78,25,0};
//        int min = numbers[0];
//        for(int i = 1;i<numbers.length;i++){
//            if(min > numbers[i]){
//                min = numbers[i];
//            }
//        }
//        System.out.println("The min is "+min);


        getValue();
    }

    public static void getValue() {
        int numbers[] = {54,1,31,12,78,25,0};
        int search = 0;
        for(int i = 1;i<numbers.length;i++){
            if(search == numbers[i]){
                System.out.println("The value is "+search);
                return;
            }
        }
        System.out.println("The value is "+search);
    }
}
