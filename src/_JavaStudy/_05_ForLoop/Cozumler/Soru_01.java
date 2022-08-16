package _JavaStudy._05_ForLoop.Cozumler;

import java.util.Scanner;

public class Soru_01 {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(
                ("Fibonachi Serisini Kaç Elemana Kadar Gormek istersiniz? (Not: Maksimum 47 Seri gösterilebilmektedir.)"));
        int limit = scan.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        if (limit <= 47) {
            System.out.print(n1 + " " + n2);
            for (int i = 2; i < limit; i++) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        } else {
            System.out.println("Not: Maksimum 47 Seri gösterilebilmektedir.");
        }
    }
}
