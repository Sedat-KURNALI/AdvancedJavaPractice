package TECHNOSTUDY_USA.day5;

import java.util.Scanner;

public class scanner3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        // Scanner let us to type in the console.

        // Create one String and store the email and print your email
        System.out.println("Enter your email ");
        String myEmail = scanner.nextLine();
        System.out.println("Your email is " +myEmail);

        //      Create one int and store the total count of your family members
*/
        System.out.println("How many family members in your household");
        int familyMember = scanner.nextInt();
        System.out.println("Your family members in your household " +familyMember);

//      Create one String and store the name of your player and print them
        System.out.println("Who is your favorite player name:");
        scanner.nextLine(); // we need to use this line after entered integers
        String favPlayer = scanner.nextLine();
        System.out.println("Your favorite player name: " +favPlayer);

    }
}
