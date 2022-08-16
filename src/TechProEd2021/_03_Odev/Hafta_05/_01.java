package TechProEd2021._03_Odev.Hafta_05;

import java.util.Scanner;

public class _01 {

    /*
     Kullanıcıdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez tekrarlandığını kontrol edin.
     e.g:
     char ch1= 'a' ;
     String name =“John came late"
=> Tekrar Sayisi = 2
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz : ");
        String cumle = scan.nextLine();
        System.out.print("Lütfen bir harf giriniz : ");
        char harf = scan.next().charAt(0);
        int count = 0;
        for (
                int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                count++;
            }
        }
        System.out.println(count);
    }
}


