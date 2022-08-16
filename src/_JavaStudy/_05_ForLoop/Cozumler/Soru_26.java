package _JavaStudy._05_ForLoop.Cozumler;

import java.util.Scanner;

public class Soru_26 {



        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int toplam = 0;
            int count = 0;
            System.out.print("Lutfen sayi giriniz : ");
            for (int i = 0; i < 100; i++) {
                count++;
                int sayi = scan.nextInt();
                toplam+=sayi;
                if (toplam > 100) {

                    System.out.println(count + " kez say girdiniz bukadar yater");
                }
                System.out.println("Sayilarin toplami: " + toplam);
            }
        }
    }



