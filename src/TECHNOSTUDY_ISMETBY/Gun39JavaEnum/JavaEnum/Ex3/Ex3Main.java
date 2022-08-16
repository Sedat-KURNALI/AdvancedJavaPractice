package TECHNOSTUDY_ISMETBY.Gun39JavaEnum.JavaEnum.Ex3;

// 1- Bir Kitap sınıfı yazınız, fields : name ve kategori(Enum)
// 2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
// 3- 2 kitap tanımlayınız bir ArrayList e atınız.
// 4- bir kategoriye listeletiniz.

import java.util.ArrayList;

public class Ex3Main {

    public static void main(String[] args) {
        Kitap ktp1 = new Kitap();
        ktp1.name = "sefiller";
        ktp1.kategori = KitapKategori.ROMAN;

        Kitap ktp2 = new Kitap();
        ktp2.name = "beyaz zambaklar";
        ktp2.kategori = KitapKategori.ROMAN;

        ArrayList<Kitap> kitaplar = new ArrayList<>();
        kitaplar.add(ktp1);
        kitaplar.add(ktp2);

        for (Kitap k : kitaplar) {
            if (k.kategori == KitapKategori.ROMAN) {
                System.out.println("k.name = " + k.name);
            }
        }
    }
}
