package TechProEd2021._01_JavaTechProEd.day16_forLoop;

import java.util.Scanner;


public class C1_ForLoop01 {
	public static void main(String[] args) {
		//kullan�c�dan pozitif 2 tam say� al�n
		// ald���m�z degerlerden k���k olandan ba�lay�p, b�y�k olana kadar
		//t�m say�lar� yanyana(virg�lleri ay�rarak) yazd�r�n
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen pozitif 2 tam say� giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		int kucukSayi=0;
		int buyukSayi=0;
		
		if (sayi1<0 || sayi2<0) { System.out.println("L�tfen pozitif tam say� giriniz");
			
		} else if (sayi1>sayi2) { 
			buyukSayi=sayi1;
			kucukSayi=sayi2;
		
		} else 
		 {
			buyukSayi=sayi2;
			kucukSayi=sayi1;
		}
		
		for (int i = kucukSayi; i <= buyukSayi; i++) {
			System.out.print(i+ ",");
			
		}
		
		
		scan.close();
		
	}
	
}

