package TECHNOSTUDY_USA.day16;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    //create an array of vegetables with size 5
    //provide names of vegetable using scanner
    // print them in one line using for-each loop
    //ex: Enter vegetable name: Tomato
    //    Enter vegetable name: Potato
    // Vegetables: Tomato, Potato
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
         String[] vegArr= new String[5];
        for (int i = 0; i < vegArr.length; i++) {
            System.out.println("Enter vegetable name: ");
            String a = input.nextLine();
            vegArr[i] = a;
        }
        System.out.println("Vegetables: "+ Arrays.toString(vegArr));
        //System.out.print( "Vegetables: " );
        //for(String vegetable : vegetables) {
        //System.out.print( vegetable + ", " );

*/
        // part 2, ask user how may vegetables s/he want to enter
        //ex:
        //    How many vegetables you want to provide: 2
        //    Enter vegetable name: Tomato
        //    Enter vegetable name: Potato
        //    Vegetables: Tomato, Potato

        Scanner input = new Scanner(System.in);
        System.out.println("How may vegetables you want to enter: ");

        int lenth = input.nextInt();
        String[] vegArr = new String[lenth];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vegArr.length; i++) {
            System.out.println("Enter vegetable name: ");
            String veggy = scan.nextLine();
            vegArr[i] = veggy;
        }
        System.out.println("Vegetables: " + Arrays.toString(vegArr));
        //System.out.print( "Vegetables: " );
        //for(String vegetable : vegetables) {
        //System.out.print( vegetable + ", " );
    }
}
