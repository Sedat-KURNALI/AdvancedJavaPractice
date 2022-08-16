package TECHNOSTUDY_ISMETBY.Gun44JavaTryCatchFinally_JavaMultiCatchBlok.JavaTryCatch;

import java.util.Scanner;

public class Throw_AnahtarKelimesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();


        try {
            mekanKontrol(yas); // main de kontrole alarak hatayı yakalıyoruz...
        } catch (ArithmeticException e) {  // hangi hatayı verdirdiysek metodda burada onu kullanıyoruz.
            System.out.println("18 yaşından küçükler mekana giremez...");
        }


    }

    public static void mekanKontrol(int yas) {

        if (yas < 18) {
            throw new ArithmeticException(); // Unchecked Exception verdirdik.
        } else {
            System.out.println("Mekana hoşgeldiniz...");
        }

    }
}
