package TECHNOSTUDY_USA.day21;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    // create a method that will fill arrayList of integers with random numbers
    public static void main(String[] args) {
        getListWithRandomNumbers();

    }

    public static void getListWithRandomNumbers() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            //System.out.println(randomNumber); bu satir sadece for loop un icerisinde yazdirir
            list.add(randomNumber);
        }
        print(list);
    }

    public static void print(ArrayList<Integer> intArray) {
        // 1. way
        for (Integer intArr : intArray) {
            System.out.print(intArr + " ");
        }
    }
}
