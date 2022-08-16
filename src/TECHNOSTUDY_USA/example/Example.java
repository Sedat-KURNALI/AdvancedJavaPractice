package TECHNOSTUDY_USA.example;

public class Example {

    public static void main(String[] args) {

        String text = "$12 $23 $10 $2 $5 $2";

        String text1 = text.replaceAll("\\$", "" );

        String[] num = text1.split(" ");

        int[] numbers = new int[num.length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.valueOf (num[i]);
            sum += numbers[i];
        }
        System.out.println(sum);



    }

}
