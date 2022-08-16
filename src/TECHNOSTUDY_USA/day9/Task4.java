package TECHNOSTUDY_USA.day9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Take two numbers from the user and print the greatest number

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide 1st number please: ");
        int i1 = scan.nextInt();
        System.out.println("Provide 2nd number please: ");
        int i2 = scan.nextInt();
/*
        if (i1 > i2) {
            System.out.println("Bigger number is:" + i1);
        }
        if (i2 > i1) {
            System.out.println("Bigger number is:" + i2);

     */
        if (i1 > i2) {
            System.out.println("Bigger number is:" + i1);
        } else { // else code block
            System.out.println("Bigger number is:" + i2);
        }
        }
    }