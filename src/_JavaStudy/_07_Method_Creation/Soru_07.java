package _JavaStudy._07_Method_Creation;

import java.util.Scanner;

public class Soru_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        int not = scanner.nextInt();

        System.out.println(grades(not));


    }


    public static String grades(int grade) {
        if (grade >= 85) {
            return "Perfect";
        } else if (grade >= 70) {
            return "Good";
        } else if (grade >= 60) {
            return "Normal";
        } else if (grade >= 45) {
            return "Not bad";
        } else {
            return "Bad";
        }

    }/*
      Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu giriniz: ");
        int not = scanner.nextInt();

        grades(not);


    }

    public static void grades(int grade) {
        if (grade >= 85) {
            System.out.println("Perfect");
        } else if (grade >= 70) {
            System.out.println("Good");
        } else if (grade >= 60) {
            System.out.println("Normal");
        } else if (grade >= 45) {
            System.out.println("Not bad");
        } else {
            System.out.println("Bad");
        }
        */
}
