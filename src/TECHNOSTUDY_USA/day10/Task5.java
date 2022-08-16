package TECHNOSTUDY_USA.day10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*
            Scanner object
            String which is start level in the website
            _duzenle.TECHNOSTUDY_USA.example "4 star" , "5 star "

            int mile
                how far from the downtown

            remove the nun numeric characters from String
            then change the String to double

             if star is less then 3 and mile is > 5
                print this hotel is too far from city and it is not good

             else if star is more - equal then 3 and mile is less - equal to five
                print this hotel is perfect
         */
        Scanner hp = new Scanner(System.in);
        System.out.println("What is star level:");
        String star = hp.nextLine();
        String numStar =star.replaceAll( "[^\\d.]" , "" ); // [^\d.] remove all letters
        // [A-z] this will remove all the letters
        double d1 = Double.valueOf(numStar);
        System.out.println("Distance from downtown as mile:");
        int mile = hp.nextInt();



        if ( d1<3 && mile>5){
            System.out.println("this hotel is too far from city and it is not good");
        }else if(d1>=3 && mile<=5 ){
            System.out.println("this hotel is perfect");

        }
    }
}
