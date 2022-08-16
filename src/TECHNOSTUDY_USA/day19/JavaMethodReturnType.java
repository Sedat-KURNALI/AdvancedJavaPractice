package TECHNOSTUDY_USA.day19;

public class JavaMethodReturnType {

    public static void main(String[] args) {
        int length = "hello".length();

        int sum= sumOfTwoNumbers(5,5);

        int twelve = sumOfTwoNumbers(7, 5);
        System.out.println(twelve);

       int sonuc = sumOfTwoNumbers(2,3);
        System.out.println(sonuc);

        double avg = sum / 2.0;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);

String b = buyBread(112.112);
        System.out.println(b);

       double cikti = gravityOfEarth();
        System.out.println("Yercekimi: "+cikti);
    }

    public static int sumOfTwoNumbers(int a, int b){
        int result = a + b;
        //System.out.println(a+ " + " + b + " = " + result);

        return result;
    }
    public static String buyBread (double price){
        return "Bread";
    }
    public static double gravityOfEarth(){
        return 9.8;
    }
}
