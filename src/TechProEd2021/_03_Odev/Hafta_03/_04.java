package TechProEd2021._03_Odev.Hafta_03;

import java.util.Scanner;

public class _04
    /*
    Kullanicidan 3 tane pozitif  tam sayi alalim
    bu uc sayidan ucgen olup olmama durumunu kontrol edelim
    eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim.

    * Ucgen olma kosullari.
    b+c>a>b-c  1
    a+c>b>a-c  1
    a+b>c>a-b 1

    * Eskenar ucgen olma kosullari.
    a=b=c

    Konsolda asagidaki durumlari yazdiralim.
    Eskenar ucgen
    Sadece ucgen
    Ucgen degildir
     */ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayı giriniz : ");
        int numA = scan.nextInt();

        System.out.print("Lütfen pozitif bir tamsayı giriniz : ");
        int numB = scan.nextInt();

        System.out.print("Lütfen pozitif bir tamsayı giriniz : ");
        int numC = scan.nextInt();

        if ((((numA + numB) > numC) && (numC > (numA - numB)))
                && (((numA + numC) > numB) && (numB > (numA - numC)))
                && (((numB + numC) > numA) && (numA > (numB - numC)))) {
            if (numA == numB && numB == numC) {
                System.out.println("ABC bir eşkenar üçgendir");
            } else System.out.println("ABC bir sadece üçgendir");
        } else {
            System.out.println("ABC bir üçgen değildir");
        }

    }
}
