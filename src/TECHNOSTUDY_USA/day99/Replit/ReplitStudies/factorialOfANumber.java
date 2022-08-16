package TECHNOSTUDY_USA.day99.Replit.ReplitStudies;

import java.util.Scanner;

public class factorialOfANumber {
    /*
    Write a program to find the factorial value of any number entered through the scanner class.
Example:
number:4
factorial:1*2*3*4=24

number:5
factorial:1*2*3*4*5=120
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int useIntAsMax = scan.nextInt();

        //code start here
        int factorialValue = 1; // Factorial carpma oldugu icin 1 den basladik.

        // loop un amaci dongu olusturmak
        for (int i = 1; i <= useIntAsMax ; i++) {
            factorialValue *= i; // factorialValue = factorialValue * i
            // i=1 factorialValue =1
            // i=2 factorialValue =1*2=2
            // i=3 factorialValue =2*3=6
            // i=4 factorialValue =6*4=24
            //.
            //.
            //.
            //i=useIntAsMax  factorialValue = ? * useIntAsMax = ???
        }

        System.out.println(factorialValue);
    }
}
