package HomeWork.HomeworkDay10;


import java.util.Scanner;


public class HomeworkFromGithub {
    public static void main(String[] args) {
        //    Write a Java program that determines a student’s grade.?
//The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
//-if the average score >=90% =>grade=A
//-if the average score >= 70% and <90% => grade=B
//-if the average score>=50% and <70% =>grade=C
//-if the average score<50% =>grade=F
//See the _duzenle.TECHNOSTUDY_USA.example output below:
//
//Quiz score: 80
//
//Mid-term score: 68
//
//Final score: 90
//
//Your grade is B.
        Scanner grade = new Scanner(System.in);
        System.out.println("What is your Quiz Score");
        int quizScore = grade.nextInt();
        System.out.println("What is you Mid-term Score");
        int midtermScore = grade.nextInt();
        System.out.println("What is you Final Score");
        int finalScore = grade.nextInt();

        System.out.println("The average is");
        int average = ((quizScore + midtermScore + finalScore) / 3);
        System.out.println(average);


        if (average >= 90) {
            System.out.println("your grade is A");
        } else if (average >= 70 && average < 90) {
            System.out.println("your grade is B");
        } else if (average >= 50 && average < 70) {
            System.out.println("your grade is C");
        } else if (average < 50) {
            System.out.println("your grade is F");
        }
    }
}
