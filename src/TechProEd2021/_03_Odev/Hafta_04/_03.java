package TechProEd2021._03_Odev.Hafta_04;

import java.util.Scanner;

public class _03{
    /*
        Ternary kullanarak:
		int variable : FIYAT
		string variable : Secim (String Secim=.....)
		price = $10 ise Print “UCUZ”
		price 10-$20 arasi ise Print “UCUZ”
		diger durumlar icin “PAHALI” yazdirin.
	*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen fiyatı giriniz : ");

        int price=scan.nextInt();
        String Secim = (price==10?"UCUZ" : price>10&&price<20 ? "UCUZ" : "PAHALI");
        System.out.println(Secim);
    }
}
