package TECHNOSTUDY_USA.day17;

import java.util.Arrays;

public class Task3 {

    //Write a Java program to copy an array by iterating the array
    public static void main(String[] args) {
        int[] array_A = {11, 12, 13, 14, 15};
        int[] array_B = new int[array_A.length];

        System.out.println("before: ------------");
        System.out.println("array_A: "+ Arrays.toString(array_A));
        System.out.println("array_B: "+ Arrays.toString(array_B));

        for(int i = 0; i < array_A.length; i++) {
            array_B[i] = array_A[i];
        }
        System.out.println("\nafter : ------------");
        System.out.println("array_A: "+ Arrays.toString(array_A));
        System.out.println("array_B: "+ Arrays.toString(array_B));
    }
}
