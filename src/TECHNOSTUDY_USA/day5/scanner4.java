package TECHNOSTUDY_USA.day5;

import java.util.Scanner;

public class scanner4 {
    public static void main(String[] args) {

        Scanner hp = new Scanner(System.in);

        //      create one int and enter your monthly spend print the number.

        System.out.println("What is your monthly spend amount: ");
        int monthlySpend = hp.nextInt();
        System.out.println("Your monthly spend amount is: " +monthlySpend);

        // use double

        System.out.println("What is your monthly spend amount  in double: ");
        double monthlySpend_double = hp.nextDouble();
        System.out.println("Your monthly spend amount is: " +monthlySpend_double);

        System.out.println("What is your monthly salary  in double: ");
        double monthlySalary_double = hp.nextDouble();
        System.out.println("Your monthly spend amount is: " +monthlySalary_double);

    }
}
