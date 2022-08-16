package _JavaStudy._06_While_DoWhile;

import java.util.Scanner;

public class Soru_03 {

    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku = new Scanner(System.in);
        String okunan = "";

        do {
            okunan = oku.nextLine();
            if (okunan.equalsIgnoreCase("x")) break; // break : döngü kırıyor

            System.out.println("Program çalışıyor");
        } while (!okunan.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");
    }
}
