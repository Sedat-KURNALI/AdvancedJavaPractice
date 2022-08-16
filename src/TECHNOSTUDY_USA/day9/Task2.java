package TECHNOSTUDY_USA.day9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // write a java program, where user provides prices of two items
        // and your program should calculate total price

        //input:
        // Enter price of item 1: $10.9
        // Enter price of item 2: $1.1

        //output:
        // Total: $12.0

        //part 2: you can add tax

        //part 3:
        //input should be like
        // Apple $1.1
        // Bread $3.0
        //output should be like
        // Total of Apple and Bread is: $4.1

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide 1st item price:  ");
        String s1 = scan.nextLine();
        System.out.println("First item is:" +s1);

        System.out.println("\nProvide 2nd item price::  ");
        String s2 = scan.nextLine();
        System.out.println("Second item is:" +s2);

        s1 = s1.replace("$", "" );
        s2 = s2.replace("$", "" );


        double d1 = Double.valueOf(s1);
        double d2 = Double.valueOf(s2);

        double dt1 = d1*0.08;
        double dt2 = d2*0.08;

        double tax = dt1+dt2;
        d1 = d1+dt1;
        d2 = d2+dt2;
double sum=d1+d2;
        System.out.println("\nTotal price is: $" + sum );
        System.out.println("Total tax: " +tax);


    }
}
