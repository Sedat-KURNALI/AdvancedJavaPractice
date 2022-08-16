package TECHNOSTUDY_ISMETBY.Gun44JavaTryCatchFinally_JavaMultiCatchBlok.JavaTryCatch;

import java.time.LocalDate;
import java.time.Month;

public class JavaTryCatch1 {
    public static void main(String[] args) {
        //bunları programcı yaptığı programın çalışılabilirliğini kullanıcıya hissettirmeden programını geliştirmek için  yapıyor
        try { // dene, hatanın başladığı yerin üstüne konur
            LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println(" işlem tamam");
        } // hatanın bittiği yerde parantez kapatılır
        catch (Exception hata) // hata isimli değişkende oluşan hataların bilgisi atanıyor
        {
            // hata olduğunda en yazpılacağı buraya yazılıyor.
//            System.out.HuseyinBYCalısma.println("hata oldu");
//            System.out.HuseyinBYCalısma.println("hata: " +   " tarih dönüşüm hatası");
            System.out.println("hata.getMessage() = " + hata.getMessage()); // hata mesajını verir
            hata.printStackTrace(); // hatanın geçtiği aşamaları yazar
        }

        System.out.println("Programın sonuna kadar gelindi.");

        try {
            // Java Öğren
        } catch (Exception hata) {
            // anlaşılamadı
            // hızlıca konuları tekrar et
            // zaman az
        }

        // Sonunda inş iyi bir meslek ve kazanç seni bekliyor.


    }


}
