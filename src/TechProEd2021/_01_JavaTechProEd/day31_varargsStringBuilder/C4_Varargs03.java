package TechProEd2021._01_JavaTechProEd.day31_varargsStringBuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
	
		// erilen int lerden ilki haric t�m say�lar� toplayan ve 
		// buldu�unuz toplam ile ilk say�y� carp�p sonucu yazd�r�n.
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		
		
	}
											// var sona getirdi�imizde hata gider (int..var, int sayi) olursa itraz eder
											// ��nk� varargs as�l y�k� �stlenmek ister
	public static void toplama(int sayi, int... var) { // date turundden sonra yazd���m�z ... varags kullanacag�m�z anlam�na gelir

		
		System.out.println("varargs a dahil olmayan argument " + sayi);	
																
												//toplam parentezlerinin i�inde ki ilk say� int say�s�na sonrakiler vararags al�r
		
		int toplam= 0;
		for (int each : var) {
			toplam+=each;
			              
			
		}
		System.out.println(sayi*toplam);
		
		
	}

}
