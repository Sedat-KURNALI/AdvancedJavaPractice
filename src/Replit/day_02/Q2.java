package Replit.day_02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız.  kup==> kenar*kenar*kenar;

		Scanner java = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = java.nextInt();
		
		kupHesaplama(sayi);
	}

	public static void kupHesaplama(int sayi) {
		
		int kup = sayi*sayi*sayi;
		System.out.println(kup);
		
		
	}

}
