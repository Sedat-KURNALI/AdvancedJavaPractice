package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_26 {  /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a =");
        int a = scan.nextInt();
        System.out.print("b =");
        int b = scan.nextInt();
        System.out.print("c =");
        int c = scan.nextInt();

        int delta = b * b - 4 * a * c;

        if (delta > 0) {
            System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
        } else if (delta == 0) {
            System.out.println("x = " + (-b / 2 * a));
        } else
            System.out.println("kök yoktur");
    }
}
