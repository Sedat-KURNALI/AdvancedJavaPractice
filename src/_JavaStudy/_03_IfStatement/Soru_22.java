package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_22 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Klavyeden iki sayı alarak bu sayıları mantıksal olarak karşılaştıran kod örneğini yazınız.
        Kullanılacak olan operatörler şunlardır: == , != , < , > , <= , >=

        Örnek Ekran Çıktıları:
        Birinci sayiyi giriniz: 5
        ikinci sayiyi giriniz: 10
        sayilar esit degildir
        sayilar farklidir
        ilk sayi kucuktur
        ikinci sayi kucuk degildir
        ilk sayi kucuk esittir
        ikinci sayi kucuk esittir

        Birinci sayiyi giriniz: 10
        ikinci sayiyi giriniz: 10
        sayilar esittir
        sayilar farkli degildir
        ilk sayi kucuk degildir
        ikinci sayi kucuk degildir
        ilk sayi kucuk esittir
        ikinci sayi kucuk esittir    */

        Scanner scanner = new Scanner(System.in);

        int sayi1;
        int sayi2;

        System.out.print("Birinci sayıyı girin: ");
        sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        sayi2 = scanner.nextInt();

        if (sayi1 == sayi2) {
            System.out.println("Sayılar eşittir.");
        } else {
            System.out.println("Sayılar eşit değildir.");
        }

        if (sayi1 != sayi2) {
            System.out.println("Sayılar farklıdır.");
        } else {
            System.out.println("Sayılar farklı değildir.");
        }

        if (sayi1 < sayi2) {
            System.out.println("İlk sayı küçüktür.");
        } else {
            System.out.println("İlk sayı küçük değildir.");
        }

        if (sayi1 > sayi2) {
            System.out.println("İkinci sayı küçüktür.");
        } else {
            System.out.println("İkinci sayı küçük değildir.");
        }

        if (sayi1 <= sayi2) {
            System.out.println("İlk sayı küçük eşittir.");
        } else {
            System.out.println("İlk sayı küçük eşit değildir.");
        }

        if (sayi1 >= sayi2) {
            System.out.println("İkinci sayı küçük eşittir.");
        } else {
            System.out.println("İkinci sayı küçük eşit değildir.");
        }

    }
}
