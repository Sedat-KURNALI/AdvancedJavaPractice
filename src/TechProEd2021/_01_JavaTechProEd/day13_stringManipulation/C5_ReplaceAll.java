package TechProEd2021._01_JavaTechProEd.day13_stringManipulation;

public class C5_ReplaceAll {
    public static void main(String[] args) {

        String str= "Java ogren mutlu ol, Java candir 12345";
        System.out.println(str.replace("Java", "hava"));

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        System.out.println(str.replaceAll("\\w", "*")); // tum harf ve rakamlar yerine * yazacak
        System.out.println(str.replaceAll("\\W", "*")); // w'nun tersi
        System.out.println(str.replaceAll("\\d", ".")); // sayilari . yapar
        System.out.println(str.replaceAll("\\D", ".")); // sayi olmayanlari . yapar
        System.out.println(str.replaceAll("\\s", "&")); // bosluklari & yapar
        System.out.println(str.replaceAll("\\S", "&")); // bosluk olmayan herseyi & yapar
        System.out.println(str.replaceAll("\\d" , "")); // sayilari siler


    }
}
