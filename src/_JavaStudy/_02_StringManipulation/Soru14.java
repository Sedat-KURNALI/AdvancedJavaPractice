package _JavaStudy._02_StringManipulation;

import java.util.Scanner;

public class Soru14 {

    public static void main(String[] args) {
        /*
         * Kullanicidan 3 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : Ali, topu, tut
         *         Output : Ali topu tut.
         *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen cumle olusturmak icin bir kelime giriniz :");
        String kelime1 = scan.next();
        System.out.print("Lutfen cumle olusturmak icin bir kelime giriniz :");
        String kelime2 = scan.next();
        System.out.print("Lutfen cumle olusturmak icin bir kelime giriniz :");
        String kelime3 = scan.next();

        System.out.println(kelime1+" "+kelime2+" "+kelime3+".");

        scan.close();
    }

}
