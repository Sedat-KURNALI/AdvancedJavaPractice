package TECHNOSTUDY_ISMETBY.Gun06Scanner;


import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        //int    sayi=0;  // bunu tanımladığımız gibi aşağıda tanımlıyoruz
        Scanner oku = new Scanner(System.in); // Klavyeden veri girişi yapılacak.

        System.out.print("Bir sayi giriniz=");
        int sayi = oku.nextInt(); // okuma işlemi burada kursör bekliyor
        System.out.println("sayi = " + sayi);

    }
}
