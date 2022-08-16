package TECHNOSTUDY_USA.day9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Write a Java program to get a number from the user
        // and print whether it is positive or negative
        Scanner scan = new Scanner( System.in );
        System.out.println( "Provide a number please: " );
        int i = scan.nextInt();
        if (i<0) {
            System.out.println("Your number is negative");
        }
            if (i==0) {
            System.out.println("You entered 0");
            }
                    if (i>0) {
                    System.out.println("Your number is positive");
                    }


        //Part 2:
    }
}
