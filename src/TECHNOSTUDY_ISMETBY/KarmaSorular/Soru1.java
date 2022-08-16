package TECHNOSTUDY_ISMETBY.KarmaSorular;
// kullanıcıdan alınan sayının tersini yazan pr yazınız.

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Tersi alınacak bir sayı giriniz = ");
        int sayi = oku.nextInt();
        int tersiSayi = 0;

        while (sayi > 0) {
            int basamak = sayi % 10;
            tersiSayi = (tersiSayi * 10) + basamak;
            sayi = sayi / 10;
        }
        System.out.println("Tersi " + tersiSayi);
    }
    /*   girilen sayı 25431 olsun pr adımları aşağıdaki şekilde çalışır;
            basamak   sayı     tersiSayı
         1-     2     2345       2
         2-     5     234        25
         3-     4     23         254
         4-     3     2          2543
         5-     1     0          25431

     */
}
