package TECHNOSTUDY_USA.day17;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        // Write a Java program to copy an array by iterating the array
        // fill second array with values of first array using loop

        // ex:
        //input
        // first array = {John, Ali}
        // second array = empty
        //output
        // second array = {John, Ali}


        //part 2. copy in reverse order
        // first array = {John, Ali}
        // second array = {Ali, John}

        String[] firstArray = {"John", "Ali", "Marta"};
        String[] secondArray = new String[firstArray.length];

        System.out.println("before copy");
        System.out.println("firstArray: "+ Arrays.toString(firstArray));
        System.out.println("secondArray: "+ Arrays.toString(secondArray));

        for(int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        System.out.println("after copy");
        System.out.println("firstArray: "+ Arrays.toString(firstArray));
        System.out.println("secondArray: "+ Arrays.toString(secondArray));

    }
}
