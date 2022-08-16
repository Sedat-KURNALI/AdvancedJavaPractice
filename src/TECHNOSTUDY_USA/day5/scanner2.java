package TECHNOSTUDY_USA.day5;

import java.util.Scanner;

public class scanner2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Type variable = new Type ();

        System.out.println("Enter your address:");
        String address = input.nextLine();

        System.out.println("Your address is " + address);
        //      Create one string and use scanner to type in the console
        //         city -> String name

        String city = input.nextLine();

        System.out.println("Your current city is " + city);

//       how to store in the int  -> nextInt()
        int zipCode = input.nextInt();

        System.out.println("Your zip code is " + zipCode);
/*
 Scanner is a class for getting the input of the primitive types like int, boolean and also String.
 It is the easiest way to
 */
// how to store in the int
        int myAge = input.nextInt();

        System.out.println("My age is " + myAge);

//        Please create one String,Enter the country, Print the country

        input.nextLine();
        String myCountry = input.nextLine();
        System.out.println("My Country is " + myCountry);
    }
}
