package _JavaStudy._01_DataType_ScannerClass;

import java.util.Scanner;

public class Soru_13 {
    /*
    Klavyeden okunacak bir e-mail adresindeki kullanıcı adını ve sunucu adını ekrana yazdıran
    bilgisayar programını Java dilinde yazınız.
    e-mail adresi örneği: alicanq@yhooo
    ekrana:
    kullaniciadi: alican
    sunucu: yhooo
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("emailinizi giriniz : ");
        String email = scan.nextLine();

        int index=email.indexOf('@');
        String kullaniciAdi=email.substring(0,index);

        String sunucu = email.substring(index+1,email.length());

        System.out.println("sunucunuz : "+sunucu);
        System.out.println("kullanıcı adınız : "+kullaniciAdi);

    }
}
