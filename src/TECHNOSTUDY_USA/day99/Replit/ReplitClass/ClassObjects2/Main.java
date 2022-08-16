package TECHNOSTUDY_USA.day99.Replit.ReplitClass.ClassObjects2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountOfUser = scan.nextInt();
        scan.nextLine();
        String familyName = scan.nextLine();
        String familyPrimaryUser = scan.nextLine();
        String planType = scan.nextLine();
        Family f1 = new Family();

        f1.amountOfUser = amountOfUser;
        f1.familyName = familyName;
        f1.familyPrimaryUser = familyPrimaryUser;

        PhonePlan p1 = new PhonePlan();
        p1.planType = planType;

        f1.getTotalAmount(p1);
        System.out.println(f1);
    }
}
    /*
  Use Main method here
  Create 4 scanner variable
    Integer - amountOfUser
    String - familyName
    String - familyPrimaryUser
    String - planType
  Create one object for each class
  While defining the instance variables use scanner variables
  Print the object
  For _duzenle.TECHNOSTUDY_USA.example:
      Scanner s1 = new Scanner(System.in);
       String familyNameFromScanner = s1.nextLine();
     Family f1 = new Family();
     f1.familyName =familyNameFromScanner;
  Print _duzenle.TECHNOSTUDY_USA.example
     System.out.println(f1);

     4
Testing6
Tester6
premium

    */

