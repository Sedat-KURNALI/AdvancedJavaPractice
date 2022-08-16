package TECHNOSTUDY_USA.day11;

import java.util.Random;

public class JavaRandom {
    public static void main(String[] args) {
        //Math.random() gives random number between 0.0 and 1.0
        System.out.println("\nrandom: "+ Math.random());

        // how to get integer number from random
        double r1 =Math.random();
        // to get number between 0-10
        int r2 = (int) (r1*10);
        System.out.println("\nr1 double: "+ r1);
        System.out.println("r2 integer: "+ r2);

        Random random = new Random();
        int randomInt = random.nextInt(10);
        System.out.println("Random int: "+randomInt);
    }
}
