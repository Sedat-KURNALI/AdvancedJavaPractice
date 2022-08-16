package Replit.day_02;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// Kullanıcıdan karenin kenar uzunluğunu isteyin ve sonra bu karenin alan ve
		// çevresini hesaplayıp ekrana yazdıran bir program yazınız.
		// karenin alani a*a...cevresi 4a;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kenar uzunlugu giriniz");
		int kenar = scan.nextInt();
		
		if(kenar>=1) {
		
		int alan = kenar*kenar;
		int cevre = 4*kenar;
		
		System.out.println(alan);
		System.out.println(cevre);
		
		}else {
			System.out.println("Yanlis girdiniz");
		}
	

	
		

	}

}
