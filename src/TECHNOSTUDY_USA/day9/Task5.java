package TECHNOSTUDY_USA.day9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Write a Java program to get a text from the user
        // and print whether it has 't' letter in it

        Scanner scan = new Scanner(System.in);
        System.out.print("Provide a text please: ");
        String str1 = scan.nextLine();


        if (str1.contains ("t")) {
            System.out.println("Your text has 't' letter");


        }
    }
}