package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_20 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String kelime = scan.nextLine();
        String sesliHarf = "aeuüoöıiAEUÜOÖIİ";
        for (int i = 0; i <= sesliHarf.length(); i++) {
            if (kelime.charAt(0) == sesliHarf.charAt(i)) {
                System.out.println("sesli");
                break;
            } else {
                System.out.println("sessiz");
                break;
            }
        }
    }
}

