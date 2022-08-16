package _JavaStudy._06_While_DoWhile;

import java.util.Scanner;

public class QuestionInterview {
	static int bolum=0;

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirelim. bolumu yazdiralim.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen bolunecek sayiyi giriniz");
		int bolunen = input.nextInt();
		System.out.println("Lutfen bolen sayiyi giriniz");
		int bolen = input.nextInt();
		
		//System.out.println("Bolme isleminin sonucu: " +bolme(bolunen,bolen));
//		bolum=bolum*10;
//		System.out.println(bolum);
		
		input.close();
		
		System.out.println("B�lme isleminin sonucu: " +bolme(bolunen,bolen));
	}
	public static int bolme(int bolunen,int bolen) {
		
		
		while(bolunen>=bolen) { //10= 10-2  					bolum
			bolunen-=bolen;//bolunen=bolunen-bolen 10 = 10-2  		1
													
			bolum++;				
		}
		//return bolum;
		
		return bolum;
		
		
	}

}


