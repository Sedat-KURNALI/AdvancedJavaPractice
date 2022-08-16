package TECHNOSTUDY_USA.day10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //System.out.println(20%6);
        // 6 + 6 =12 + 6 =18 , 20 - 18 =2
        /*
        Task 3
        Create two ints ==>
        if First number must be bigger than second one
        Find the remainder from first to second one
        if the reminder is 4 ==> print number1 divide number2 is reminder 4
        if the reminder is 3 ==> print number1 divide number2 is reminder 3
        if the reminder is 2 ==> print number1 divide number2 is reminder 2
        if the reminder is 1 ==> print number1 divide number2 is reminder 1
        if the reminder is 0 ==> print number1 divide number2 is reminder 0

         */
        Scanner dp = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = dp.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = dp.nextInt();
        int k = a%b;
        if (b>a) {
            System.out.println("Number 1 must be bigger than number 2");
         }else if(k==4){
                System.out.println(a+"/"+b +": remainder is: "+k);
            }else if(k==3){
                System.out.println(a+"/"+b +": remainder is: "+k);
            }else if(k==2){
                System.out.println(a+"/"+b +": remainder is: "+k);
            }else if(k==1){
                System.out.println(a+"/"+b +": remainder is: "+k);
            }else if(k==0){
                System.out.println(a+"/"+b +": remainder is: "+k);
            }

        }

    }
