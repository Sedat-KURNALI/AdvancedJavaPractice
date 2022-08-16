package _JavaStudy._02_StringManipulation;

import java.util.Scanner;

public class Soru24 {
    public static void main(String[] args) {
        /*Bir Stringin tersten ayni olup olmadigini bulunuz.  (Palindrom)
         *
         * ornek
         *  madam , nurses run  ==> palindromdur
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("bir string giriniz:");
        String str= scan.nextLine().replaceAll(" ", "").toLowerCase();

        palindrom(str);

        scan.close();
    }

    public static void palindrom(String str) {
        String strTers = "";

        for (int i = str.length()-1; i >=0; i--) {
            strTers = strTers + str.charAt(i);
        }
        if (strTers.equals(str)) {
            System.out.println("girilen string palindromdur");
        }else {
            System.out.println("girilen string palindrom degildir");
        }
    }
}
