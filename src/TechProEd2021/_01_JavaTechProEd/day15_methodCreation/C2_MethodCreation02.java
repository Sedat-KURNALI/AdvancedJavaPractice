package TechProEd2021._01_JavaTechProEd.day15_methodCreation;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {
		
		//Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
		//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin 
		//ve sayilarin toplamini yazdirin. Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse 
		//�Cok sayi girdiniz, ben toplayamam� yazdirin.
		//2'den k���k bir sayiyi girerse"En az 2 sayi girmelisiniz"
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ka� sayi toplamak istedi�ini giriniz");
		
		int adet= scan.nextInt();
		
		if (adet<2) {
			System.out.println("En az 2 sayi girmelisiniz");
			
		} else if (adet==2) {	
			ikiSayiTopla();
		
		}else if (adet==3) {
				ikiSayiTopla();
		
		}else if (adet==4) {
			dortSayiTopla();
		
		}else {
		System.out.println("�ok sayi girdiniz, ben toplayamam");	
		
		scan.close(); }


	}

	public static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 4 say� giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		double sayi3= scan.nextDouble();
		double sayi4= scan.nextDouble();
		
		System.out.println("d�rt say�n�n toplam�="+(sayi1+sayi2+sayi3+sayi4));
		scan.close();
		
	}

	public static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 sayi giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		double sayi3= scan.nextDouble();
		
		System.out.println("Uc sayinin toplami="+(sayi1+sayi2+sayi3));
		scan.close();
		
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 2 sayi giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		System.out.println("iki say�n�n toplam�="+(sayi1+sayi2));
		scan.close();
		
	}

}
