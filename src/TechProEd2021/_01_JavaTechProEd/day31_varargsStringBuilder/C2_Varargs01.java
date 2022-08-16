package TechProEd2021._01_JavaTechProEd.day31_varargsStringBuilder;

public class C2_Varargs01 {

	public static void main(String[] args) {
		
		// verilen iki say�y� toplayan ve sonucu yazd�ran bir method yaz�n�z.
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		
		Toplama(sayi1,sayi2);  // method call
		
		// verilen 3 say�y� toplayan ve sonucu yazd�ran bir method yaz�n�z.
		
		Toplama(sayi1,sayi2,sayi3);
		
		// oyle  bir methot yazal�m ki i�ine ka� say� yazarsak yazal�m toplaya bilsin
		
		//toplama(2,3); // iki say�n�n toplam� methodu
		// toplama(2,5,8); // �� say�n�n toplam� methodu
		// istedi�imiz kadar say�n�n yazabilece�imiz methodu olu�turabilmemiz i�in
		// java varargs olu�turmu�
	}

	public static void Toplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("�� say�n�n toplam� : " + (sayi1+sayi2+sayi3));  //60
		
	}

	public static void Toplama(int sayi1, int sayi2) {

			System.out.println("�ki say�n�n toplam� : " + (sayi1+sayi2)); // 30
		
	}

}
