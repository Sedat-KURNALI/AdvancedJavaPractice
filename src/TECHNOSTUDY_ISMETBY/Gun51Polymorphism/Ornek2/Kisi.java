package TECHNOSTUDY_ISMETBY.Gun51Polymorphism.Ornek2;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;
    }

    public static void kimlikYaz(Kisi kisi) {
        //kisi ye hem Calisan hem de Ogrenci türünden nesne geliyor
        System.out.println("Ad=" + kisi.ad);
        System.out.println("Soyad=" + kisi.soyad);
        System.out.println("Görev=" + kisi.gorev);


        //1.yol

        //kisi Ogrenciden mimoluşturul muş?

        if (kisi instanceof Ogrenci) {
            System.out.println("Şubesi = " + ((Ogrenci) kisi).getSube());
        }
        if (kisi instanceof Calisan) {
            System.out.println("Departmanı = " + ((Calisan) kisi).getDepartman());
        }
        //2. yol
        if (kisi.getClass().getSimpleName().equalsIgnoreCase("Ogrenci")) {
            System.out.println("Şubesi = " + ((Ogrenci) kisi).getSube());
        }
        if (kisi.getClass().getSimpleName().equalsIgnoreCase("Calısan")) {
            System.out.println("Departmanı = " + ((Calisan) kisi).getDepartman());
        }
    }

}
