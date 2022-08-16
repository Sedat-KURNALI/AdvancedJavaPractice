package TECHNOSTUDY_USA.day5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // create java application that asks user
        // for username and password
      Scanner t1 = new Scanner(System.in);
     /*   System.out.println("What is your username: ");

        String userName = t1.nextLine();

        System.out.println("Your username is: " +userName);

        System.out.println("What is your Password: ");

        String password = t1.nextLine();

        System.out.println("Your Password is: "+password);
*/
/* Dos code:
import java.util.Scanner;

public class Task1 {
    // create java application that asks user
    // for username and password

    public static void main(String[] args) {
        Scanner readTextFromUser = new Scanner( System.in );
Part 1:
        System.out.println("Please enter your username:");
        String username = readTextFromUser.nextLine();

        System.out.println("Please enter your password:");
        String password = readTextFromUser.nextLine();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
 */
//Part 2:
// part 2 using number for password
        System.out.println( "Please enter your password:" );
        int password = t1.nextInt();

        t1.nextLine();
        System.out.println( "Please enter your username:" );
        String username = t1.nextLine();



        System.out.println( "Username: " + username );
        System.out.println( "Password: " + password );
    }
}
