package _JavaStudy._01_DataType_ScannerClass;

import java.util.Scanner;

public class Soru_14 {

	public static void main(String[] args) {
		/*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut 
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("v�cut a��rl���=");  double agirlik = scan.nextDouble();
		System.out.print("boy uzunlu�u=");  double uzunluk = scan.nextDouble();
		
		uzunluk =uzunluk /100;  //uzunluk/=100
	
		double vke= agirlik /(uzunluk*uzunluk);
		
		System.out.println("vucut kitle indeksi (VKI)= " + Math.round(vke));
		
		
		scan.close();
		

		
		
		
		
	}

}
