package TECHNOSTUDY_ISMETBY.Gun51Polymorphism.Ornek2;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Özal", "Soyad", "öğrenci", "4a");
        Calisan cal1 = new Calisan("Faruk", "Soyad", "öğretmen", "eğitim");

        Kisi.kimlikYaz(ogr1);
        Kisi.kimlikYaz(cal1);

        //ogr1 nesneinin ait olduğu class ın basit adı simplename metodu ile yazdırdıkmak için
        System.out.println(ogr1.getClass().getSimpleName());
        //ogr1 nesneinin ait olduğu class ın üst(süper) classının adı simplename metodu ile yazdırdıkmak için

        System.out.println(ogr1.getClass().getSuperclass().getSimpleName());
    }
}
