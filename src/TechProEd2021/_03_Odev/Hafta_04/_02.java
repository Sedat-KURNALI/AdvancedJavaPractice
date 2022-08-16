package TechProEd2021._03_Odev.Hafta_04;

import java.util.Scanner;

public class _02{
        /*
          Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Ay No giriniz :  ");
        int ayNo = scan.nextInt();

        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ay 31 gün...");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz ay 30 gün...");
                break;
            case 2:
                System.out.print("yıl =");
                int yil = scan.nextInt();
                if (yil % 4 == 0)
                    System.out.println("Girdiğiniz ay 29 gün...");
                else
                    System.out.println("Girdiğiniz ay 28 gün...");
                break;

            default:
                System.out.println("Hatalı ay girdiniz...");
        }
    }
}
