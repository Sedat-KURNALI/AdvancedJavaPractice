package TECHNOSTUDY_USA.day99.Replit.ReplitStudies;

import java.util.Scanner;

public class ifStatemenetTicketPrice {
    /*
It is a 45 speed zone.  *Extra Knowledge*
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int currentSpeed = scan.nextInt();

        // code start here

        int fine = 0; // { 2. VARIABLES BORN _ BEBEKLIK

        int s = currentSpeed;
        boolean driverLicenceAvailable = scan.nextBoolean();
        boolean dLA = driverLicenceAvailable;
        if (s >= 55 && s <= 74) fine = 100;
        else if (s >= 75 && s <= 84) fine = 150;
        else if (s >= 85 && s <= 94) fine = 320;
        else if (s > 94) fine = 500;
        if ( dLA == false ) fine += 200; // fine = fine + 200; // += extradan ekle

        System.out.println(fine); // } 1. TARGET IHTIYARLIK
    }
}
