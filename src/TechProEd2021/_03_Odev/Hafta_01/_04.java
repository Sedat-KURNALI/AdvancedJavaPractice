package TechProEd2021._03_Odev.Hafta_01;

import java.util.Scanner;

public class _04 {
    /*
     Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari toplamini
      konsolda yazdiran programi yaziniz.
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Üç basamaklı pozitif bir tamsayı giriniz : ");
        int number = scan.nextInt();
        if (number < 0 || number >= 999) {
            System.out.println("Lütfen üç basamaklı pozitif bir tamsayı  giriniz : ");
        } else {
            System.out.println("sayının basamakları toplamı = " + ((number / 100) + (number / 10 % 10) + (number % 10)));
        }
    }
}

