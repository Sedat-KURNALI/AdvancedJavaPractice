package TECHNOSTUDY_USA.day17;

import java.util.Arrays;

public class Ex1 {
    //Write a Java program to find the maximum and minimum value of an int array.
    public static void main(String[] args) {
        //1st way:
        int[] array = {3, 9, 6, 1, 7, 3, 8, 5};
        Arrays.sort(array);

        int min = array[0];
        int max = array[array.length -1];


    }
}
