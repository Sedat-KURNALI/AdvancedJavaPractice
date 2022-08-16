package _JavaStudy._06_While_DoWhile;

public class Soru_15 {

//Bir top 220m yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin ¾ ü kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldığı yolu ve yere vurma sayısını bulunuz.

    public static void main(String[] args) {


        int vurmasayisi = 0;
        double yol = 220;
        for (double i = 220; i >= 1; i -= 0.25 * i) {
            yol += (i * 0.75) * 2;
            vurmasayisi++;
        }
        System.out.println("yol = " + yol);
        System.out.println("vurmasayisi = " + vurmasayisi);

        double mesafe = 220.0;
        int sekme = 0;
        double yukseklik = 220.0;
        while (yukseklik >= 1) {
            yukseklik = yukseklik * (0.75);
            sekme++;
            mesafe = mesafe + (2 * yukseklik);


        }
        System.out.println("sekme = " + sekme);
        System.out.println("Toplam mesafe = " + mesafe);
    }
}
