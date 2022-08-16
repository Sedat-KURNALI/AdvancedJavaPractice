package TECHNOSTUDY_USA.day10;

import java.util.Scanner;

public class andOrOperators {
    public static void main(String[] args) {
        /*
        && -> and operator both conditions should be correct otherwise incorrect
        // -> or operator

        TechnoStudy
         */
        String name = "TechnoStudy";
        if(name.length()>10 && name.contains("Study")){

            System.out.println("It looks good");
        }
/*
Two strings
1st string is username
2nd string is password

if username contains password
and password is less than 5

 */
        Scanner df = new Scanner(System.in);
        System.out.println("Enter the username:");
        String username = df.nextLine();
        System.out.println("Enter the password:");
        String password = df.nextLine();
        if(username.contains(password) && password.length()<5){
            System.out.println("Your password is not accepted");
        }
        /*
        Or //
        + - = +
        - + = +
        + + = +
        - - = -
         */
    }
}
