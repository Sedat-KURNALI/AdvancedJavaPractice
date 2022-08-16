package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_03 {

    public static void main(String[] args) {

 /*  kullanıcıdan alacağınız int number için
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("number is a EVEN number");
        }
        if (number % 2 != 0) {
            System.out.println("number is a ODD number");
        }


    }
}
