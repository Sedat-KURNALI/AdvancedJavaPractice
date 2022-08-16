package _JavaStudy._05_ForLoop.Cozumler;

import java.util.Scanner;

public class Soru_16 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner scan=new Scanner(System.in);

        int toplam=0;
        for(int i=1;i<=5;i++) // 5 kez sayı iste
        {
            System.out.print("Bir sayı giriniz = ");
            int sayi=scan.nextInt();

            if (sayi>5 && sayi<10) // 5 ile 10 arası-> 6,7,8,9
            {
                System.out.println("girdiğiniz sayı 5 ile 10 arası olduğundan toplanmayacak");
                continue;
            }

            toplam=toplam+sayi;
        }

        System.out.println("toplam = " + toplam);
    }
    // sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
// DEĞİLSE While kullanılır, ğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.
}
