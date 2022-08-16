package TECHNOSTUDY_ISMETBY.Gun44JavaTryCatchFinally_JavaMultiCatchBlok.JavaTryCatch;

import java.util.Scanner;

public class JavaRuntimeExceptionEx1 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz = ");
        int a = oku.nextInt();

        System.out.print("2. sayıyı giriniz = ");
        int b = oku.nextInt();

        System.out.println("a/b = " + a / b);
        //  a=5  b=3        a/b  cevap aliriz program sorunsuz calisir
        //  a=4  b=0        a/b   burda RunTimeEror Exeption oluyor
        //  a=3  b=fb       a/b  burda yine RunTimeEror oluyor
    }
}
