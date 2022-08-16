package TechProEd2021._03_Odev.Hafta_05;

public class _02 {
       /*
a.	1-20 arasindaki -20 dahil olmak üzere-  çift sayıları yazdırın. e.g.2 4 6 .. 20


b.	1-20 arasindaki -20 dahil olmak üzere-  tek sayıları yazdırın. e.g 1,3,5,7,...,19 Virgul dahil!


c.	20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5

d.	1 - 20 arasındaki tüm çift sayıların toplamını bulun.


e.	11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue kullanin.
*/
    /* 1-20 arasindaki -20 dahil olmak üzere-  çift sayıları yazdırın. e.g.2 4 6 .. 20*/

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        /*1-20 arasindaki -20 dahil olmak üzere-  tek sayıları yazdırın. e.g 1,3,5,7,...,19 Virgul dahil!*/
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1)
                System.out.print(i + ",");
        }
        System.out.println();
        /*20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5*/
        for (int i = 20; i >= 1; i--) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        /*1 - 20 arasındaki tüm çift sayıların toplamını bulun.*/
        int toplam = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                toplam += i;
        }
        {
            System.out.print(toplam + " ");
        }
        System.out.println();
        /*11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue kullanin.*/
        for (int i1 = 1; i1 <= 20; i1++) {
            if (i1 == 11 || i1 == 15)
                continue;
            System.out.print(i1 + " ");
        }
        System.out.println();
// 2. yol
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        sayilarinToplami(number);
        tekSayi(number);
        ciftSayi(number);
        bolunebilen5(number);
        sayiAtla_11_15(number);
    }

    private static void sayiAtla_11_15(int[] number) {
        for (int i = 0; i < 20; i++) {
            if (number[i] == 11 || number[i] == 15)
                continue;
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    private static void ciftSayi(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println();
    }

    public static void bolunebilen5(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 5 == 0) {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println();
    }

    public static void tekSayi(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1) {
                System.out.print(number[i] + ",");
            }
        }
        System.out.println();
    }

    public static void sayilarinToplami(int[] number) {
        int toplam = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0)
                toplam += number[i];
        }
        {
            System.out.print(toplam + " ");
        }
        System.out.println();
    }

}

