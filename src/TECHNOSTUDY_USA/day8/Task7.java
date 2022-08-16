package TECHNOSTUDY_USA.day8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
/*
 Write a Java program to break an integer into a sequence of individual digits.
 Hint: use / and %
 ex: input: 12345
 output: 1
         2
         3
         4
         5
         */
        Scanner in = new Scanner(System.in);
         System.out.print("Input five digits: ");

             int input = in.nextInt();
            int n1 = input / 10000 % 10;
           int n2 = input / 1000 % 10;
          int n3 = input / 100 % 10;
         int n4 = input / 10 % 10;
        int n5 = input % 10;
        System.out.println(n1);
         System.out.println(n2);
          System.out.println(n3);
           System.out.println(n4);
            System.out.println(n5);

    }
}
