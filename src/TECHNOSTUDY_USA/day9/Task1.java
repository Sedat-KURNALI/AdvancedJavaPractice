package TECHNOSTUDY_USA.day9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // read number from user, using nextLine()
        // parse it to integers
        // add 100 to number
        // print the number
        System.out.println("Provide a number:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
       //int i1 = Integer.valueOf(str);

       int i1 = Integer.parseInt( str );
        i1+=100;
        System.out.println(i1);


    }
}
