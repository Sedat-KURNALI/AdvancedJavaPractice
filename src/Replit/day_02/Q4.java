package Replit.day_02;

public class Q4 {

	public static void main(String[] args) {
		// Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan
		// bir program yazınız. (float kullanınız)
		// Not 1: pi sayısı: 3.14159
		// Not 2: Alan: 3.14159 x radius x radius
		// Not 3: Cevre: 2 x 3.14159 x radius
		
		float yaricap = 1;
		float pi = 3.14159f;
		
		
		if(yaricap>=1) {
			
		float alan = yaricap*yaricap*pi;
		float cevre = 2*yaricap*pi;
		
		System.out.println(alan);
		System.out.println(cevre);
		
		}else {
			System.out.println("Uzunluk negatif veya 0 olamaz");
		}


	}

}
