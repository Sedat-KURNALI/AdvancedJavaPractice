package _JavaStudy._08_Arrays;

public class Soru_11 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage
		 * (dizi elemanlarinin ortalama de�erini hesaplayan ve
		 * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
		 * input[]= {1,2,3,4,5,6,7} 
		 * Output : 4
		 */
		
		int input[]= {1,2,3,4,5,6,7} ;		
		double toplam = 0;
		
		for (int each : input ) {
			toplam += each;
		}
		double ort = toplam /input.length;
		System.out.println("verilen array in ortalamasi =" +ort); //4.0
		
		for (int each : input ) { 
			if (each > ort)
		System.out.println("ortalamadan buyuk olanlar :" + each);
		
		}
		
	}

}
