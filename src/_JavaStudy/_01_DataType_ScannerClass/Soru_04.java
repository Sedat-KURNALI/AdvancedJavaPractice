package _JavaStudy._01_DataType_ScannerClass;

import java.util.Scanner;

public class Soru_04 {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula
    // (32°F − 32) × 5/9 = 0°C
    // c = (f-32)*5/9

//Scanner kullanin

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("fahrenayt değeri giriniz : ");

        int f=scan.nextInt();
        System.out.println("santigrad derceniz : "+(f-32)*5/9);
    }
}
