package TECHNOSTUDY_ISMETBY.Gun07StringMethods_1;

public class StringLength {
    public static void main(String[] args) {
        //12345678901234567890
        String cumle = "Bu gün hava yağmurlu";
        //bütün karakterlerin adedi (boşluklarda karakterdir.)

        int uzunluk = cumle.length();

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk = " + cumle.length());
    }
}
