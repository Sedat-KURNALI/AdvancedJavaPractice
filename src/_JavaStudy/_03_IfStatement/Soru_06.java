package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_06 {

    public static void main(String[] args) {

        /*   kullanıcıdan String number oluşturun.
             Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
             Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
             Aksi halde (else) "no money" yazdırın.
        */

        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        if (number.contains("€")) {
            System.out.println("This is euro");
        } else if (number.contains("$")) {
            System.out.println("This is dollar");
        } else {
            System.out.println("no money");
        }
    }
}
