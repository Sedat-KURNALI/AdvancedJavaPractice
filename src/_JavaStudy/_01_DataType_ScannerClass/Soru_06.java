package _JavaStudy._01_DataType_ScannerClass;

import java.util.Scanner;

public class Soru_06 {
    public static void main(String[] args) {

     /* Problem Tanımı
        Kullanıcıdan iki tarih okuyarak bu tarihler arasında kaç gün geçtiğini
        hesaplaya kodu yazınız. Örnek olarak kendi doğum tarihinizi ve
        bugünün tarihini girerek kaç gündür yaşadığınızı hesaplayınız.

        ip ucu: her 4 yılda bir artık yıl vardır (şubat 29 gündür),
        100'ün katı yıllarda artık yıl yoktur ve 400'ün katı yıllarda artık yıl vardır.

        Örnek Ekran Çıktısı
        Bugünün tarihini giriniz: 1 1 2017
        ikinci tarihi giriniz: 1 1 1979
        iki tarih arasında 13894 gün vardır.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum tarihinizi girin: ");
        int dogum = scanner.nextInt();
        System.out.print("Bugünün tarihini girin: ");
        int bugun = scanner.nextInt();
        int yasam_yili = bugun - dogum;
        int yasam_gunu = 365 * yasam_yili;
        int count=0;
        for (int i = dogum; i < bugun; i++) {
            if (((i % 100 == 0) && (i % 400 == 0) || (i%4==0)))
                count++;
        }
        System.out.println(yasam_gunu+count);
    }
}
