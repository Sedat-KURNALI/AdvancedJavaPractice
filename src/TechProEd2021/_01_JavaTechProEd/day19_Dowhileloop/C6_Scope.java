package TechProEd2021._01_JavaTechProEd.day19_Dowhileloop;

public class C6_Scope {
        // Bir class i�erisinde olu�turulan variable lar�n nerde ge�erli oldu�unu 
	    // ve nereden kullan�labildi�ini o variable in Scope u belirler.
	    //  google Java da scope nedir? 
	
	
	public static void main(String[] args) {
		int sayi=10;
		
		denemeMethod();
		sayi++;
		System.out.println(sayi);
		// System.out.println(isim);
		
	}

	public static void denemeMethod() {
		// sayi=20;
	//	String isim="Mehmet";		
	
		
	}

}
