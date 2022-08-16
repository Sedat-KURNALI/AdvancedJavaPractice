package _JavaStudy._03_IfStatement;

import java.util.Scanner;

public class Soru_31 {
public static void main(String[] args) {
	
	/*
     * Kullanicidan uc basamakli bir sayi alin
     * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
     *
     *
     * Ornek : Inputs : 853
     * Output : Girdiginiz sayinin birler basamagi : 3
     *          Girdiginiz sayinin onlar basamagi : 5
     *          Girdiginiz sayinin yuzler basamagi : 8
     *
     *
     */
	
	//1.yol 
	/*Scanner scan= new Scanner(System.in);
	System.out.print("L�tfen 3 basamakl� bir giriniz=");
	int sayi = scan.nextInt();
	
	int birlerBasama��=sayi%10;
	int onlarBasama��=(sayi/10)%10;
	int y�zlerBasma��=sayi/100; 
	System.out.println("birler=" + birlerBasama�� );
	System.out.println("onlar=" + onlarBasama��);
	System.out.println("y�zler=" + y�zlerBasma��);
	
	scan.close();
	*/
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen uc basamakli bir sayi giriniz");
	int sayi = scan.nextInt();
	
	int yuzler = sayi/100, onlar = sayi/10%10, birler = sayi%10;
	
	//System.out.println(yuzler + " " + onlar + " " + birler);
	
	if(sayi>99 && sayi<1000){
		System.out.println("Girdiginiz sayinin birler basamagi : " + birler);
		System.out.println("Girdiginiz sayinin onlar basamagi : " + onlar);
		System.out.println("Girdiginiz sayinin yuzler basamagi :" + yuzler);
	}else{
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
	}
	
	scan.close();

	
	
}
}
