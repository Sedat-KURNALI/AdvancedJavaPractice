package TechProEd2021._01_JavaTechProEd.day24_arrays;

import java.util.Arrays;

public class C1_Arrays01 {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		String isim ="Ali";
		
		// java da birden fazla eleman� koyabilecegimiz (store) objektler vard�r.
		//Bug�n bunlardan ilkini ��renece�iz. 
		// array= tepsiye benzer
					
		int arr[] = {10,20,30};     // int [] arr seklinde kullan�labilir
									// bu �rnekte Array'�n elemanlar�n� direkt yazd���m i�in 
									// uzunluk belirtmeye bihtiya� kalmad�. 
									// bu kullan�mda max eleman say�s�(length) yazd�g�m�z eleman say�s�d�r
		
		System.out.println(arr);        //Array bir objedir.
										//Eger direk olarak Arrayi yazd�rmak isterseniz java 
										// referans� yazd�r�r.
		
		System.out.println(Arrays.toString(arr)); // [10, 20, 30]
		
		String takim[] = new String[7]; // [null, null null]
		System.out.println(Arrays.toString(takim));
		
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim)); // [Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));  // [Ali, Veli, Hasan]
		
		//takim[3]="Mehmet"; // java run time program�d�r, dolay�s�yla array program� �al��t�r�nca
							// olu�turulur. 41. sat�r syntax olarak hata olmad���n� CTE olmaz
		                    // program �al��t���ndaa 3.index olmad��� i�in RTE verir
		
		//Array daki bir eleman� updeta etme-de�i�tirme- 
		// velinin yerine kemal gelsin
		
		takim[1] = "Kemal";
		
		System.out.println(Arrays.toString(takim));// [Ali, Kemal, Hasan]
		
		//bir array'�n uzunlu�u nas�l bulabiliriz.
		
		System.out.println(takim.length); // 3
										  // Stringdeki length() idi Arrayde length
		
		//Array deki son elemani Mehmet yap�n dersek
		
		takim[takim.length-1]="Mehmet"; // length -1 son, length-2 yaparsak sondan bir �ncekine kayd�r�r ismi.
		System.out.println(Arrays.toString(takim));
		
		//eger array�n eleman say�s� tek ise ortadaki elemani Can yapal�m
		
		if(takim.length %2 ==1) {
			int ortaIndex= (takim.length-1)/2;
			takim[ortaIndex]="Can";	
		}
		
		System.out.println(Arrays.toString(takim));
		
		
		
	}

}
