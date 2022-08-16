package TechProEd2021._01_JavaTechProEd.day33_encapsulation;

import TechProEd2021._01_JavaTechProEd.day20_scope.Scope1;
import TechProEd2021._01_JavaTechProEd.day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		
		// OOP concapt
		// Object Orianted Programing
		// Bir proje kapsam�ndaki class�lardan olu�turulan variable ve methodlar�n
		// classlarda tekrar tekrar yaz�lmamas�, var oldu�u classdan uretilerek
		// bu variable ve methodlar�n istendi�i kadar kulan�lmas�d�r. (reusability)
		// Write once reuse aanywhere(bir kere yaz heryerde �al��t�r)
		
		// scope6 class �ndaki variable mehotlara ula�mak istiyorum
		// bunun i�in Scope6 clas�ndan obje uretmeliyiz.
		
		
		Scope6 obj1= new Scope6();  //day21 deki
		//esitligin sol taraf� decleretion
		// declaration 2 parcad�r ilk parca Data turu , ikinci k�sm� isim
		//non-primative ler icin data turu ayn� zaman class isim olabilir
		//esitligin sag�nda ise deger, 2 parcadan olusur.
		// new keyword u ikincisi de constructor
		//hangi classtan obje uretmek istersek o class �n constructor�n� kullan�r�z.
		
		obj1.num1=10;
		System.err.println(obj1.num1);//10 objeye ait num1 10 oldu
		
		obj1.add();


		//deneme methodunu main method i�inden �ag�rabilir miyim?
		//deneme();  method u static olmad��� i�in main method tan direkt �a�r�lamaz
		//bunun yerine i�inde oldu�umuz class dan bir objhe uretip onun uzerinden
		// static olmayan methodlar da cag�rabiliriz
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme();
	
		
		
		
	}
	
	public void deneme() {
		
		// projemizin kapsam�na bulunan tum classlardan
		// public variable ve methodlara istedi�im yerden obje ureterek ulasabilirim.
		// eger ulasmak istedi�im class uyeleri(class member) public degilse baska 
		// package lerden ulasmak icin extra islem yapmam�z gerekir.
		// Class Member(Uye) = bir class icerisinde olan class seviyesindeki 
		// instance variable'lar,static variable'lar ve class methodlaridir.
		
		Scope1 obj2 = new Scope1(); //day20 deki
		obj2.isim = "Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.sayi=15;		
		obj2.method();
			
	// ben istedi�im class tan obje ureti oradaki public class uyelerine ula�abilirim
}
	

}
