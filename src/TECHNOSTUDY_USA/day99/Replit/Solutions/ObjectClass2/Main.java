package TECHNOSTUDY_USA.day99.Replit.Solutions.ObjectClass2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Family fam = new Family();
        PhonePlan pl = new PhonePlan();

        Scanner input = new Scanner(System.in);
        int amountOfUser = input.nextInt();
        fam.amountOfUser = amountOfUser;
        input.nextLine();
        String familyName =input.nextLine();
        fam.familyName = familyName;
        String familyPrimaryUser = input.nextLine();
        fam.familyPrimaryUser = familyPrimaryUser;

        String planType = input.nextLine();
        pl.planType = planType;

        fam.getTotalAmount(pl);
        System.out.println(fam);
    }
}
