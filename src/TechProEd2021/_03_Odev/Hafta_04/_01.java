package TechProEd2021._03_Odev.Hafta_04;

import java.util.Scanner;

public class _01 {

        /*
           Kullanıcının girmiş olduğu A,B,C,D,F notlarının karşılığını yazdıran Switch Case java kodunu yazınız.
           A	Excellent
           B	Good
           C	Average
           D	Deficient
           F	Failing
		 */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen A,B,C,D ve F harflerinden birini giriniz");
        char harf = scan.next().toUpperCase().charAt(0);
        switch (harf) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Deficient");
                break;
            case 'F':
                System.out.println("Failing");
            default:
                System.out.println("gecersiz harf");
        }
    }
}
