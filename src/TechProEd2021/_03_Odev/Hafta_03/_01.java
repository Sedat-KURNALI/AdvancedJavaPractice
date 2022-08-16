package TechProEd2021._03_Odev.Hafta_03;

import java.util.Scanner;

public class _01 {

        /*
          Kullanicidan email girmesini isteyin
         @ isareti icermiyorsa “gecerli bir email girin” yazdirin
         @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
         @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail hesabinizi girin” yazdirin
         ORNEK:
         INPUT : techproed.com OUTPUT : “gecerli bir email girin”
         INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
         INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir email adresi giriniz : ");
        String text = scan.nextLine();

        boolean control = text.contains("@");
        int index = text.indexOf("@");

        if (!control) {
            System.out.println("Geçerli bir email giriniz : ");
        } else if (text.substring(index + 1).equals("gmail.com"))// else if (text.endsWith("gmail.com")) {
        {
            System.out.println("email onaylandi");
        } else
            System.out.println("Lutfen gmail hesabinizi girin");

    }
}
