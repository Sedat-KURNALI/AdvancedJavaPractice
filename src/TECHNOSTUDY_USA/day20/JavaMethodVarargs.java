package TECHNOSTUDY_USA.day20;

public class JavaMethodVarargs {

    public static void main(String[] args) {
        int sum = sum(1, 2, 5, 6, 7);

    }

    public static int sum(int... numbers) { //int[] numbers
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /*    public static int sum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }*/

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }





}