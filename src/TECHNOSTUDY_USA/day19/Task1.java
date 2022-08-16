package TECHNOSTUDY_USA.day19;

import java.util.Arrays;

public class Task1 {
    // create a method that prints maximum number in given array

    // part 2. create a method that prints minimum number in given array

    // part 3. create a method that prints even numbers in given array

    // part 4. create a method that prints numbers in given array
    //         in decreasing order
    public static void main(String[] args) {
        int[] numbers = {6, 7, 4, 99, 1, 2, 5, 4, 3};
        printMax(numbers);
        printMin(numbers);
        printEvenNumbers(numbers);
        printDecreasingOrder(numbers);
    }

    // method that prints maximum number in given array
    public static void printMax(int[] array) {
        Arrays.sort(array);

        int lastIndex = array.length - 1;
        System.out.println("Max is: " + array[lastIndex]);
    }

    // method that prints minimum number in given array
    public static void printMin(int[] array) {
        Arrays.sort(array);

        int firstIndex = 0;
        System.out.println("Min is: " + array[firstIndex]);
    }

    // method that prints even numbers in given array
    public static void printEvenNumbers(int[] array) {
        for(int number : array) {
            if(number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    // part 4. create a method that prints numbers in given array
    //         in decreasing order
    public static void printDecreasingOrder(int[] array) {
        Arrays.sort(array);
        for (int i = array.length-1; i > 0; i--) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
}
