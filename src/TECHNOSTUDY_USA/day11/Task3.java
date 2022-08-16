package TECHNOSTUDY_USA.day11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
    Write a Java program to calculate profit or loss
    Input:
        cost price: 1000
        selling price: 1500
    Output:
        Profit: 500
     */ /*My solution
        int costPrice = 1000;
        int sellingPrice = 1500;
int profit = sellingPrice-costPrice;
        System.out.println( profit>0 ? "Profit: "+profit : "No profit" );
*/ //Dos` solution
        Scanner input = new Scanner( System.in );
        System.out.print( "Cost price: $" );
        int costPrice = input.nextInt();

        System.out.print( "Selling price: $" );
        int sellingPrice = input.nextInt();

        int total = sellingPrice - costPrice;
        // 1. way
//        if(total >= 0) {
//            System.out.println( "Profit: $" + total );
//        } else {
////            System.out.println("Loss: $" + (total)); // it will give negative, so lets turn it to positive
//            System.out.println( "Loss: $" + Math.abs( total ) );
//            System.out.println( "Loss: $" + (-total) );
//        }

        //2. way
        String profitOrLoss = total >= 0 ? "Profit: $" : "Loss: $";
        System.out.println( profitOrLoss + Math.abs( total ) );



    }
}
