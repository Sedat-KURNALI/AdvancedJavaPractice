package TechProEd2021._01_JavaTechProEd.day08_ifelseifnestedif;

import java.util.Scanner;

public class C6_NestedIfOdeve {
	public static void main(String[] args) {
		// Kullan�c�dan 4 basamakli bir sayi girmesini isteyin.
		// Girdi�i sayi 5�e b�l�n�yorsa son rakam�n� kontrol edin.
		// Son rakam� 0 ise ekrana �5�e b�l�nen �ift say�� yazd�r�n.
		// Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
		// Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 4 basamakli bir sayi giriniz");

		int sayi = scan.nextInt();

		if (sayi >= 1000 && sayi <= 9999) {
			if (sayi % 5 == 0) {
				if (sayi % 10 == 00) {
					System.out.println("5'e bolunen cift sayi");

				} else {
					System.out.println("5'e bolunen tek sayi");
				}

			} else {
				System.out.println("tekrar deneyiniz");

			}

		} else {
			System.out.println("lutfen 4 basamakli bir sayi giriniz");
		}

		scan.close();

	}
}
