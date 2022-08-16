package Replit.day_02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini hesaplayan bir
		// program yazınız.
		// Not: Dikdörtgenler Prizmasının Hacmi: En x Boy x Yükseklik

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen en-boy-yukseklik giriniz");
		int en = scan.nextInt();
		int boy = scan.nextInt();
		int yukseklik = scan.nextInt();
		
		hacimHesaplama(en,boy,yukseklik);
		
		
	}

	public static void hacimHesaplama(int en, int boy, int yukseklik) {
		
		while(en>=1 && boy>=1 && yukseklik>=1) {
			
			int hacim = en*boy*yukseklik;
			
			System.out.println(hacim);
			break;
		}
		
		
		
	}

}
