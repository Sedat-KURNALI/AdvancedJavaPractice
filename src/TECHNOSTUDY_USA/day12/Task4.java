package TECHNOSTUDY_USA.day12;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
/*
    Write a Java program to input marks of five subjects
    Physics, Chemistry, Biology, Mathematics and Computer,
    calculate percentage and grade according to given conditions:

If percentage >= 90% : Grade A
If percentage >= 80% : Grade B
If percentage >= 70% : Grade C
If percentage >= 60% : Grade D
If percentage >= 40% : Grade E
If percentage < 40% : Grade F
     */
        //ex:
//    Physics: 90,
//    Chemistry: 50,
//    Biology: 77,
//    Mathematics: 95
//    Computer: 65
//percentage = (90+50+77+95+65)/5

        Scanner s = new Scanner(System.in);
        System.out.println("Provide a grade for Physics:");
        int P = s.nextInt();
        System.out.println("Provide a grade for Chemistry:");
        int C = s.nextInt();
        System.out.println("Provide a grade for Biology:");
        int B = s.nextInt();
        System.out.println("Provide a grade for Mathematics:");
        int M = s.nextInt();
        System.out.println("Provide a grade for Computer:");
        int Com = s.nextInt();

        int percentage = (P+C+B+M+Com)/5;
String grade = "";

        if (percentage>= 90) {
            grade = "A";
        }else if (percentage>= 80) {
            grade = "B";
        }else if (percentage>= 70) {
            grade = "C";
        }else if (percentage>= 60) {
            grade = "D";
        }else if (percentage>= 40) {
            grade = "E";
        }else if (percentage < 40) {
            grade = "F";
        }
        System.out.println("Percentage: " +percentage);
        System.out.println("Grade is : "+grade);


    }
}
