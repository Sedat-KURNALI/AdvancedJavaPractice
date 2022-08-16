package TECHNOSTUDY_USA.day12;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        // write a program that prints word representation of your number
        //      where number is 0 <= N <= 5
        // ex: 0 => zero
        // ex: 3 => three
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number between 0 to 5: ");
        int a = scan.nextInt();

        switch (a){
            case 0 :
                System.out.println(a+"=> zero" );
                                                break;
            case 1 :
                System.out.println(a+"=> one" );
                                                break;
            case 2 :
                System.out.println(a+"=> two" );
                                                break;
            case 3 :
                System.out.println(a+"=> three" );
                                                break;
            case 4 :
                System.out.println(a+"=> four" );
                                                break;
            case 5 :
                System.out.println(a+"=> five" );
                                                break;
        }


    }
}
