package TechProEd2021._03_Odev.Hafta_04;

import java.util.Scanner;

public class _06 {
    /*
    Kullanıcıdan firstName ve lastName'i girmesini isteyin, ardından baş harflerini
      büyük harf yapın ve geri kalanı tamamen kucuk harf olarak konsolda yazdirin.
      ferhat => Ferhat
      kirac => Kirac
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz : ");
        String firstName=scan.nextLine().toLowerCase();

        System.out.print("Lütfen soyadınızı giriniz : ");
        String lastName=scan.nextLine().toLowerCase();

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        System.out.println(firstName+" "+lastName);
    }
}
