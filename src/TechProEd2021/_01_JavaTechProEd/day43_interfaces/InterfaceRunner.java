package TechProEd2021._01_JavaTechProEd.day43_interfaces;

public class InterfaceRunner implements Interface02{

	public static void main(String[] args) {
		
		// static olarak tan�mlanm�� bir veriable veya method ba�ka classlardan 
		// classIsmi.methodIsmi seklinde �agr�labilir.
		
		
		Interface02.deneme2();   //static keyword'lu method calisti
		
		// default keyword ile olu�turdu�umuz method ise 
		// obj �zerinden �a�r�labilir
		
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();   // deneme methodu olmad��� i�in �a��rmad�...  implements Interface02 yap�nca �a��rma ger�ekle�ti
        
		
		
		
	}

}
