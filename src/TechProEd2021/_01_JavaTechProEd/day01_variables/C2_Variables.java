 package TechProEd2021._01_JavaTechProEd.day01_variables;

public class C2_Variables {
	
	public static void main(String[] args) {
		
		int sayi; // ; yaz�m dilindeki . gibidir.java ; ->g�r�nce o sat�rdaki kod yaz�l�m�n�n bitti�ini anlar
		
		sayi=27;
		
		System.out.print(sayi); // println yerine print yazarsak yazd�rma i�leminden sonra alt sat�ra gecmez
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf); // println yaz�nca yazd�rma i�leminden sonra alt sat�ra ge�er
		
		double sayiDouble = 5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi + sayiDouble); //32.34
		
		System.out.print(sayi + ilkHarf); //27+77=104
		//E�er bir toplama i�leminde char de�i�ken kullan�l�rsa karakterin ascii de�eri ile toplama yapar	
	}
}
