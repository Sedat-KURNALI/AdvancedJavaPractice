package TECHNOSTUDY_USA.day8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Write a Java program that reads a number and display the square, cube
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter an integer to take its square:");
        int a = s1.nextInt();
        System.out.println(a +" squared is:" + a*a);

        System.out.println("\n"+"\n\nEnter an integer to take its cube:");
        int b = s1.nextInt();
        System.out.println( b +" cubed is:" + b*b*b);
    }
}
