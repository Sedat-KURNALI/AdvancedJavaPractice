package TechProEd2021._03_Odev.Hafta_04;

import java.util.Scanner;

public class _05 {

    /*
    Kullanıcıdan bir kelime girmesini isteyin. Sözcükte tek sayıda karakter ve
    3 veya daha fazla karakter içeriyorsa, kelimenin ortasındaki karakteri yazdırın.
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen  bir kelime giriniz : ");

        String name = scan.nextLine();
        if (name.length() >= 3 && name.length() % 2 != 0) {
            System.out.println(name.charAt(name.length() / 2));

        } else System.out.println("hatalı kelime girdiniz...");
    }
}





