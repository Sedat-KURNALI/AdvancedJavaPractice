package TECHNOSTUDY_USA.day8;

public class Task3 {
    public static void main(String[] args) {
        // Write a Java program that calculate average of following numbers
// hint: some of them are integers

//   input: 23.4, 24.0, 12, 450.3, 23000
        double v1 = 23.4;
        double v2 = 24.0;
        int v3 = 12;
        double v4 = 450.3;
        int v5 = 23000;
        double average = ( (v1+v2+v3+v4+v5)/5 );
        System.out.println(average);

        // part 2 with Assignment operators
        int t1 = 12;
        t1 += 23000;

        double t2 = 23.4;
         t2 +=24.0;
         t2 +=450.3;
         double average2 = (t1+t2)/5;

        System.out.println("Average is:" +average2);
        /* 2. way
        int integers = 12;
        integers += 23000;

        double decimals = 23.4;
        decimals += 24.0;
        decimals += 450.3;

        double avg = (integers + decimals) / 5;
        System.out.println( "2. way: " + avg );
*/
    }
}
