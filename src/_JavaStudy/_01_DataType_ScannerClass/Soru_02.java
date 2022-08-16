package _JavaStudy._01_DataType_ScannerClass;

import java.util.Scanner;

public class Soru_02 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesi +b'nin karesi +3c

        Örnek Ekran Çıktısı
        a sayısını giriniz: 2
        b sayısını giriniz: 3
        c sayısını giriniz: 4
        sonuç : 25 */

        Scanner oku = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("a: ");
        a = oku.nextDouble();

        System.out.print("b: ");
        b = oku.nextDouble();

        System.out.print("c: ");
        c = oku.nextDouble();

        double toplam = (a * a) + (b * b) + (3 * c);
        System.out.println("Sonuç: " + toplam);


    }
}
