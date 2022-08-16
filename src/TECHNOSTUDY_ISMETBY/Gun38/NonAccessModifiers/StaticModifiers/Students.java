package TECHNOSTUDY_ISMETBY.Gun38.NonAccessModifiers.StaticModifiers;

public class Students {
    public static void main(String[] args) {
        Student ogr1 = new Student("ali", "yılmaz");
        Student ogre = new Student("sadi", "yıldırm");
        Student ogr3 = new Student("ayse", "demir");
        //...
        //,,,
        //,,,

        Student ogrrenci3 = new Student("malik", "kaya");
        System.out.println("Student.ogrencisayisi = " + Student.ogrencisayisi);
        System.out.println("ogr1= " + ogr1);
        System.out.println("ogre= " + ogre);
        System.out.println("ogr3= " + ogr3);
        System.out.println("ogrenci= " + ogrrenci3);
    }
}
// Static anahtar ının 3 adet kullanım amacı var.
// 1- Metoda ve fileda direk class üzerinden ulaşım.
// 2- Tekrarlanan ifadeler için hafızayı iyi kullanma
// 3- Oluşturulan nesneler için sayaç görevi için de kullanılır.