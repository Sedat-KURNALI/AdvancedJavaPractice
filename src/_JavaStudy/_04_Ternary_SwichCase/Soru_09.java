package _JavaStudy._04_Ternary_SwichCase;

import java.util.Scanner;

public class Soru_09 {

    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi giriniz");
        int num = scan.nextInt();

        String result = (num > 99 && num < 1000) ? ("3 basamakli") : (num % 2 == 0 ? "3 basamaklı  çift sayı" : "3 basamaklı olmayan tek sayı");
        System.out.println(result);
//(şart) ? true:falese
    }
}