package _JavaStudy._01_DataType_ScannerClass;

import java.util.Scanner;

public class Soru_11 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        bir dik üçgenin iki dik kenarı girildiğinde, bu üçgenin alanını ve çevresini
        hesaplayan kodu yazınız.

        Örnek Ekran Çıktısı
        Birinci Kenarı Giriniz: 3
        İkinci Kenarı Giriniz: 4
        Üçgenin alanı : 6
        Üçgenin çevresi: 12
         */

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int h;
        int alan;
        int cevre;

        System.out.print("Üçgenin a kenar uzunluğunu giriniz: ");
        a = scanner.nextInt();

        System.out.print("Üçgenin b kenar uzunluğunu giriniz: ");
        b = scanner.nextInt();

        h = (int) Math.sqrt((a * a) + (b * b));

        alan = (a * b) / 2;
        cevre = a + b + h;

        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println("Üçgenin Çevresi: " + cevre);


    }
}
