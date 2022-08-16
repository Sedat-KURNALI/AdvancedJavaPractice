package TechProEd2021._01_JavaTechProEd.day18_whileLoop;

import java.util.Scanner;

public class C1_NestedForLoop01 {

	public static void main(String[] args) {
	/*	
	soru139 Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
	 1 2 3
	 2 4 6
	 3 6 9

		
		// 1.yol
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int num = scan.nextInt();
		
		for(int i=1; i <=num; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		scan.close();
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int rakam = scan.nextInt();
		
		for(int i=1; i <= rakam; i++) {
			for(int j=1; j <= rakam; j++) {
				System.out.print(i*j +" ");
			}
			System.out.println("");
		}
		scan.close();
		
		
	}

}
