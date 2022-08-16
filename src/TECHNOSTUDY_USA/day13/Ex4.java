package TECHNOSTUDY_USA.day13;

import java.util.Scanner;

public class Ex4 {

    // write program which checks if provide hacking code is correct
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        System.out.println("Write hacking code");
        int hackCode = input.nextInt();

        while(hackCode == 9999){   //while (true) loop u basa donder while(false) terminate.
            System.out.println("reaching secret data");
            hackCode = input.nextInt();
        }

    }

}
