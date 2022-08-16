package TECHNOSTUDY_USA.day8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
      //Part 1
        // Write a Java program to compute body mass index (BMI).
// BMI: The BMI is defined as the body mass divided by the square of the body height,
//      and is universally expressed in units of kg/m2,
//      resulting from mass in kilograms and height in metres.
// The formula is BMI = kg/m2
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your weight in kilogram:" );
        double weight = s1.nextDouble();
        System.out.println("Your weight is: " +weight+" kg");
        System.out.println("\nEnter your height in meter:" );
        double height = s1.nextDouble();
        System.out.println("Your height is: " +height+" m");
        double bmi = weight/(height*height);
        System.out.println("\nYour body mass index (BMI) is: " +bmi +" kg/m²");


    }
}

