package TechProEd2021._03_Odev.Hafta_04;

import java.util.Scanner;

public class _07 {
    /*
    StringMethods:
           Çift uzunlukta bir degiskenin ilk yarısını konsolda yazdirmak için bir Java programı yazıniz.
           ORNEK:
               INPUT :  Python
               OUTPUT :   Pyt
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String kelime=scan.nextLine();
        if (kelime.length()%2 ==0) {
            System.out.println(kelime.substring(0,kelime.length()/2));
        }
    }
}
