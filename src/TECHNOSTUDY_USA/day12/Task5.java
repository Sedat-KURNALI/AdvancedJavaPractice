package TECHNOSTUDY_USA.day12;

        import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Write a Java program that takes a year from user
        // and print whether that year is a leap year or not.
        Scanner s = new Scanner(System.in);
        System.out.println("Provide a year [YYYY]:");
        int year = s.nextInt();

        String result = "";
/* *** my solution ***
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            result = "LEAP YEAR";
        } else {
            result = "NOT LEAP YEAR";
        } if (year % 4 == 0 && year % 100 != 0) {
            result = "LEAP YEAR";
        } else if (year % 4 == 0 && year % 100 == 0){
            result = "LEAP YEAR";
        }
        System.out.println(result);
        */
        if (year%4==0){
            result = " IS LEAP YEAR";
            if (year%100!=0) {
                if (year%400==0){
                    result = " IS LEAP YEAR";
                }
            }
        }else {
            result = " IS NOT LEAP YEAR";
        }
        System.out.println(year + result);



        }
    }
