package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_02 {

    public static void main(String[] args) {

        /*     kullanıcıdan alınıarak  int number oluşturun.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number == 0) {
            System.out.println("Im neutral");
        } else if (number > 0) {
            System.out.println("I m positive");
        } else {
            System.out.println("I am negative");
        }


    }
}
