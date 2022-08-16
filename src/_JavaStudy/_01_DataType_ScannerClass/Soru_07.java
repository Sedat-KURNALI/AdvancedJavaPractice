package _JavaStudy._01_DataType_ScannerClass;

import java.util.Scanner;

public class Soru_07 {

    public static void main(String[] args) {

     /*
        Problem Tanımı
        Kullanıcıdan bugünün’ün tarihini ve kaç yaşında olduğunu alarak
        doğum tarihini yıl olarak bulan kod yazınız.

        Örnek Ekran Çıktısı
        Bugünün tarihini giriniz: 1
        1
        2017
        ikinci tarihi giriniz: 1
        1
        1979
        iki tarih arasında 13894 gün vardır.
     */

        Scanner scanner = new Scanner(System.in);

        int bugun;
        int yas;

        System.out.print("Bugünün tarihini giriniz: ");
        bugun = scanner.nextInt();

        System.out.print("Kaç yaşındasınız: ");
        yas = scanner.nextInt();

        int dogum_yili = bugun - yas;
        System.out.println("Doğum Tarihiniz: " + dogum_yili);
    }

}
