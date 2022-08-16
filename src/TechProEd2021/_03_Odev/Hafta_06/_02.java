package TechProEd2021._03_Odev.Hafta_06;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        /*
         Soru 2:
         Kullanicidan sayilar girmesini isteyin
         ve girdigi sayilari toplayip yazdirin.
         yeni sayi isteyin
         girilen sayilarin toplami 100 'u gecerse
         "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin

         */
        Scanner read=new Scanner(System.in);
        int toplam=0;
        int count=0;
        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            int sayi=read.nextInt();
            count++;
            toplam=toplam+sayi;}while (toplam<100);
        System.out.println(count+" "+"kere sayı girdin. bu kadar yeter");
    }
}
