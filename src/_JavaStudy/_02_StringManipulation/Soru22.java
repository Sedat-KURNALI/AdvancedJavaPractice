package _JavaStudy._02_StringManipulation;

import java.util.Scanner;

public class Soru22 {
    public static void main(String[] args) {
        /*
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) .. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu m olarak giriniz :");
        double boy = scan.nextDouble();
        System.out.println("Lutfen kilonuzu kg olarak giriniz :");
        double kilo = scan.nextDouble();

        double vke = kilo/(boy*boy);


        System.out.println("Vucut kitle endeksi : "+ vke);

        scan.close();

    }
}
