package TECHNOSTUDY_USA.day20;

public class JavaMethod {

    public static void main(String[] args) {
        int sumOfTwo = sum(5,4);
        int sumOfThree = sum(5,5,5 );
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    //1. The number of parameters in two methods.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
