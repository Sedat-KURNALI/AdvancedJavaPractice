package TECHNOSTUDY_USA.day21;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    // create a method that will fill arrayList of integers with random numbers
    public static ArrayList<Integer> generateListOfRandomNumbers() {
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        list.add(random.nextInt(5));
        list.add(random.nextInt(5));
        list.add(random.nextInt(5));
        list.add(random.nextInt(5));

        return list;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = generateListOfRandomNumbers();
        System.out.println(list);

        Integer number = Integer.valueOf(1000);
        update(list, number); // number is Reference
        //update(list, 1000); 1000 is primitive here
        System.out.println(list);
    }

    // create a method that will update first element in arrayList
    public static void update (ArrayList<Integer> list, Integer newElement){
        list.set (0, newElement);

    }

}