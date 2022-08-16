package TECHNOSTUDY_ISMETBY.Gun06Scanner;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız.
        Scanner oku = new Scanner(System.in);

        System.out.print("Adınızı ve Soyadınızı giriniz=");
        String adSoyad = oku.nextLine(); // Ekrandan bir satır okuyor
        System.out.println("adSoyad = " + adSoyad);
    }
}
