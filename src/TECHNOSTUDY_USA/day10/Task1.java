package TECHNOSTUDY_USA.day10;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

    /*
        Create two Strings

        if total of the two String length is more then 15
        print your Strings are too long

        if  total of the two String length is less then 15
        print your Strings are okay

     */
    Scanner dp = new Scanner(System.in);
        System.out.println("Enter the first string:");
    String name1 = dp.nextLine();
        System.out.println("Enter the second string:");
    String name2 = dp.nextLine();
        String name = name1.concat(name2);
        System.out.println(name);

        if(name.length()>15 ){
        System.out.println("Strings are too long");
    }
        if(name.length()<15){
        System.out.println("your Strings are okay ");
    }
}
}
