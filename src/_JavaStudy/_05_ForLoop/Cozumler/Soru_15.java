package _JavaStudy._05_ForLoop.Cozumler;

import java.util.Scanner;

public class Soru_15 {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
         c harfine sıra gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("cümle giriniz : ");
        String cumle = scan.nextLine();

        int aMiktar = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.toLowerCase().charAt(i) == 'a') // B u g
                aMiktar++;
            else if (cumle.toLowerCase().charAt(i) == 'c')
                break;
        }

        System.out.println("aMiktar = " + aMiktar);
    }

}
