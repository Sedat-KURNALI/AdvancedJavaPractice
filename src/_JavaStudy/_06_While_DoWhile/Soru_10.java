package _JavaStudy._06_While_DoWhile;

import java.util.Scanner;

public class Soru_10 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner oku=new Scanner(System.in);

        int sayac=0;
        int enb=0;

        while(sayac<5)
        {
            System.out.print("Sayı giriniz=");
            int sayi = oku.nextInt();

//            if (sayi > enb)
//                enb=sayi;

            enb=Math.max(enb, sayi); // yukarıdaki if li yapıya karşılık kullanılabilir.

            sayac++;
        }

        System.out.println("enb = " + enb);
    }
}


