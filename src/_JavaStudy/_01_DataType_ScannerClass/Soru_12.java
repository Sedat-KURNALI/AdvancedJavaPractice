package _JavaStudy._01_DataType_ScannerClass;

import java.util.Scanner;

public class Soru_12 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gideceğiniz yol mesafesi(km): ");
        int yol = scanner.nextInt();

        System.out.print("Ortalama Hızınız(km/sa): ");
        int ort_hiz = scanner.nextInt();

        float varis_suresi = yol / (float) ort_hiz;
        System.out.print("Varış süreniz: " + varis_suresi + " saat");


    }
}
