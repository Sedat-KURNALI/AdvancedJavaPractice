package TECHNOSTUDY_USA.day16;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // create an array with size 10
        // populate your array with random numbers using Random or Math.random()

        // Part 2 sum values of your array

        // part3: get average of array
    int[] array1 = new int[10];
        Random rand = new Random();

        int sum = 0;
        double ave = 0;
        for (int i = 0; i < array1.length; i++) {
            int randomNumber = rand.nextInt(1000);
            array1[i] = randomNumber;
            //array[i] = (int)(Math.random() * 100);
            //to sum you array values
            sum += array1[i];
            ave = sum/array1.length;
        }

        System.out.println("Your array is: " + Arrays.toString(array1));
        System.out.println("Sum of your array values: " + sum);
        System.out.println("Average of your array values: " + ave);


    }
}
