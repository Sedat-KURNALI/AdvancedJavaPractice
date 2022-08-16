package TECHNOSTUDY_USA.day8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        //(32°F − 32) × 5/9 = 0°C
        Scanner s1 = new Scanner(System.in);
        System.out.println("Provide any Fahrenheit degree: ");
        int v1 = s1.nextInt();
        int v2 = (int) ((v1-32)*5/9);
        System.out.println("Celcius degree of " +v1+ "°F"+" Fahrenheit is: " +v2+"°C");

    }
}
