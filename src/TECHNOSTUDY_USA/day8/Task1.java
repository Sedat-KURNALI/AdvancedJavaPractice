package TECHNOSTUDY_USA.day8;

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
            // Write a Java program that multiplies four integers and  print result
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
            System.out.println("Result: "+a*b*c*d);

// Part 2: Use scanner to provide numbers
            Scanner s1 = new Scanner (System.in);
            System.out.println("Enter one integer to e: " );
            int e = s1.nextInt();
            System.out.println("Enter one integer to f: " );
            int f = s1.nextInt();
            System.out.println("Enter one integer to g: " );
            int g = s1.nextInt();
            System.out.println("Enter one integer to h: " );
            int h = s1.nextInt();
            System.out.println("Result: " +e*f*g*h);

// 3. way
            int result = 2; // 2
            result = result * 3; // 2 * 3 = 6
            result = result * 4; // 6 * 4 = 24
            result = result * 5; // 24 * 5 = 120
            System.out.println( "3. way: " + result );
    }
}
