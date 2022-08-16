package TECHNOSTUDY_USA.day11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Let user provide a number between 0 and 3 //i1
        // and generate a random number between 0 and 3 //i2
        // and check if provided number is equal to generated number
        // if they are equal print out "You Won the Game!!!"
        // else "Game Over!!!"
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number between 0-3:");
        /*
         int min = 0;
        int max = 3;
        int numberInRange = (int) (Math.random() * ((max - min) + 1)) + min;
         */
        int i1 = scan.nextInt();

        int min = 0;
        int max = 3;
        int generatedNumber = (int) (Math.random() * ((max - min) + 1)) + min;

        //Random rand = new Random();
        //int generatedNumber = rand.nextInt(4);
        //

        if (i1==generatedNumber){
            System.out.println("You Won the Game!!!");
        }else { System.out.println("Game Over!!!");
        }
    }
}
