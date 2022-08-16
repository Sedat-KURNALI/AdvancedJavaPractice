package _JavaStudy._06_While_DoWhile;

import java.util.Scanner;

public class Soru_12 {
    public static void main(String[] args) {
        /*
         sayinin basamak degerlerinin toplamini while loop ile yapiniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(basamakToplama(sayi));


    }
    public static int basamakToplama(int sayi) {

        int toplam =0;
        while(sayi!=0){

            toplam += sayi%10;
            sayi/=10;

        }
        return toplam;

    }

}
