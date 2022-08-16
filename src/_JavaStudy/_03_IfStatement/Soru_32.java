package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_32 {

	public static void main(String[] args) {
		/*Kullan�c� taraf�ndan girilen bir say�n�n
		 *mutlak de�erini yazd�rmak i�in bir program yaz�n.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz=");
		int sayi = scan.nextInt();
		
		// System.out.println("say�n�n mutlak de�eri=" + Math.abs(sayi));
		
		 if (sayi < 0) {
           System.out.println("mutlak de�eri=" + sayi*(-1));
        }
        else {
            System.out.println("mutlak de�eri=" +sayi);
        }
 
		scan.close();
		
		
		
		
		
		
	}

}
