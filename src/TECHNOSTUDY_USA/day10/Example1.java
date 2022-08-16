package TECHNOSTUDY_USA.day10;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        /*
        Create scanner object
        Create one int
        if the budget is more then 7500
            print you can travel anywhere in the world

        else if budget is less then 7500 and more then 5000
            print you can travel anywhere except Australia

        else if budget is less then 5000 and more then 3000
            print you can travel US and europe

        else if budget is less then 3000
            print Stay ay home
         */
        Scanner hp = new Scanner(System.in);
        System.out.println("What is your budget:");
        int a = hp.nextInt();
        if(a>=7500){
            System.out.println("You can travel anywhere in the world");
        }else if(a<7500 && a>=5000){
            System.out.println("You can travel anywhere except Australia");
        }else if(a<5000 && a>=3000){
            System.out.println("You can travel US and europe");
        }else if(a<3000){
            System.out.println("Stay ay home");
        }
    }
}
