package TECHNOSTUDY_USA.day9;

import java.util.Scanner;

public class Task0 {
    // using scanner provide a number
    // and check if its greater than 100
    // input: 99
    // output: 99 > 100: false

    // part2:
    // using if statement, check if it is greater than 100
    // only than print output

    public static void main(String[] args) {
      //Part 1
     //     Scanner s1 = new Scanner(System.in);
     //  int v1 = s1.nextInt();
      //  System.out.println("output: "+v1+">100: "+(v1>100));

       //Part2
        Scanner s1 = new Scanner(System.in);
          int v1 = s1.nextInt();
         if (v1>100) {
            System.out.println("output: " + v1 + ">100: ");
         }
             System.out.println((v1 > 100)); // We will study later.

        }
}
