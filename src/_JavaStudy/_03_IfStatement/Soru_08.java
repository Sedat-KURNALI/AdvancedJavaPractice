package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_08 {

    public static void main(String[] args) {

      /*
         Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır
     */

        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();

        int max = i1;

        if (i2 > max)
            max = i2;

        if (i3 > max)
            max = i3;
        System.out.println(max);


        /*
        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.print("a değeri =");
        int a = oku.nextInt();

        System.out.print("b değeri =");
        int b = oku.nextInt();

        System.out.print("c değeri =");
        int c = oku.nextInt();

        int enb = Math.max(a,b);
        enb = Math.max(enb, c);
        System.out.println("enb = " + enb);

        System.out.println("enb = " + Math.max(Math.max(a, b), c));
         */
    }
}
