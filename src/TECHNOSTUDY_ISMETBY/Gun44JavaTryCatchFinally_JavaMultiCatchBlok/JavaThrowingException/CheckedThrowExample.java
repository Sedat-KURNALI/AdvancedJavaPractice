package TECHNOSTUDY_ISMETBY.Gun44JavaTryCatchFinally_JavaMultiCatchBlok.JavaThrowingException;

import java.io.IOException;
import java.util.Scanner;

public class CheckedThrowExample {

    // kullanıcıdan hava sıcaklığını isteyiniz.
    // ayrı bir metodda bunun kontrolünü yaparak hava
    // sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz
    // mainden çağırarak hatayı kontrol ediniz.

    public static void SicaklikKontrol(int sicaklik) throws IOException {
        // Eğer bir metod içerisinde Checked Throw var ise, metoda adına hata işareti
        // eklenmeden derlenmesine izin verilmez.Hata çizgisini üzerine gelindiğinde Add ...
        // a tıklandığınd aototmatik ekleyecektir.Bu şekidle bu metodu çağıran yerlerin try catch e
        // alınması garantiye alınmış olur.

        if (sicaklik < 10) {
            throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
        }
        System.out.println("Dışarıda basketbol oynayabilirsin");
    }

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Hava sıcaklığı = ");
        int sicaklik = oku.nextInt();

        try {
            SicaklikKontrol(sicaklik);
        } catch (IOException ex) {
            System.out.println("ex = " + ex);
        }
    }
}
