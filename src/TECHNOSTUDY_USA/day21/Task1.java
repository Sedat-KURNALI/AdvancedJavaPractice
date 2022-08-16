package TECHNOSTUDY_USA.day21;

import java.util.ArrayList;

public class Task1 {
    // Write a Java program to create a new array list,
    // add some colors (string) and print out the collection.

    // write a method to iterate through all elements in arrayList
    // and print in separate lines

    public static void printColors(ArrayList<String> colors) {
        System.out.println(colors);
    }


    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        printColors(colors);
        //printColorLines(colors);
        insertElementToFirstPosition(colors, "Pink");
        printColors(colors);

    }
    public static void printColorLines(ArrayList<String> colors){
        // 1. way
        for(String color : colors) {
            System.out.println(color);
        }
        //2nd way
        //for (int i = 0; i <colors.size() ; i++)
        //    System.out.println(colors.get(i));
    }
    public static void insertElementToFirstPosition(ArrayList<String> colors, String newColor){
        colors.add(0, newColor);
        printColorLines(colors);
    }
}