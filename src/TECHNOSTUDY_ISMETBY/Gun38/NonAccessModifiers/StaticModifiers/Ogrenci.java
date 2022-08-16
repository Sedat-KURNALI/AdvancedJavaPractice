package TECHNOSTUDY_ISMETBY.Gun38.NonAccessModifiers.StaticModifiers;

public class Ogrenci {
    String ad;
    String soyad;
    static String okuladi = "Yıldırım";


    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.okuladi = okuladi;
    }

    void print() {
        System.out.println(ad + " " + soyad + " " + okuladi);
    }
}
