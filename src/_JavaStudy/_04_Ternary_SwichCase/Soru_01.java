package _JavaStudy._04_Ternary_SwichCase;

import java.util.Scanner;

public class Soru_01 {
    // Girilen bir sayının önce 100 den küçük ise, 100 den küçük yazsın
    // devamında 50 den küçük ise 50 den küçük yazsın
    // devamında 25 den küçük ise 25 den küçük yazsın.
    public static void main(String[] args) {


        Scanner oku = new Scanner(System.in);
        System.out.print("num =");
        int num = oku.nextInt();
        //String result = ( num < 100) ? ("100'den küçük"): (num <50 ? "50'den küçük" : num<25 ?"25 'den küçük");


        if (num < 100) {
            System.out.println("100 den küçük");

            if (num < 50) {
                System.out.println("50 den küçük");

                if (num < 25) {
                    System.out.println("25 den küçük");
                }

            }

        }

    }
}

