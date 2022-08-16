package _JavaStudy._02_StringManipulation;

import java.util.Scanner;

public class Soru29 {
    public static void main(String[] args) {
		/*
		Kullanicidan firstName ve lastName'i girmesini isteyin,
		ardindan bas harflerini buyuk harf yapin ve
		 geri kalani tamamen kucuk harf olarak konsolda yazdirin.
		ferhat => Ferhat
		kirac => Kirac
		          */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String firstName=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String lastName=scan.nextLine();

        String IsimilkHarf=firstName.substring(0,1).toUpperCase().concat(firstName.substring(1));
        String SoyisimilkHarf=lastName.substring(0,1).toUpperCase().concat(lastName.substring(1));
        System.out.println("firstname :"+ IsimilkHarf+ "\n" +"lastname :"+ SoyisimilkHarf);


        scan.close();
    }
}
