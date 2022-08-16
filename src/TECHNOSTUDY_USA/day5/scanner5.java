package TECHNOSTUDY_USA.day5;

import java.util.Scanner;

public class scanner5 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner (System.in);
// boolean -> true and false
        // create one boolean and do you want an insurance print the boolean
        System.out.println("do you want an insurance");
        boolean ins = s1.nextBoolean();
        System.out.println("Your respond to insurance question: "+ins);

        // create boolean Do you want two way ticket
        System.out.println("do you want two way ticket:");
        boolean ticket = s1.nextBoolean();
        System.out.println("Your respond to two way ticket question is: "+ticket);

    }
}
