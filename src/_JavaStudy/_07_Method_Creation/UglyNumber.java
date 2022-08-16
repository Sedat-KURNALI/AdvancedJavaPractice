package _JavaStudy._07_Method_Creation;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		/*Girilen bir say�n�n  ugly number olup olmad���n� kontrol etmek icin bir Java program� yaz�n.
		Say� sisteminde,  ugly number  sadece asal faktorleri 2, 3 veya 5 olan pozitif say�lard�r. 
		�lk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

		 */
		Scanner input =new Scanner(System.in);
		System.out.println("L�tfen Ugly Number giriniz");
		
		int n = input.nextInt();
		
		if(n<0) {
			System.out.println("L�tfen pozitif sayi giriniz");
		}
		int flag=0;
		while(n!=1) {
			if(n%5==0) { // 150 /5= 30 / 5 =6
				n/=5;
			}else if (n%3==0) { //6 /3 =2
				n/=3;
			}else if(n%2==0) {  //2 / 2 =1
				n/=2;
			}else {
				System.out.println("Ugly Number de�ildir.");
				flag=1;
				break;
			}
			
		}		
			if(flag==0)System.out.println(" Ungly Number!");
		

	}

}
