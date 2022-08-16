package TECHNOSTUDY_USA.day17;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    //Part-1. fill array with random values using Random/Math.random, 0 <= random N <= 10
    // arrays size = 10

    //Part-2. check if an array of has 0, print => "it has zero"

    //Part-3. check if array has 10, print => "it has 10"

    //Part-4. check if array has 0 and 10, print => "it has zero and ten"

    //Part-4.1 check if array has 0 and 10, print => "it has zero and ten"
    // also print their indexes

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Part-1. fill array with random values using Random/Math.random, 0 <= random N <= 10
        System.out.println( "Part 1 ---------------------------" );
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt( 11 );
        }
        //1.way to print
        System.out.println( Arrays.toString( numbers ) );

        //2.way to print
        for(int number : numbers) {
            System.out.print( number + " " );
        }

        //part 2. check if an array of has 0, print => "it has zero"
        System.out.println( "\nPart 2 ---------------------------" );
        for(int number : numbers) {
            if(number == 0) {
                System.out.println( "it has zero" );
            }
        }
        //Part-3. check if array has 10, print => "it has 10"
        System.out.println( "\nPart 3 ---------------------------" );
        for(int number : numbers) {
            if(number == 10) {
                System.out.println( "it has ten" );
            }
       }

        //Part-4. check if array has 0 and 10, print => "it has zero and ten"
        System.out.println( "\nPart 4 -----------1st way----------------" );
        //1. way
        // 0, 1 , 2 , 3 , 0
        int zeroCounter = 0;
        int tenCounter = 0;
        for(int number : numbers) {
            if(number == 0) {
                zeroCounter++;
            } else if(number == 10) {
                tenCounter++;
            }
        }
        if(zeroCounter >= 1 && tenCounter >= 1) {
            System.out.println( "it has zero and ten" );
        }
        System.out.println( "\nPart 4 -----------2nd way----------------" );
        //2. way
        boolean hasZero = false;
        boolean hasTen = false;
        for(int number : numbers) {
            if(number == 0) {
                hasZero = true;
            } else if(number == 10) {
                hasTen = true;
            }
        }
        if(hasZero && hasTen) {
            System.out.println( "it has zero and ten" );
        }

    }

}