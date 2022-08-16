package TECHNOSTUDY_USA.day10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create one int
        How many rooms you need
        if int more than 3 print We don`t have any apartments more than 3 rooms

        else if int is equals 3
        REnt is 2500

        else if int is equal to 2
        Rent is 2000

        else if int is equal to 1
        Rent is 1500

        else if int is equal to 0
        Rent is 1100
         */
        Scanner dp = new Scanner(System.in);
        System.out.println("How many rooms you need?:");
        int i = dp.nextInt();

        if (i > 3) {
            System.out.println("We don`t have any apartments more than 3 rooms");
        } else if (i == 3) {
            System.out.println("Rent is 2500");
        } else if (i == 2) {
            System.out.println("Rent is 2000");
        } else if (i == 1) {
            System.out.println("Rent is 1500");
        } else if (i == 0) {
            System.out.println("Rent is 1100");
        }
        //            THIS ONE IS ALSO OTHER WAY TO SOLVE THE QUESTION
//        int rent = 0;
//        if(roomCount>3){
//            System.out.println("we dont have any apartments more then 3 rooms");
//
//        }else if(roomCount == 3){
//            rent = 2500;
//
//        }else if(roomCount == 2){
//            rent = 2000;
//
//        }else if(roomCount == 1){
//            rent = 1500;
//
//        }else if(roomCount == 0){
//            rent = 1300;
//        }
//
//        System.out.println("Your rent will be " + rent );
    }
}